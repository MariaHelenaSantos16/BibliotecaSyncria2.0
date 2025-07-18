/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.NovoLivroControler;
import Model.NovoLivroModel;
import java.util.List;
import javax.swing.event.DocumentEvent;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ALUNO
 */

public class ListaDeLivrosNoAcervo extends javax.swing.JFrame {

    /**
     * Creates new form ListaDeLivrosNoAcervo
     */

    
    
    //Conexao com o BD com o controller
    NovoLivroControler livroController = new NovoLivroControler();
   
    public ListaDeLivrosNoAcervo() {
        initComponents();
         listarLivrosTabela();
         listarGenerosComboBox();
         listarAutorComboBox();
         listarDataComboBox();
         

         comboFiltro.addActionListener((e) -> {
         String itemSelecionado = comboFiltro.getSelectedItem().toString();
         filtrarLivros(itemSelecionado);
         });
         
           boxAutor.addActionListener((e) -> {
         String itemSelecionado = boxAutor.getSelectedItem().toString();
         filtrarLivros(itemSelecionado);
         });
         
            jComboBoxData.addActionListener((e) -> {
         String itemSelecionado = jComboBoxData.getSelectedItem().toString();
         filtrarLivros(itemSelecionado);
         });
         
         
         
         
         
         
         
        // metodo que ao digitar dentro do campo de pesquisa e ele preencha a tabela
        pesquisarCampo.getDocument().addDocumentListener(
                new javax.swing.event.DocumentListener() {

          
            public void insertUpdate(javax.swing.event.DocumentEvent e) {
                pesquisar();
            }

            public void removeUpdate(javax.swing.event.DocumentEvent e) {
                pesquisar();
            }

            public void changedUpdate(javax.swing.event.DocumentEvent e) {
                pesquisar();
            }

            public void pesquisar() {
                String texto = pesquisarCampo.getText();
                    filtrarLivros(texto);    
            } //fim pesquisar

         }//fim new
        );
       
    }//fim init
    
    
    
    
    public void filtrarLivros(String textoPesquisa) {
        List<NovoLivroModel> listaLivro = livroController.pesquisarLivro(textoPesquisa); // ou crie um método controller
        DefaultTableModel modelo = (DefaultTableModel) tabelaRegistro.getModel();
        modelo.setRowCount(0);

        for (NovoLivroModel nlm : listaLivro) {
            if (nlm.getTituloObra().toLowerCase().contains(textoPesquisa.toLowerCase())
                    || nlm.getGenerosLiterarios().toLowerCase().contains(textoPesquisa.toLowerCase())) {

                modelo.addRow(new Object[]{
                    nlm.getTituloObra(),
                    nlm.getDataCadastro(),
                    nlm.getGenerosLiterarios(),
                    nlm.getSubgenerosLiterarios(),
                    nlm.getAutor(),
                    nlm.getNumeroRegistro(),
                    nlm.getEdicao(),
                    nlm.getVolume(),
                    nlm.getLocalizacao(),
                    nlm.getEditora(),
                    nlm.getAnoPublicacao(),
                    nlm.getAquisicao(),
                    nlm.getExemplar(),
                    nlm.getIsbn(),
                    nlm.getNumeroChamada(),}//fim modelo

                );
        }//fim do if
    }//fim do for
        tabelaRegistro.setModel(modelo);
}// fim filtrar
    
    
    
    
    //metodo para listar dados na tabela
    public void listarLivrosTabela() {
        List<NovoLivroModel> listaLivros = livroController.listarLivros();

        //criação modelo padrao de tabela
        DefaultTableModel modelo =  (DefaultTableModel) tabelaRegistro.getModel();

        for (NovoLivroModel l : listaLivros) {
            modelo.addRow(new Object[]{
                //ordem que está na tabela das telas.
                l.getTituloObra(),
            l.getDataCadastro(),
            l.getGenerosLiterarios(),
            l.getSubgenerosLiterarios(),
            l.getAutor(),
            l.getNumeroRegistro(),
            l.getEdicao(),
            l.getVolume(),
            l.getLocalizacao(),
            l.getEditora(),
            l.getAnoPublicacao(), 
            l.getAquisicao(),
            l.getExemplar(),
            l.getNumeroChamada()
        }//fim do for
            );
        }//fim do for
        tabelaRegistro.setModel(modelo);
    }//fim do metodo de listar dados


    
    
    
    
public void listarGenerosComboBox(){
    List<NovoLivroModel>listaGeneros = livroController.listarLivros();

    //limpar a comboBox
    comboFiltro.removeAllItems();

    //jogar os dados da lista dentro da comboBox
    for(NovoLivroModel nlm: listaGeneros){
        comboFiltro.addItem(nlm.getGenerosLiterarios());
        }//fim do for
    }//fim do metodo listarTurmasComboBox
    



    
public void listarAutorComboBox(){
    List<NovoLivroModel>listaAutor = livroController.listarLivros();

    //limpar a comboBox
    boxAutor.removeAllItems();

    //jogar os dados da lista dentro da comboBox
    for(NovoLivroModel lm: listaAutor){
        boxAutor.addItem(lm.getAutor());
        }//fim do for
    }//fim do metodo listarTurmasComboBox
    
    
    
    
    
public void listarDataComboBox(){
    List<NovoLivroModel> listaData = livroController.listarLivros();

    //limpar a comboBox
    jComboBoxData.removeAllItems();

    //jogar os dados da lista dentro da comboBox
    for(NovoLivroModel lm: listaData){
        jComboBoxData.addItem(lm.getDataCadastro());
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

        princPanel = new javax.swing.JPanel();
        painelSec = new javax.swing.JPanel();
        panelWhite = new javax.swing.JPanel();
        escreva1 = new javax.swing.JLabel();
        livroI = new javax.swing.JLabel();
        listihna = new javax.swing.JLabel();
        escrevaLista = new javax.swing.JLabel();
        comboFiltro = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaRegistro = new javax.swing.JTable();
        boxAutor = new javax.swing.JComboBox<>();
        jComboBoxData = new javax.swing.JComboBox<>();
        pesquisarCampo = new javax.swing.JTextField();
        iconePesquisa = new javax.swing.JLabel();
        menuDeNavegacao = new javax.swing.JMenuBar();
        guiaRegistroEmprestimo = new javax.swing.JMenu();
        guiaListaLivrosEmprestados = new javax.swing.JMenu();
        guiaCadastroLivros = new javax.swing.JMenu();
        guiaListaLivrosAcervo = new javax.swing.JMenu();
        guiaRankingLeitores = new javax.swing.JMenu();
        guiaBancoDadosTurmas = new javax.swing.JMenu();
        guiaGrafico = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lista de Livros no Acervo");

        princPanel.setBackground(new java.awt.Color(73, 112, 138));

        painelSec.setBackground(new java.awt.Color(73, 112, 138));

        javax.swing.GroupLayout painelSecLayout = new javax.swing.GroupLayout(painelSec);
        painelSec.setLayout(painelSecLayout);
        painelSecLayout.setHorizontalGroup(
            painelSecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2529, Short.MAX_VALUE)
        );
        painelSecLayout.setVerticalGroup(
            painelSecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 777, Short.MAX_VALUE)
        );

