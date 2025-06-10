/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ALUNO
 */
//classe para conectar com banco de dados
public class ConexaoComBancoDados {
    
  //Criacao de metodo para ligacao com banco de dados mysql 
    public static Connection conectar (){
        Connection conexao = null;
        
        //variaveis do banco de dados
        String url = "jdbc:mysql://localhost:3306/bibliotecaSyncria";
        String usuario = "root";
        String senha = "";
        
        //auxilia no treinamento
        try {
            conexao = DriverManager.getConnection (url,usuario,senha);
            System.out.println("Conexão bem sucedida!");    
            
        }catch(SQLException e) {
            System.out.println("Erro de conexão"+e.getMessage());
        }//fim do trycatch
        
        
        
        
        
        return conexao;
        
    }//fim do metodo
    
    
    
    
    
}//fim da classe
