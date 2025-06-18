/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.AlunoModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ALUNO
 */
public class AlunoController {
// Cadastrar aluno

    public boolean cadastrarAluno(AlunoModel aluno) {
        String sql = "INSERT INTO Aluno (nome, livrosEmDivida, livrosEmprestados, livrosDevolvidosA, matricula, Turma_idTurma, dataDevolucao) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = ConexaoComBancoDados.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, aluno.getNome());
            stmt.setInt(2, aluno.getLivrosEmDivida());
            stmt.setInt(3, aluno.getLivrosEmprestados());
            stmt.setInt(4, aluno.getLivrosDevolvidosA());
            stmt.setInt(5, aluno.getMatricula());
            stmt.setInt(6, aluno.getTurmaId());
            stmt.setString(7, aluno.getDataDevolucao());

            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar aluno: " + e.getMessage());
        }
        return false;
    }

    // Listar alunos com dados da turma (INNER JOIN)
    public List<AlunoModel> listarAlunos() {
        List<AlunoModel> alunos = new ArrayList<>();
        String sql = "SELECT a.*, t.codigoTurma, t.turno FROM Aluno a INNER JOIN Turma t ON a.Turma_idTurma = t.idTurma";

        try (Connection conn = ConexaoComBancoDados.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                AlunoModel aluno = new AlunoModel();
                aluno.setIdAluno(rs.getInt("idAluno"));
                aluno.setNome(rs.getString("nome"));
                aluno.setLivrosEmDivida(rs.getInt("livrosEmDivida"));
                aluno.setLivrosEmprestados(rs.getInt("livrosEmprestados"));
                aluno.setLivrosDevolvidosA(rs.getInt("livrosDevolvidosA"));
                aluno.setMatricula(rs.getInt("matricula"));
                aluno.setTurmaId(rs.getInt("Turma_idTurma"));
                aluno.setDataDevolucao(rs.getString("dataDevolucao"));
                // Você pode criar também um campo extra se quiser mostrar turno e códigoTurma
                alunos.add(aluno);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar alunos: " + e.getMessage());
        }

        return alunos;
    }

    // Atualizar aluno
    public boolean atualizarAluno(AlunoModel aluno) {
        String sql = "UPDATE Aluno SET nome=?, livrosEmDivida=?, livrosEmprestados=?,"
                + " livrosDevolvidosA=?, matricula=?, Turma_idTurma=?, dataDevolucao=?"
                + " WHERE idAluno=?";
        try (Connection conn = ConexaoComBancoDados.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, aluno.getNome());
            stmt.setInt(2, aluno.getLivrosEmDivida());
            stmt.setInt(3, aluno.getLivrosEmprestados());
            stmt.setInt(4, aluno.getLivrosDevolvidosA());
            stmt.setInt(5, aluno.getMatricula());
            stmt.setInt(6, aluno.getTurmaId());
            stmt.setString(7, aluno.getDataDevolucao());
            stmt.setInt(8, aluno.getIdAluno());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Aluno atualizado com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar aluno: " + e.getMessage());
        }
        return false;
    }

    // Excluir aluno
    public boolean excluirAluno(int idAluno) {
        String sql = "DELETE FROM Aluno WHERE idAluno=?";
        
        try (Connection conn = ConexaoComBancoDados.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, idAluno);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Aluno excluído com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir aluno: " + e.getMessage());
        }
        return false;
    }

    // Pesquisar aluno por nome com INNER JOIN Turma
    public List<AlunoModel> pesquisarAluno(String nomeBusca) {
        List<AlunoModel> alunos = new ArrayList<>();
        String sql = "SELECT a.*, t.codigoTurma, t.turno FROM Aluno a INNER JOIN Turma t ON"
                + " a.Turma_idTurma = t.idTurma WHERE a.nome LIKE ? OR a.dataDevolucao LIKE ? OR matricula LIKE ?";

        try (Connection conn = ConexaoComBancoDados.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, "%" + nomeBusca + "%");

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    AlunoModel aluno = new AlunoModel();
                    aluno.setIdAluno(rs.getInt("idAluno"));
                    aluno.setNome(rs.getString("nome"));
                    aluno.setLivrosEmDivida(rs.getInt("livrosEmDivida"));
                    aluno.setLivrosEmprestados(rs.getInt("livrosEmprestados"));
                    aluno.setLivrosDevolvidosA(rs.getInt("livrosDevolvidosA"));
                    aluno.setMatricula(rs.getInt("matricula"));
                    aluno.setTurmaId(rs.getInt("Turma_idTurma"));
                    aluno.setDataDevolucao(rs.getString("dataDevolucao"));
                    alunos.add(aluno);
                }
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar aluno: " + e.getMessage());
        }

        return alunos;
    }
}//fim da classe

