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

/**
 *
 * @author ALUNO
 */
public class AlunoController {
    
    public boolean cadastrarAluno(AlunoModel a) {
        String sql = "INSERT INTO Aluno (nome, livrosEmDivida, livrosEmprestados, livrosDevolvidosA, matricula, Turma_id)  VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = ConexaoComBancoDados.conectar();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, a.getNome());
            ps.setInt(2, a.getLivrosEmDivida());
            ps.setInt(3, a.getLivrosEmprestados());
            ps.setInt(4, a.getLivrosDevolvidosA());
            ps.setInt(5, a.getMatricula());
            ps.setInt(6, a.getTurmaId());

            int linhasAfetadas = ps.executeUpdate();
            return linhasAfetadas > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    //Método de Listagem
    public List<AlunoModel> ListarAlunos(){
    
    //criar variavel para receber lista
    List<AlunoModel> lista = new ArrayList <>();
    
    //comando sql pra listar dados do banco de dados
        
        String sql = "SELECT * FROM Aluno";
        
        try (Connection conn = ConexaoComBancoDados.conectar();
             PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()){
        
            //laço de repetição para percorrer a lista de turmas
            while(rs.next()){
            
                //objeto do cliente model para receber os dados
                AlunoModel am = new AlunoModel();
                
                am.setIdAluno(rs.getInt("idAluno"));
                am.setNome(rs.getString("nome"));
                am.setLivrosEmDivida(rs.getInt("livrosEmDivida"));
                am.setLivrosEmprestados(rs.getInt("livrosEmprestados"));
                am.setLivrosDevolvidosA(rs.getInt("livrosDevolvidosA"));
                am.setMatricula(rs.getInt("matricula"));
                am.setTurmaId(rs.getInt("turmaId"));
                
                //jogando os alunos dentro das lista
                lista.add(am);
                
            }//Fim do While
            
            
            
            
        }catch(SQLException e){
            System.out.println("Erro ao listar alunos"+e);
        }//fim do trycatch
        return lista;
    
    }//Fim do Método de listar alunos
    
    
}//fim da classe

