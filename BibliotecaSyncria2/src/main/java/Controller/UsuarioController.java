/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.UsuarioModel;
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
public class UsuarioController {

    public boolean CadastrarUsuario(UsuarioModel u) {
        String sql = "INSERT INTO Usuario (nome,senha,cpf)"
                + " values(?,?,?)";

        try (Connection con = ConexaoComBancoDados.conectar(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, u.getNome());
            ps.setString(2, u.getSenha());
            ps.setString(3, u.getCpf());

            //solicitar o retorno
            int retorno = ps.executeUpdate();
            // realizando o retorno caso tenha dado certo
            return retorno > 0;

        } catch (SQLException e) {
            e.getStackTrace();
            return false;
        }

    }//fim cadastrar

    public List<UsuarioModel> listagemUsuario() {
        //criar uma váriavel para receber a lista
        List<UsuarioModel> lista = new ArrayList<>();
        //comando sql para listar dados do banco de dados
        String sql = "SELECT * FROM Usuario";

        try (Connection conn = ConexaoComBancoDados.conectar();
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {
            // laço de repeticão para percorrer a lista de cliente 
            while (rs.next()) {
                // objeto do cliente model p/ receber dados
                UsuarioModel usu = new UsuarioModel();
                usu.setIdUsuario(rs.getInt("idUsuario"));
                usu.setNome(rs.getString("nome"));
                usu.setSenha(rs.getString("senha"));
                usu.setCpf(rs.getString("cpf"));

                //jogando os cliente dentro da lista
                lista.add(usu);

            }// fim do whille

        } catch (SQLException e) {
            System.out.println("Erro ao listar: " + e);
        }//fim do catch

        return lista;

    } //fim do metodo listar
    
    
    public UsuarioModel login(String cpf, String senha) {
    UsuarioModel usuario = null;
    String sql = "SELECT * FROM Funcionario WHERE cpf = ? AND senha = ?";

    try (Connection conn = ConexaoComBancoDados.conectar();
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setString(1, cpf);
        stmt.setString(2, senha);

        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            usuario = new UsuarioModel();
            usuario.setIdUsuario(rs.getInt("idUsuario"));
            usuario.setNome(rs.getString("nome"));
            usuario.setCpf(rs.getString("cpf"));
            usuario.setSenha(rs.getString("senha"));
        }

    } catch (SQLException e) {
        e.printStackTrace();
    }

    return usuario;
}
  

}//fim do piblic class