        panelWhite.setBackground(new java.awt.Color(208, 224, 235));

        escreva1.setBackground(new java.awt.Color(255, 255, 255));
        escreva1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        escreva1.setForeground(new java.awt.Color(0, 0, 0));
        escreva1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ALUNO\\Documents\\NetBeansProjects\\BibliotecaSyncria - Copia\\BibliotecaSyncria\\src\\main\\java\\Images\\livro_(1)_(2).png")); // NOI18N
        escreva1.setText("Biblioteca Syncria");

        javax.swing.GroupLayout panelWhiteLayout = new javax.swing.GroupLayout(panelWhite);
        panelWhite.setLayout(panelWhiteLayout);
        panelWhiteLayout.setHorizontalGroup(
            panelWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelWhiteLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(livroI)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(escreva1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelWhiteLayout.setVerticalGroup(
            panelWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelWhiteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(escreva1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(livroI))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        escrevaLista.setBackground(new java.awt.Color(255, 255, 255));
        escrevaLista.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        escrevaLista.setForeground(new java.awt.Color(0, 0, 0));
        escrevaLista.setIcon(new javax.swing.ImageIcon("C:\\Users\\ALUNO\\Documents\\NetBeansProjects\\BibliotecaSyncria - Copia\\BibliotecaSyncria\\src\\main\\java\\Images\\open 64.png")); // NOI18N
        escrevaLista.setText("Lista de Livros do Acervo");

        comboFiltro.setBackground(new java.awt.Color(255, 255, 255));
        comboFiltro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        comboFiltro.setForeground(new java.awt.Color(0, 0, 0));
        comboFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gêneros", " " }));
        comboFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFiltroActionPerformed(evt);
            }
        });

        tabelaRegistro.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        tabelaRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Título da Obra", "Data do Cadastro", "Gêneros ", "Subgêneros ", "Autor(a)", "Nº de Registro", "Edição", "Volume", "Localização", "Editora", "Ano", "Aquisição", "Exemplar", "Isbn", "Nº da Chamada"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaRegistro);

        boxAutor.setBackground(new java.awt.Color(255, 255, 255));
        boxAutor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        boxAutor.setForeground(new java.awt.Color(0, 0, 0));
        boxAutor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Autor(a)" }));

        jComboBoxData.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxData.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBoxData.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxData.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Data do Cadastro" }));

