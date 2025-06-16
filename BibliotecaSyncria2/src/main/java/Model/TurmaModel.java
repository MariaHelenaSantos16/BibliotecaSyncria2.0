/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ALUNO
 */
public class TurmaModel {
    
    private int idTurma;
    private String turno;
    private String codigoTurma;

    public TurmaModel(int idTurma, String turno, String codigoTurma) {
        this.idTurma = idTurma;
        this.turno = turno;
        this.codigoTurma = codigoTurma;
  
    }//fim do construtor cheio

    //Construtor vazio
    public TurmaModel() {
    }
    
    //Getter e Setter

    public int getIdTurma() {
        return idTurma;
    }

    public void setIdTurma(int idTurma) {
        this.idTurma = idTurma;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getCodigoTurma() {
        return codigoTurma;
    }

    public void setCodigoTurma(String codigoDaTurma) {
        this.codigoTurma = codigoDaTurma;
    }

   
    

     
            
            
}// fim da chave da classe
