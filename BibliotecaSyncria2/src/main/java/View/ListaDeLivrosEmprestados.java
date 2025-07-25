/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.EmprestimoController;
import Controller.NovoLivroControler;
import Controller.TurmaController;
import Model.EmprestimoModel;
import Model.NovoLivroModel;
import Model.TurmaModel;
import java.util.HashSet;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ALUNO
 */
public class ListaDeLivrosEmprestados extends javax.swing.JFrame {

    /**
     * Creates new form ListaDeLivrosEmprestados
     */
    
        TurmaController turmaController = new TurmaController();
        EmprestimoController emprestimoController = new EmprestimoController();

    public ListaDeLivrosEmprestados() {
        initComponents();
        listarEmprestimosTabela();
        listarTurnoComboBox();
        listarTurmaComboBox();
    }

   
    
    //Listando a tabelaa com mais de 2 
    //metodo para listar dados na tabela
    public void listarEmprestimosTabela() {
        List<EmprestimoModel> listaEmprestimos = emprestimoController.listarEmprestimos();

        //criação modelo padrao de tabela
        DefaultTableModel modelo = (DefaultTableModel) priTabela.getModel();
            modelo.setRowCount(0);
        for (EmprestimoModel em : listaEmprestimos) {
            modelo.addRow(new Object[]{
                //ordem que está na tabela das telas.    

                em.getTurnoTurma(),
            em.getNumeroTurma(),
            em.getNomeAluno(),
            em.getNomeLivro(),
            em.getRegistroLivro(),
            em.getDataDevolverAluno(),
            em.getDataRetiradaAluno()

        }//fim do for
          
    
            );
        }//fim do for
        priTabela.setModel(modelo);
    }//fim do metodo de listar dados

  
  
public void listarTurnoComboBox(){
    List<TurmaModel> listaTurno = turmaController.listarTurmas();

    //limpar a comboBox
    boxTurno.removeAllItems();

    //jogar os dados da lista dentro da comboBox
    for(TurmaModel lt: listaTurno){
        boxTurno.addItem(lt.getTurno());
        }//fim do for
    }//fim do metodo listarTurmasComboBox
    
    
    
public void listarTurmaComboBox(){
    List<TurmaModel> listaTurma = turmaController.listarTurmas();

    //limpar a comboBox
    filtrarTurma.removeAllItems();

    //jogar os dados da lista dentro da comboBox
    for(TurmaModel ltm: listaTurma){
        filtrarTurma.addItem(ltm.getCodigoTurma());
        }//fim do for
    }//fim do metodo listarTurmasComboBox



    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        principalPainel = new javax.swing.JPanel();
        escreva1 = new javax.swing.JLabel();
        livroI = new javax.swing.JLabel();
        penalBranco = new javax.swing.JPanel();
        escrevaLista = new javax.swing.JLabel();
        simboloPonto = new javax.swing.JLabel();
        filtrarTurma = new javax.swing.JComboBox<>();
        tabelaRolagem = new javax.swing.JScrollPane();
        priTabela = new javax.swing.JTable();
        botao1 = new javax.swing.JButton();
        boxTurno = new javax.swing.JComboBox<>();
        menuDeNavegacao = new javax.swing.JMenuBar();
        guiaRegistroEmprestimo = new javax.swing.JMenu();
        guiaListaLivrosEmprestados = new javax.swing.JMenu();
        guiaCadastroLivros = new javax.swing.JMenu();
        guiaListaLivrosAcervo = new javax.swing.JMenu();
        guiaRankingLeitores = new javax.swing.JMenu();
        guiaBancoDadosTurmas = new javax.swing.JMenu();
        guiaGrafico = new javax.swing.JMenu();
        guiaGrafico1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lista de Livros Emprestados");

        principalPainel.setBackground(new java.awt.Color(208, 224, 235));

        escreva1.setBackground(new java.awt.Color(0, 0, 0));
        escreva1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        escreva1.setForeground(new java.awt.Color(0, 0, 0));
        escreva1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ALUNO\\Documents\\NetBeansProjects\\BibliotecaSyncria - Copia\\BibliotecaSyncria\\src\\main\\java\\Images\\livro_(1)_(2).png")); // NOI18N
        escreva1.setText("Biblioteca Syncria");

        penalBranco.setBackground(new java.awt.Color(73, 112, 138));

        escrevaLista.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        escrevaLista.setForeground(new java.awt.Color(0, 0, 0));
        escrevaLista.setIcon(new javax.swing.ImageIcon("C:\\Users\\ALUNO\\Documents\\NetBeansProjects\\BibliotecaSyncria - Copia\\BibliotecaSyncria\\src\\main\\java\\Images\\livro emp. 64.png")); // NOI18N
        escrevaLista.setText("Lista de Livros Emprestados");