        pesquisarCampo.setBackground(new java.awt.Color(255, 255, 255));
        pesquisarCampo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pesquisarCampo.setForeground(new java.awt.Color(0, 0, 0));
        pesquisarCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarCampoActionPerformed(evt);
            }
        });

        iconePesquisa.setBackground(new java.awt.Color(255, 255, 255));
        iconePesquisa.setIcon(new javax.swing.ImageIcon("C:\\Users\\ALUNO\\Downloads\\IconePesquisar.png")); // NOI18N

        javax.swing.GroupLayout princPanelLayout = new javax.swing.GroupLayout(princPanel);
        princPanel.setLayout(princPanelLayout);
        princPanelLayout.setHorizontalGroup(
            princPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(princPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(listihna)
                .addGroup(princPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(princPanelLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(comboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boxAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxData, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(873, 873, 873)
                        .addComponent(pesquisarCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iconePesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(princPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(escrevaLista)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(princPanelLayout.createSequentialGroup()
                .addGroup(princPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelWhite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1920, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelSec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        princPanelLayout.setVerticalGroup(
            princPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(princPanelLayout.createSequentialGroup()
                .addComponent(panelWhite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(princPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listihna)
                    .addGroup(princPanelLayout.createSequentialGroup()
                        .addComponent(escrevaLista, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(princPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(iconePesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(princPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(boxAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBoxData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(comboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(pesquisarCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(princPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(princPanelLayout.createSequentialGroup()
                        .addGap(0, 72, Short.MAX_VALUE)
                        .addComponent(painelSec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(0, 0, 0))
        );

        guiaRegistroEmprestimo.setIcon(new javax.swing.ImageIcon("C:\\Users\\ALUNO\\Documents\\NetBeansProjects\\BibliotecaSyncria - Copia\\BibliotecaSyncria\\src\\main\\java\\Images\\zregistro de emprest.png")); // NOI18N
        guiaRegistroEmprestimo.setText("Registro de Empréstimo |");
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

        guiaCadastroLivros.setIcon(new javax.swing.ImageIcon("C:\\Users\\ALUNO\\Documents\\NetBeansProjects\\BibliotecaSyncria - Copia\\BibliotecaSyncria\\src\\main\\java\\Images\\open-book.png")); // NOI18N
        guiaCadastroLivros.setText("Cadastro de Livros |");
        guiaCadastroLivros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guiaCadastroLivrosMouseClicked(evt);
            }
        });
        menuDeNavegacao.add(guiaCadastroLivros);

        guiaListaLivrosAcervo.setIcon(new javax.swing.ImageIcon("C:\\Users\\ALUNO\\Downloads\\open-book.png")); // NOI18N
        guiaListaLivrosAcervo.setText("Lista de Livros no Acervo |");
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

        guiaGrafico.setIcon(new javax.swing.ImageIcon("C:\\Users\\ALUNO\\Downloads\\vinticuatro.png")); // NOI18N
        guiaGrafico.setText("Gráfico");
        menuDeNavegacao.add(guiaGrafico);

        setJMenuBar(menuDeNavegacao);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(princPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1920, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(princPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void comboFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboFiltroActionPerformed

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

    private void guiaListaLivrosEmprestadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guiaListaLivrosEmprestadosMouseClicked
        // TODO add your handling code here:

        
        //criar objeto da classe 
        ListaDeLivrosEmprestados listaEmprestado = new ListaDeLivrosEmprestados();
        // abrindo a tela
        listaEmprestado.setVisible(true);
        // fechar tela de login
        dispose();
        ;
    }//GEN-LAST:event_guiaListaLivrosEmprestadosMouseClicked

    private void guiaCadastroLivrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guiaCadastroLivrosMouseClicked
        // TODO add your handling code here:

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
        TelaRankingDeLeitores tela2ParaTela5 = new TelaRankingDeLeitores();

        //Abrindo a tela 6 para tela 5
        tela2ParaTela5.setVisible(true);

        //Fechando a tela
      dispose();
    }//GEN-LAST:event_guiaRankingLeitoresMouseClicked

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

    private void pesquisarCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarCampoActionPerformed
        // TODO add your handling code here: 
        
        
        
    }//GEN-LAST:event_pesquisarCampoActionPerformed

    
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
        java.util.logging.Logger.getLogger(ListaDeLivrosNoAcervo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(ListaDeLivrosNoAcervo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(ListaDeLivrosNoAcervo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(ListaDeLivrosNoAcervo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new ListaDeLivrosNoAcervo().setVisible(true);
        }
    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxAutor;
    private javax.swing.JComboBox<String> comboFiltro;
    private javax.swing.JLabel escreva1;
    private javax.swing.JLabel escrevaLista;
    private javax.swing.JMenu guiaBancoDadosTurmas;
    private javax.swing.JMenu guiaCadastroLivros;
    private javax.swing.JMenu guiaGrafico;
    private javax.swing.JMenu guiaListaLivrosAcervo;
    private javax.swing.JMenu guiaListaLivrosEmprestados;
    private javax.swing.JMenu guiaRankingLeitores;
    private javax.swing.JMenu guiaRegistroEmprestimo;
    private javax.swing.JLabel iconePesquisa;
    private javax.swing.JComboBox<String> jComboBoxData;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel listihna;
    private javax.swing.JLabel livroI;
    private javax.swing.JMenuBar menuDeNavegacao;
    private javax.swing.JPanel painelSec;
    private javax.swing.JPanel panelWhite;
    private javax.swing.JTextField pesquisarCampo;
    private javax.swing.JPanel princPanel;
    private javax.swing.JTable tabelaRegistro;
    // End of variables declaration//GEN-END:variables
}
