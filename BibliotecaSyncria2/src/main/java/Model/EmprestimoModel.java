/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author ALUNO
 */
public class EmprestimoModel {
    
    private int idEmprestimo;
    private int livrosDevolvidos;
    private int saldo;
    private String dataRetirada;
    private  int aluno_idAluno;
    private int aluno_Turma_idTurma;
    private int livro_idLivro;
    private int emprestados;
    private int total;
    private int noAcervo;

    public EmprestimoModel() {
    }

    public EmprestimoModel(int idEmprestimo, int livrosDevolvidos, int saldo, String dataRetirada, int aluno_idAluno, int aluno_Turma_idTurma, int livro_idLivro, int emprestados, int total, int noAcervo) {
        this.idEmprestimo = idEmprestimo;
        this.livrosDevolvidos = livrosDevolvidos;
        this.saldo = saldo;
        this.dataRetirada = dataRetirada;
        this.aluno_idAluno = aluno_idAluno;
        this.aluno_Turma_idTurma = aluno_Turma_idTurma;
        this.livro_idLivro = livro_idLivro;
        this.emprestados = emprestados;
        this.total = total;
        this.noAcervo = noAcervo;
    }
    
    
    
     

    public int getIdEmprestimo() {
        return idEmprestimo;
    }

    public void setIdEmprestimo(int idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }

    public int getLivrosDevolvidos() {
        return livrosDevolvidos;
    }

    public void setLivrosDevolvidos(int livrosDevolvidos) {
        this.livrosDevolvidos = livrosDevolvidos;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(String dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public int getAluno_idAluno() {
        return aluno_idAluno;
    }

    public void setAluno_idAluno(int aluno_idAluno) {
        this.aluno_idAluno = aluno_idAluno;
    }

    public int getAluno_Turma_idTurma() {
        return aluno_Turma_idTurma;
    }

    public void setAluno_Turma_idTurma(int aluno_Turma_idTurma) {
        this.aluno_Turma_idTurma = aluno_Turma_idTurma;
    }

    public int getLivro_idLivro() {
        return livro_idLivro;
    }

    public void setLivro_idLivro(int livro_idLivro) {
        this.livro_idLivro = livro_idLivro;
    }

    public int getEmprestados() {
        return emprestados;
    }

    public void setEmprestados(int emprestados) {
        this.emprestados = emprestados;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getNoAcervo() {
        return noAcervo;
    }

    public void setNoAcervo(int noAcervo) {
        this.noAcervo = noAcervo;
    }
  
    
     
} //Chave classe