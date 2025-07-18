/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.TurmaController;
import Model.TurmaModel;
import java.util.List;

/**
 *
 * @author ALUNO
 */
public class TelaRankingDeLeitores extends javax.swing.JFrame {

    /**
     * Creates new form BancoDeDadosDasTurmas
     */
    
    //Conexao com o BD com o controller
    TurmaController turmasController = new TurmaController();
    
    public TelaRankingDeLeitores() {
        initComponents();
        listarTurmasComboBox();
    }
    
    public void listarTurmasComboBox(){
    List<TurmaModel> listaTurmas = turmasController.listarTurmas();
    
    //limpar a comboBox
    filtroTurmaRL.removeAllItems();
    
    //jogar os dados da lista dentro da comboBox
    for(TurmaModel tu:listaTurmas){
         filtroTurmaRL.addItem(tu.getCodigoTurma());
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

        scrollPane1 = new java.awt.ScrollPane();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        painelPrincipalFundo = new javax.swing.JPanel();
        filtroTurmaRL = new javax.swing.JComboBox<>();
        filtroTurnos = new javax.swing.JComboBox<>();
        botaoDeFiltrar = new javax.swing.JButton();
        botaoExportar = new javax.swing.JButton();
        cabecalhoSyncria = new javax.swing.JPanel();
        letreiroSyncria = new javax.swing.JLabel();
        iconeDoLivroSyncria = new javax.swing.JLabel();
        iconeSair = new javax.swing.JLabel();
        iconeRankingLeitores = new javax.swing.JLabel();
        letreiroRankingLeitores = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaRankingLeitores = new javax.swing.JTable();
        menuDeNavegacao = new javax.swing.JMenuBar();
        guiaRegistroEmprestimo = new javax.swing.JMenu();
        guiaListaLivrosEmprestados = new javax.swing.JMenu();
        guiaCadastroLivros = new javax.swing.JMenu();
        guiaListaLivrosAcervo = new javax.swing.JMenu();
        guiaRankingLeitores = new javax.swing.JMenu();
        guiaBancoDadosTurmas = new javax.swing.JMenu();
        guiaGrafico = new javax.swing.JMenu();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Banco de Dados das Turmas");

        painelPrincipalFundo.setBackground(new java.awt.Color(73, 112, 138));

        filtroTurmaRL.setBackground(new java.awt.Color(255, 255, 255));
        filtroTurmaRL.setForeground(new java.awt.Color(0, 0, 0));
        filtroTurmaRL.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TURMA" }));
        filtroTurmaRL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtroTurmaRLActionPerformed(evt);
            }
        });

        filtroTurnos.setBackground(new java.awt.Color(255, 255, 255));
        filtroTurnos.setForeground(new java.awt.Color(0, 0, 0));
        filtroTurnos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TURNO", "MATUTINO", "VESPERTINO", "NOTURNO" }));
        filtroTurnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtroTurnosActionPerformed(evt);
            }
        });

        botaoDeFiltrar.setBackground(new java.awt.Color(255, 255, 255));
        botaoDeFiltrar.setForeground(new java.awt.Color(0, 0, 0));
        botaoDeFiltrar.setIcon(new javax.swing.ImageIcon("C:\\Users\\ALUNO\\Downloads\\icons8-filtro-vazio-50 (2).png")); // NOI18N
        botaoDeFiltrar.setText("Filtrar");
        botaoDeFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDeFiltrarActionPerformed(evt);
            }
        });

        botaoExportar.setBackground(new java.awt.Color(255, 255, 255));
        botaoExportar.setForeground(new java.awt.Color(0, 0, 0));
        botaoExportar.setIcon(new javax.swing.ImageIcon("C:\\Users\\ALUNO\\Downloads\\exportar.png")); // NOI18N
        botaoExportar.setText("Exportar");

        cabecalhoSyncria.setBackground(new java.awt.Color(208, 224, 235));
        cabecalhoSyncria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        letreiroSyncria.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        letreiroSyncria.setForeground(new java.awt.Color(0, 0, 0));
        letreiroSyncria.setText("Biblioteca Syncria");

        iconeDoLivroSyncria.setIcon(new javax.swing.ImageIcon("C:\\Users\\ALUNO\\Downloads\\livro (1) (2).png")); // NOI18N

        iconeSair.setForeground(new java.awt.Color(0, 0, 0));
        iconeSair.setIcon(new javax.swing.ImageIcon("C:\\Users\\ALUNO\\Downloads\\logout_(1).png")); // NOI18N
        iconeSair.setText("Sair");
        iconeSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconeSairMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout cabecalhoSyncriaLayout = new javax.swing.GroupLayout(cabecalhoSyncria);
        cabecalhoSyncria.setLayout(cabecalhoSyncriaLayout);
        cabecalhoSyncriaLayout.setHorizontalGroup(
            cabecalhoSyncriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cabecalhoSyncriaLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(iconeDoLivroSyncria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(letreiroSyncria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(iconeSair)
                .addGap(14, 14, 14))
        );
        cabecalhoSyncriaLayout.setVerticalGroup(
            cabecalhoSyncriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(letreiroSyncria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(cabecalhoSyncriaLayout.createSequentialGroup()
                .addGroup(cabecalhoSyncriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cabecalhoSyncriaLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(iconeDoLivroSyncria))
                    .addGroup(cabecalhoSyncriaLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(iconeSair)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        iconeRankingLeitores.setIcon(new javax.swing.ImageIcon("C:\\Users\\ALUNO\\Downloads\\ranking (2).png")); // NOI18N

        letreiroRankingLeitores.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        letreiroRankingLeitores.setForeground(new java.awt.Color(0, 0, 0));
        letreiroRankingLeitores.setText("Ranking de Leitores");

        tabelaRankingLeitores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Turma", "Nomes", "Livros"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaRankingLeitores.setToolTipText("");
        jScrollPane2.setViewportView(tabelaRankingLeitores);

        javax.swing.GroupLayout painelPrincipalFundoLayout = new javax.swing.GroupLayout(painelPrincipalFundo);
        painelPrincipalFundo.setLayout(painelPrincipalFundoLayout);
        painelPrincipalFundoLayout.setHorizontalGroup(
            painelPrincipalFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cabecalhoSyncria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(painelPrincipalFundoLayout.createSequentialGroup()
                .addGroup(painelPrincipalFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPrincipalFundoLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(iconeRankingLeitores, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(letreiroRankingLeitores, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelPrincipalFundoLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(filtroTurnos, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(filtroTurmaRL, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoDeFiltrar)
                        .addGap(18, 18, 18)
                        .addComponent(botaoExportar))
                    .addGroup(painelPrincipalFundoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1813, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        painelPrincipalFundoLayout.setVerticalGroup(
            painelPrincipalFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPrincipalFundoLayout.createSequentialGroup()
                .addComponent(cabecalhoSyncria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(painelPrincipalFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPrincipalFundoLayout.createSequentialGroup()
                        .addComponent(iconeRankingLeitores, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPrincipalFundoLayout.createSequentialGroup()
                        .addComponent(letreiroRankingLeitores)
                        .addGap(28, 28, 28)))
                .addGroup(painelPrincipalFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoExportar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painelPrincipalFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(filtroTurnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(filtroTurmaRL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botaoDeFiltrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 784, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(895, 895, 895))
        );

        guiaRegistroEmprestimo.setIcon(new javax.swing.ImageIcon("C:\\Users\\ALUNO\\Downloads\\registro.png")); // NOI18N
        guiaRegistroEmprestimo.setText("Registro de Empréstimo |");
        guiaRegistroEmprestimo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guiaRegistroEmprestimoMouseClicked(evt);
            }
        });
        menuDeNavegacao.add(guiaRegistroEmprestimo);

        guiaListaLivrosEmprestados.setIcon(new javax.swing.ImageIcon("C:\\Users\\ALUNO\\Downloads\\livro_emp._24.png")); // NOI18N
        guiaListaLivrosEmprestados.setText("Lista de Livros Emprestados |");
        guiaListaLivrosEmprestados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guiaListaLivrosEmprestadosMouseClicked(evt);
            }
        });
        menuDeNavegacao.add(guiaListaLivrosEmprestados);

        guiaCadastroLivros.setIcon(new javax.swing.ImageIcon("C:\\Users\\ALUNO\\Downloads\\livro (2).png")); // NOI18N
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

        guiaBancoDadosTurmas.setIcon(new javax.swing.ImageIcon("C:\\Users\\ALUNO\\Downloads\\grupo-de-usuarios (1).png")); // NOI18N
        guiaBancoDadosTurmas.setText("Banco de Dados das Turmas |");
        guiaBancoDadosTurmas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guiaBancoDadosTurmasMouseClicked(evt);
            }
        });
        menuDeNavegacao.add(guiaBancoDadosTurmas);

        guiaGrafico.setIcon(new javax.swing.ImageIcon("C:\\Users\\ALUNO\\Documents\\NetBeansProjects\\BibliotecaSyncria2.0\\BibliotecaSyncria2\\src\\main\\java\\Images\\7.Gráficos (24px).png")); // NOI18N
        guiaGrafico.setText("Gráfico");
        guiaGrafico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guiaGraficoMouseClicked(evt);
            }
        });
        menuDeNavegacao.add(guiaGrafico);

        setJMenuBar(menuDeNavegacao);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipalFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 4, Short.MAX_VALUE)
                .addComponent(painelPrincipalFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoDeFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDeFiltrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoDeFiltrarActionPerformed

    private void filtroTurmaRLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtroTurmaRLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filtroTurmaRLActionPerformed

    private void filtroTurnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtroTurnosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filtroTurnosActionPerformed

    private void guiaBancoDadosTurmasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guiaBancoDadosTurmasMouseClicked
        // TODO add your handling code here:
         //acesso da Tela 5 para tela 6
        BancoDeDadosDasTurmas tela5paratela6 = new  BancoDeDadosDasTurmas ();
        
        //Abrindo a tela
        tela5paratela6.setVisible(true);
        
        //Fechando a tela
        dispose();
    }//GEN-LAST:event_guiaBancoDadosTurmasMouseClicked

    private void guiaRegistroEmprestimoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guiaRegistroEmprestimoMouseClicked
        // TODO add your handling code here:
        TelaRegistrosEmprestimos tela5ParaTela1 = new TelaRegistrosEmprestimos();
        
        //Abrindo a tela 5 para tela 1
        tela5ParaTela1.setVisible(true);
        
        //Fechando a tela
        dispose();
    }//GEN-LAST:event_guiaRegistroEmprestimoMouseClicked

    private void guiaListaLivrosAcervoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guiaListaLivrosAcervoMouseClicked
        // TODO add your handling code here:
        
        //acesso da tela 5 para tela 4
        ListaDeLivrosNoAcervo tela5ParaTela4 = new  ListaDeLivrosNoAcervo();
        
        //Abrindo a tela
        tela5ParaTela4.setVisible(true);
        
        //Fechando a tela
        dispose();
    }//GEN-LAST:event_guiaListaLivrosAcervoMouseClicked

    private void guiaRankingLeitoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guiaRankingLeitoresMouseClicked
        // TODO add your handling code here:
        
        
      
    }//GEN-LAST:event_guiaRankingLeitoresMouseClicked

    private void guiaCadastroLivrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guiaCadastroLivrosMouseClicked
        // TODO add your handling code here:
        
        //acesso da Tela 5 para tela 3
        TelaDeCadastroDeLivros tela5paratela3 = new  TelaDeCadastroDeLivros ();
        
        //Abrindo a tela
        tela5paratela3.setVisible(true);
        
        //Fechando a tela
        dispose();
        
    }//GEN-LAST:event_guiaCadastroLivrosMouseClicked

    private void guiaListaLivrosEmprestadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guiaListaLivrosEmprestadosMouseClicked
        // TODO add your handling code here:
        
        //acesso da Tela 5 para tela 2
        ListaDeLivrosEmprestados tela5paratela2 = new  ListaDeLivrosEmprestados ();
        
        //Abrindo a tela
        tela5paratela2.setVisible(true);
        
        //Fechando a tela
        dispose();
    }//GEN-LAST:event_guiaListaLivrosEmprestadosMouseClicked

    private void iconeSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconeSairMouseClicked
        // TODO add your handling code here:
        
        //Processo de fechar o Aplicativo
        dispose();
    }//GEN-LAST:event_iconeSairMouseClicked

    private void guiaGraficoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guiaGraficoMouseClicked
        // TODO add your handling code here:
        
        //acesso da tela 6 para tela 7
        TelaGraficos tela6ParaTela7 = new TelaGraficos();

        //Abrindo a tela
        tela6ParaTela7.setVisible(true);

        //Fechando a tela
        dispose();
        
    }//GEN-LAST:event_guiaGraficoMouseClicked

    /**
     * @param args the command line arguments
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
            java.util.logging.Logger.getLogger(TelaRankingDeLeitores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRankingDeLeitores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRankingDeLeitores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRankingDeLeitores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRankingDeLeitores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoDeFiltrar;
    private javax.swing.JButton botaoExportar;
    private javax.swing.JPanel cabecalhoSyncria;
    private javax.swing.JComboBox<String> filtroTurmaRL;
    private javax.swing.JComboBox<String> filtroTurnos;
    private javax.swing.JMenu guiaBancoDadosTurmas;
    private javax.swing.JMenu guiaCadastroLivros;
    private javax.swing.JMenu guiaGrafico;
    private javax.swing.JMenu guiaListaLivrosAcervo;
    private javax.swing.JMenu guiaListaLivrosEmprestados;
    private javax.swing.JMenu guiaRankingLeitores;
    private javax.swing.JMenu guiaRegistroEmprestimo;
    private javax.swing.JLabel iconeDoLivroSyncria;
    private javax.swing.JLabel iconeRankingLeitores;
    private javax.swing.JLabel iconeSair;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel letreiroRankingLeitores;
    private javax.swing.JLabel letreiroSyncria;
    private javax.swing.JMenuBar menuDeNavegacao;
    private javax.swing.JPanel painelPrincipalFundo;
    private java.awt.ScrollPane scrollPane1;
    private javax.swing.JTable tabelaRankingLeitores;
    // End of variables declaration//GEN-END:variables
}
