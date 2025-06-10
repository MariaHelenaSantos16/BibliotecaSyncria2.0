/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bibliotecasyncria2;

import static Controller.ConexaoComBancoDados.conectar;
import java.sql.Connection;

/**
 *
 * @author ALUNO
 */
public class BibliotecaSyncria2 {

    public static void main(String[] args) {
        Connection conexao = conectar();
        
        if(conexao!= null) {
        System.out.println(conexao);
        }//fim fo if 
        
        
        
        
        
        
        
        
        
        
    }
}
