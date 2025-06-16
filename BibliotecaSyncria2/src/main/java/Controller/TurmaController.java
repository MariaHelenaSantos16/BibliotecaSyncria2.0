/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.TurmaModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ALUNO
 */
public class TurmaController {

    // Cadastrar Turma
    public boolean cadastrarTurma(TurmaModel turma) {
        String sql = "INSERT INTO Turma (turno, codigoTurma) VALUES (?, ?)";

        try (Connection conn = ConexaoComBancoDados.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, turma.getTurno());
            stmt.setString(2, turma.getCodigoTurma());

            stmt.executeUpdate();
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar turma: " + e.getMessage());
        }
        return false;
    }

    // Listar Turmas
    public List<TurmaModel> listarTurmas() {
        List<TurmaModel> lista = new ArrayList<>();
        String sql = "SELECT * FROM Turma";

        try (Connection conn = ConexaoComBancoDados.conectar(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                TurmaModel turma = new TurmaModel();
                turma.setIdTurma(rs.getInt("idTurma")); //variaveis dentro dos parenteses tem que estar com o mesmo nome no BD 
                turma.setTurno(rs.getString("turno")); // variaveis acompanhadas do set Nome da Model
                turma.setCodigoTurma(rs.getString("codigoTurma"));

                lista.add(turma);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar turmas: " + e.getMessage());
        }

        return lista;
    }

    // Atualizar Turma
    public boolean atualizarTurma(TurmaModel turma) {
        String sql = "UPDATE Turma SET turno = ?, codigoTurma = ? WHERE idTurma = ?";

        try (Connection conn = ConexaoComBancoDados.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, turma.getTurno());
            stmt.setString(2, turma.getCodigoTurma());
            stmt.setInt(3, turma.getIdTurma());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Turma atualizada com sucesso!");
              return true;
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar turma: " + e.getMessage());
            return false;
        }
    }

    // Excluir Turma
    public boolean excluirTurma(int idTurma) {
        String sql = "DELETE FROM Turma WHERE idTurma = ?";

        try (Connection conn = ConexaoComBancoDados.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, idTurma);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Turma excluída com sucesso!");
            return true;

            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir turma: " + e.getMessage());
             return false;
        }
    }

    // Pesquisar Turmas com INNER JOIN com Alunos
    public List<TurmaModel> pesquisarTurmaPorNome(String nomeParcial) {
        List<TurmaModel> lista = new ArrayList<>();
        String sql = "SELECT * FROM Turma WHERE codigoTurma LIKE ?";

        try (Connection conn = ConexaoComBancoDados.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, "%" + nomeParcial + "%");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                TurmaModel turma = new TurmaModel();
                turma.setIdTurma(rs.getInt("idTurma"));
                turma.setTurno(rs.getString("turno"));
                turma.setCodigoTurma(rs.getString("codigoTurma"));
                lista.add(turma);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar turma: " + e.getMessage());
        }

        return lista;
    }

}//fim classe