        filtrarTurma.setBackground(new java.awt.Color(255, 255, 255));
        filtrarTurma.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        filtrarTurma.setForeground(new java.awt.Color(0, 0, 0));
        filtrarTurma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Turma" }));
        filtrarTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtrarTurmaActionPerformed(evt);
            }
        });

        priTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Turno", "Código da Turma", "Alunos", "Nome do Livro", "Registro", "Data da Retirada", "Data de Devolução"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaRolagem.setViewportView(priTabela);

        botao1.setBackground(new java.awt.Color(255, 255, 255));
        botao1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botao1.setForeground(new java.awt.Color(0, 0, 0));
        botao1.setText("Exportar Lista");
        botao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao1ActionPerformed(evt);
            }
        });

        boxTurno.setBackground(new java.awt.Color(255, 255, 255));
        boxTurno.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        boxTurno.setForeground(new java.awt.Color(0, 0, 0));
        boxTurno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Turno" }));

        javax.swing.GroupLayout penalBrancoLayout = new javax.swing.GroupLayout(penalBranco);
        penalBranco.setLayout(penalBrancoLayout);
        penalBrancoLayout.setHorizontalGroup(
            penalBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabelaRolagem)
            .addGroup(penalBrancoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(simboloPonto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(penalBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(penalBrancoLayout.createSequentialGroup()
                        .addComponent(escrevaLista, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1243, Short.MAX_VALUE)
                        .addComponent(botao1)
                        .addGap(37, 37, 37))
                    .addGroup(penalBrancoLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(boxTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(filtrarTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        penalBrancoLayout.setVerticalGroup(
            penalBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(penalBrancoLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(penalBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(penalBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botao1)
                        .addComponent(escrevaLista))
                    .addComponent(simboloPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(penalBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filtrarTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(tabelaRolagem, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout principalPainelLayout = new javax.swing.GroupLayout(principalPainel);
        principalPainel.setLayout(principalPainelLayout);
        principalPainelLayout.setHorizontalGroup(
            principalPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalPainelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(livroI)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(escreva1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(principalPainelLayout.createSequentialGroup()
                .addComponent(penalBranco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        principalPainelLayout.setVerticalGroup(
            principalPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalPainelLayout.createSequentialGroup()
                .addGroup(principalPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(principalPainelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(livroI, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(escreva1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(penalBranco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        guiaRegistroEmprestimo.setIcon(new javax.swing.ImageIcon("C:\\Users\\ALUNO\\Documents\\NetBeansProjects\\BibliotecaSyncria - Copia\\BibliotecaSyncria\\src\\main\\java\\Images\\zregistro de emprest.png")); // NOI18N
        guiaRegistroEmprestimo.setText(" Registro de Empréstimo |");
        guiaRegistroEmprestimo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guiaRegistroEmprestimoMouseClicked(evt);
            }
        });
        menuDeNavegacao.add(guiaRegistroEmprestimo);

        guiaListaLivrosEmprestados.setIcon(new javax.swing.ImageIcon("C:\\Users\\ALUNO\\Documents\\NetBeansProjects\\BibliotecaSyncria - Copia\\BibliotecaSyncria\\src\\main\\java\\Images\\livro emp. 24.png")); // NOI18N
        guiaListaLivrosEmprestados.setText("Lista de Livros Emprestados |");
        guiaListaLivrosEmprestados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guiaListaLivrosEmprestadosMouseClicked(evt);
            }
        });
        menuDeNavegacao.add(guiaListaLivrosEmprestados);

        guiaCadastroLivros.setIcon(new javax.swing.ImageIcon("C:\\Users\\ALUNO\\Documents\\NetBeansProjects\\BibliotecaSyncria - Copia\\BibliotecaSyncria\\src\\main\\java\\Images\\cadastro de livros 24.png")); // NOI18N
        guiaCadastroLivros.setText("Cadastro de Livros |");
        guiaCadastroLivros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guiaCadastroLivrosMouseClicked(evt);
            }
        });
        menuDeNavegacao.add(guiaCadastroLivros);

        guiaListaLivrosAcervo.setIcon(new javax.swing.ImageIcon("C:\\Users\\ALUNO\\Downloads\\open-book.png")); // NOI18N
        guiaListaLivrosAcervo.setText("Lista de Livros no Acervo |");
        guiaListaLivrosAcervo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guiaListaLivrosAcervoMouseClicked(evt);
            }
        });
        menuDeNavegacao.add(guiaListaLivrosAcervo);

        guiaRankingLeitores.setIcon(new javax.swing.ImageIcon("C:\\Users\\ALUNO\\Downloads\\ranking.png")); // NOI18N
        guiaRankingLeitores.setText("Ranking dos Leitores |");
        guiaRankingLeitores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guiaRankingLeitoresMouseClicked(evt);
            }
        });
        menuDeNavegacao.add(guiaRankingLeitores);

        guiaBancoDadosTurmas.setIcon(new javax.swing.ImageIcon("C:\\Users\\ALUNO\\Documents\\NetBeansProjects\\BibliotecaSyncria - Copia\\BibliotecaSyncria\\src\\main\\java\\Images\\grupo-de-usuarios_(1).png")); // NOI18N
        guiaBancoDadosTurmas.setText("Banco de Dados das Turmas |");
        guiaBancoDadosTurmas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guiaBancoDadosTurmasMouseClicked(evt);
            }
        });
        menuDeNavegacao.add(guiaBancoDadosTurmas);
        menuDeNavegacao.add(guiaGrafico);

        guiaGrafico1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ALUNO\\Downloads\\vinticuatro.png")); // NOI18N
        guiaGrafico1.setText("Gráfico");
        menuDeNavegacao.add(guiaGrafico1);

        setJMenuBar(menuDeNavegacao);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(principalPainel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principalPainel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao1ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_botao1ActionPerformed

    private void filtrarTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtrarTurmaActionPerformed
        // TODO add your handling code here:
        
  
    }//GEN-LAST:event_filtrarTurmaActionPerformed

    
    private void guiaListaLivrosEmprestadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guiaListaLivrosEmprestadosMouseClicked
        // TODO add your handling code here:
        
       
    }//GEN-LAST:event_guiaListaLivrosEmprestadosMouseClicked

    private void guiaBancoDadosTurmasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guiaBancoDadosTurmasMouseClicked
        // TODO add your handling code here:
          
        //criar objeto da classe 
        BancoDeDadosDasTurmas bancoDadosTurma = new BancoDeDadosDasTurmas();
               // abrindo a tela
                bancoDadosTurma.setVisible(true);
        // fechar tela de login
                    dispose();
            ;
    }//GEN-LAST:event_guiaBancoDadosTurmasMouseClicked
    private void guiaListaLivrosAcervoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guiaListaLivrosAcervoMouseClicked

        // TODO add your handling code here:
        
        //criar objeto da classe 
        ListaDeLivrosNoAcervo livrosAcervo = new ListaDeLivrosNoAcervo();
               // abrindo a tela
                livrosAcervo.setVisible(true);
        // fechar tela de login
                    dispose();
            ;
        
    }//GEN-LAST:event_guiaListaLivrosAcervoMouseClicked
    private void guiaRegistroEmprestimoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guiaRegistroEmprestimoMouseClicked
        // TODO add your handling code here:
        
        //criar objeto da classe 
        TelaRegistrosEmprestimos registroEmprestimo = new TelaRegistrosEmprestimos();
               // abrindo a tela
                registroEmprestimo.setVisible(true);
        // fechar tela de login
                    dispose();
            ;
            
            
    }//GEN-LAST:event_guiaRegistroEmprestimoMouseClicked
    private void guiaCadastroLivrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guiaCadastroLivrosMouseClicked
        // TODO add your handling code here
        
                //criar objeto da classe 
        TelaDeCadastroDeLivros cadastroLivro = new TelaDeCadastroDeLivros();
               // abrindo a tela
                cadastroLivro.setVisible(true);
        // fechar tela de login
                    dispose();
            ;
    }//GEN-LAST:event_guiaCadastroLivrosMouseClicked
    private void guiaRankingLeitoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guiaRankingLeitoresMouseClicked
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_guiaRankingLeitoresMouseClicked

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**  * 
@param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListaDeLivrosEmprestados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaDeLivrosEmprestados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaDeLivrosEmprestados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaDeLivrosEmprestados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaDeLivrosEmprestados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao1;
    private javax.swing.JComboBox<String> boxTurno;
    private javax.swing.JLabel escreva1;
    private javax.swing.JLabel escrevaLista;
    private javax.swing.JComboBox<String> filtrarTurma;
    private javax.swing.JMenu guiaBancoDadosTurmas;
    private javax.swing.JMenu guiaCadastroLivros;
    private javax.swing.JMenu guiaGrafico;
    private javax.swing.JMenu guiaGrafico1;
    private javax.swing.JMenu guiaListaLivrosAcervo;
    private javax.swing.JMenu guiaListaLivrosEmprestados;
    private javax.swing.JMenu guiaRankingLeitores;
    private javax.swing.JMenu guiaRegistroEmprestimo;
    private javax.swing.JLabel livroI;
    private javax.swing.JMenuBar menuDeNavegacao;
    private javax.swing.JPanel penalBranco;
    private javax.swing.JTable priTabela;
    private javax.swing.JPanel principalPainel;
    private javax.swing.JLabel simboloPonto;
    private javax.swing.JScrollPane tabelaRolagem;
    // End of variables declaration//GEN-END:variables
}
