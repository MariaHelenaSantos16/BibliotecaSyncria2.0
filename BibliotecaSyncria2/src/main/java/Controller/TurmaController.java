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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ALUNO
 */
public class TurmaController {
    
   public boolean cadastrarTurma(TurmaModel t) {
    String sql = "INSERT INTO Turma (turno, codigoTurma) VALUES (?, ?)";

    try (Connection conn = ConexaoComBancoDados.conectar();
         PreparedStatement ps = conn.prepareStatement(sql)) {

        ps.setString(1, t.getTurno());
        ps.setString(2, t.getCodigoTurma());

        int linhasAfetadas = ps.executeUpdate();
        return linhasAfetadas > 0;

    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }//fim trycatch
}// fim boolean

   public List<TurmaModel> ListarTurmas(){
       
       //criar uma variavel para recebr a lista
       List<TurmaModel> lista = new ArrayList <>();
       
       //comando sql para listar dados do BD
       String sql = "SELECT * FROM Turma";
       
       try (Connection conn = ConexaoComBancoDados.conectar();
            PreparedStatement ps = conn.prepareStatement(sql);
               ResultSet rs = ps.executeQuery() ){
       
         //laço de repetição para percorrer a lista de turmas  
           while(rs.next()){
               
               //objeto do turma model p/ receber os dados
               TurmaModel tm = new TurmaModel();
               
               tm.setIdTurma(rs.getInt("idTurma"));
               tm.setTurno(rs.getString("nome"));
               tm.setCodigoDaTurma(rs.getString("codigoTurma"));
               
               //jogando os turmas dentro da lista
               lista.add(tm);
           }//fim do while
           
       }catch(SQLException e){
           System.out.println("Erro ao listar: "+e);  
       }//fim do trycatch
   
       return lista;
       
   }//fim do metodo listar
   
   
   
   
   
}//fim classe
