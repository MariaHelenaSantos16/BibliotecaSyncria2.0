/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.sql.PreparedStatement;

import Model.EmprestimoModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ALUNO
 */
public class EmprestimoController {

    //Cadastrar novos emprestimos
    public boolean CadastrarEmprestimo(EmprestimoModel e) {
        String sql = "INSERT INTO Emprestimo (livrosDevolvidos, saldo, dataRetirada, Aluno_idAluno, Aluno_Turma_idTurma, Livro_idLivro) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = ConexaoComBancoDados.conectar(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, e.getLivrosDevolvidos());
            ps.setInt(2, e.getSaldo());
            ps.setString(3, e.getDataRetirada());
            ps.setInt(4, e.getAluno_idAluno());
            ps.setInt(5, e.getAluno_Turma_idTurma());
            ps.setInt(6, e.getLivro_idLivro());

            int linhasAfetadas = ps.executeUpdate();
            return true;

        } catch (SQLException err) {
            err.printStackTrace();
            return false;

        }//fim do trycatch
    }//fim da boolean

    public List<EmprestimoModel> listarEmprestimos() {
        //criar uma váriavel para receber a lista
        List<EmprestimoModel> lista = new ArrayList<>();
        //comando sql para listar dados do banco de dados
        String sql = " SELECT em.*,al.nome as nomeAluno, al.dataDevolucao , tu.turno as turnoTurma, tu.codigoTurma, li.tituloObra as nomeLivro, li.numeroRegistro FROM Emprestimo em" 
               + " INNER JOIN Aluno al ON al.idAluno = em.aluno_idAluno"
               +"  INNER JOIN Turma tu ON tu.idTurma = em.aluno_Turma_idTurma"
               +"  INNER JOIN Livro li ON li.idLivro = em.livro_idLivro";


        try (Connection conn = ConexaoComBancoDados.conectar();
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {
            // laço de repeticão para percorrer a lista de cliente 
            while (rs.next()) {
                // objeto do cliente model p/ receber dados
                EmprestimoModel emp = new EmprestimoModel();
                emp.setDataRetirada(rs.getString("DataRetirada"));
                emp.setAluno_Turma_idTurma(rs.getInt("Aluno_Turma_idTurma"));
                emp.setLivro_idLivro(rs.getInt("livro_idLivro"));
                emp.setAluno_idAluno(rs.getInt("aluno_idAluno"));
                emp.setIdEmprestimo(rs.getInt("IdEmprestimo"));
                emp.setLivrosDevolvidos(rs.getInt("livrosDevolvidos"));
                emp.setSaldo(rs.getInt("saldo"));
                
                emp.setTurnoTurma(rs.getString("turnoTurma"));            
                emp.setNumeroTurma(rs.getString("codigoTurma"));
                emp.setNomeAluno(rs.getString("nomeAluno")); 
                emp.setNomeLivro(rs.getString("nomeLivro"));              
                emp.setRegistroLivro(rs.getString("numeroRegistro"));
                emp.setDataDevolverAluno(rs.getString("dataDevolucao"));
                emp.setDataRetiradaAluno(rs.getString("dataRetirada"));
                
                   
                //jogando os cliente dentro da lista
                lista.add(emp);

            }// fim do whille

        } catch (SQLException e) {
            System.out.println("Erro ao listar: " + e);
        }//fim do catch
        
        return lista;
    
    } //fim do metodo listar
    
    
}//fim da classe
