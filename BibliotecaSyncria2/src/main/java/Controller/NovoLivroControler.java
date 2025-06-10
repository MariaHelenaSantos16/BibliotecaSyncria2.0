/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.NovoLivroModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

;

/**
 *
 * @author ALUNO
 */
public class NovoLivroControler {

    public void inserirLivro(NovoLivroModel livro) {
        String sql = "INSERT INTO livro (tituloObra, numeroCopias, dataCadastro, generosLiterarios, subgenerosLiterarios, autor, numeroRegistro, edicao, volume, localizacao, editora, anoFabricacao, anoPublicacao, aquisicao, exemplar, numeroChamada, isbn, statusLivros, observacoes, quantidadeTituloEmprestado, quantidadeTituloAcervo) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = ConexaoComBancoDados.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, livro.getTituloObra());
            stmt.setInt(2, livro.getNumeroCopias());
            stmt.setString(3, livro.getDataCadastro());
            stmt.setString(4, livro.getGenerosLiterarios());
            stmt.setString(5, livro.getSubgenerosLiterarios());
            stmt.setString(6, livro.getAutor());
            stmt.setInt(7, livro.getNumeroRegistro());
            stmt.setString(8, livro.getEdicao());
            stmt.setString(9, livro.getVolume());
            stmt.setString(10, livro.getLocalizacao());
            stmt.setString(11, livro.getEditora());
            stmt.setInt(12, livro.getAnoFabricacao());
            stmt.setInt(13, livro.getAnoPublicacao());
            stmt.setString(14, livro.getAquisicao());
            stmt.setString(15, livro.getExemplar());
            stmt.setString(16, livro.getNumeroChamada());
            stmt.setString(17, livro.getIsbn());
            stmt.setString(18, livro.getStatusLivros());
            stmt.setString(19, livro.getObservacoes());
            stmt.setInt(20, livro.getQuantidadeTituloEmprestado());
            stmt.setInt(21, livro.getQuantidadeTituloAcervo());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao inserir livro: " + e.getMessage());
        }
    }

    public List<NovoLivroModel> listarLivros() {
        // criar uma variavel para receber a lista 

        List<NovoLivroModel> lista = new ArrayList<>();
        //comando sql para lista dados do BD 
        String sql = "select * from livro";

        try (Connection conn = ConexaoComBancoDados.conectar();
                PreparedStatement ps = conn.prepareStatement(sql); 
                ResultSet rs = ps.executeQuery()) {

            // laço de repetiçao parcorrer a lista  de livros 
            while (rs.next()) {
                NovoLivroModel nl = new NovoLivroModel();
                  
               nl.setAnoFabricacao(rs.getInt("AnoFabricacao"));
                nl.setAnoPublicacao(rs.getInt("AnoPublicacao"));
                nl.setAquisicao(rs.getString("Aquisicao"));
                nl.setAutor(rs.getString("Autor"));
                nl.setDataCadastro(rs.getString("DataCadastro"));
                nl.setEdicao(rs.getString("Edicao"));
                nl.setEditora(rs.getString("Edicao"));
                nl.setExemplar(rs.getString("Exemplar"));
                nl.setGenerosLiterarios(rs.getNString("generosLiterarios"));
                nl.setIdLivro(rs.getInt("IdLivro"));
                nl.setIsbn(rs.getString("isbn"));
                nl.setLocalizacao(rs.getString("Localizacao"));
                nl.setNumeroChamada(rs.getString("NumeroChamada"));
                nl.setNumeroCopias(rs.getInt("NumeroCopias"));
                nl.setNumeroRegistro(rs.getInt("NumeroRegistro"));
                nl.setObservacoes(rs.getString("Observacoes"));
                nl.setQuantidadeTituloAcervo(rs.getInt("quantidadeTituloAcervo"));
                nl.setQuantidadeTituloEmprestado(rs.getInt("quantidadeTituloEmprestado"));
                nl.setStatusLivros(rs.getString("statusLivros"));
                nl.setSubgenerosLiterarios(rs.getString("SubgenerosLiterarios"));
                nl.setTituloObra(rs.getString("TituloObra"));
                nl.setVolume(rs.getString("Volume"));
                //jogando os livros 
                lista.add(nl);

            }// fim while 

        } catch (SQLException e) {
            System.out.println("Erro ao listar : " + e);

        }//FIM DO CATCH

        return lista;
    }// fim do metodo listar     

}
