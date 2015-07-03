package admin;

import dao.PessoaDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Pessoa;

public class pessoaManter extends javax.swing.JFrame {

    private List<Pessoa> lista ; // criando a lista
    private int posicao = 0;
    PessoaDAO dao;

    public pessoaManter() {
        initComponents();
        dao = new PessoaDAO();
        lista = dao.listar();
    }

    public void Limpar() {
        txtcod.setText(null);
        txtnome.setText(null);
        boxsexo.setSelectedIndex(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        primeiro = new javax.swing.JButton();
        anterior = new javax.swing.JButton();
        proximo = new javax.swing.JButton();
        ultimo = new javax.swing.JButton();
        Codigo = new javax.swing.JLabel();
        Nome = new javax.swing.JLabel();
        Sexo = new javax.swing.JLabel();
        txtcod = new javax.swing.JTextField();
        txtnome = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        cadastrar = new javax.swing.JButton();
        excluir = new javax.swing.JButton();
        consultar = new javax.swing.JButton();
        limpar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        listagem = new javax.swing.JButton();
        boxsexo = new javax.swing.JComboBox();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NAVEGAÇÃO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 14), new java.awt.Color(0, 0, 204))); // NOI18N
        jPanel1.setLayout(new java.awt.GridBagLayout());

        primeiro.setText("Primeiro");
        primeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primeiroActionPerformed(evt);
            }
        });
        jPanel1.add(primeiro, new java.awt.GridBagConstraints());

        anterior.setText("Anterior");
        anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anteriorActionPerformed(evt);
            }
        });
        jPanel1.add(anterior, new java.awt.GridBagConstraints());

        proximo.setText("Próximo ");
        proximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proximoActionPerformed(evt);
            }
        });
        jPanel1.add(proximo, new java.awt.GridBagConstraints());

        ultimo.setText("Último");
        ultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ultimoActionPerformed(evt);
            }
        });
        jPanel1.add(ultimo, new java.awt.GridBagConstraints());

        Codigo.setText(" Código:");

        Nome.setText("Nome:");

        Sexo.setText("Sexo:");

        txtcod.setEnabled(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ações", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 12), new java.awt.Color(0, 0, 153)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 12))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(0, 0, 153));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        cadastrar.setText("Cadastrar");
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });
        jPanel2.add(cadastrar, new java.awt.GridBagConstraints());

        excluir.setText("Excluir");
        excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirActionPerformed(evt);
            }
        });
        jPanel2.add(excluir, new java.awt.GridBagConstraints());

        consultar.setText("Consultar");
        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });
        jPanel2.add(consultar, new java.awt.GridBagConstraints());

        limpar.setText("Limpar");
        limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparActionPerformed(evt);
            }
        });
        jPanel2.add(limpar, new java.awt.GridBagConstraints());

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setText("PESSOA");

        listagem.setText("Listagem");
        listagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listagemActionPerformed(evt);
            }
        });

        boxsexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecionar", "Masculino", "Feminino" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nome)
                            .addComponent(Sexo))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtcod, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                            .addComponent(txtnome)
                            .addComponent(boxsexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(291, 291, 291)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(listagem)
                        .addGap(42, 42, 42)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(listagem)))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Codigo)
                    .addComponent(txtcod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nome)
                    .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sexo)
                    .addComponent(boxsexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void primeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primeiroActionPerformed
        primeiro.setEnabled(true);
        anterior.setEnabled(false);
        proximo.setEnabled(true);
        ultimo.setEnabled(true);

        posicao = 0;

        Pessoa p = lista.get(0);
        if (lista.size() > 0) {
            txtnome.setText(p.getNome());
            txtcod.setText(p.getCod().toString());
            if (p.getSexo().equals("Feminino")) {
                boxsexo.setSelectedIndex(2);
            } else {
                boxsexo.setSelectedIndex(1);
            }
            if (lista.size() == 2) {
                proximo.setEnabled(false);
                anterior.setEnabled(false);
            }
        }
    }

    private void btProximoActionPerformed(java.awt.event.ActionEvent evt) {
        primeiro.setEnabled(true);
        anterior.setEnabled(true);
        proximo.setEnabled(true);
        ultimo.setEnabled(true);

        posicao = posicao + 2;

        Pessoa p = lista.get(posicao);
        txtnome.setText(p.getNome());
        txtcod.setText(p.getCod().toString());
        if (p.getSexo().equals("Feminino")) {
            boxsexo.setSelectedIndex(2);
        } else {
            boxsexo.setSelectedIndex(1);
        }

        if (posicao == lista.size() - 2) {
            proximo.setEnabled(false);
            ultimo.setEnabled(true);
        }
    }//GEN-LAST:event_primeiroActionPerformed

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
        Pessoa p = new Pessoa();
        Boolean y = false;

        if (txtnome.getText().isEmpty() || boxsexo.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Preencha todas as lacunas!");
        } else {
            y = true;
            p.setNome(txtnome.getText());
            p.setSexo(boxsexo.getSelectedItem().toString());
        }
        if (y == true) {
            Boolean retorno = dao.inserir(p);
            if (retorno){
                JOptionPane.showMessageDialog(rootPane, "Pessoa cadastrada com sucesso!!!");
                lista = dao.listar();
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "Erro ao cadastrar!");
            }           
        }
        Limpar();
    }//GEN-LAST:event_cadastrarActionPerformed

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
        if (txtcod.getText().isEmpty() == false) {
            PessoaDAO dao = new PessoaDAO();
            Boolean deucerto = dao.excluir(lista.get(posicao));

            if (deucerto == true) {
                JOptionPane.showMessageDialog(rootPane, "Excluído com sucesso");
                lista = dao.listar();
                Limpar();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Erro ao excluir!");
            }

        }
    }//GEN-LAST:event_excluirActionPerformed

    private void limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparActionPerformed
        Limpar();
    }//GEN-LAST:event_limparActionPerformed

    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed
        Pessoa p = new Pessoa();

        String nome = JOptionPane.showInputDialog("Informe o nome da pessoa a ser pesquisado:");
        int posicaoachou = 0;
        Boolean encontrou = false;

        for (Pessoa lista2 : lista) {
            if (nome.equalsIgnoreCase(lista2.getNome())) {
                posicao = posicaoachou;
                encontrou = true;
                txtcod.setText(lista2.getCod().toString());
                txtnome.setText(lista2.getNome());
                if (lista2.getSexo().equalsIgnoreCase("Feminino")) {
                    boxsexo.setSelectedIndex(2);
                }
            } else {
                boxsexo.setSelectedIndex(1);
            }
            break;
        }
        if (encontrou == false) {
            JOptionPane.showMessageDialog(null, "Essa pessoa não está cadastrada!");
        }

    }//GEN-LAST:event_consultarActionPerformed

    private void anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anteriorActionPerformed
        primeiro.setEnabled(true);
        anterior.setEnabled(true);
        proximo.setEnabled(false);
        ultimo.setEnabled(true);

        if (posicao > 0) {
            posicao = posicao - 1;
            Pessoa p = lista.get(posicao);
            txtnome.setText(p.getNome());
            txtcod.setText(p.getCod().toString());
            if (p.getSexo().equals("Feminino")) {
                boxsexo.setSelectedIndex(2);
            } else {
                boxsexo.setSelectedIndex(1);
            }
        }
    }//GEN-LAST:event_anteriorActionPerformed

    private void proximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proximoActionPerformed
        primeiro.setEnabled(true);
        anterior.setEnabled(true);
        proximo.setEnabled(true);
        ultimo.setEnabled(true);

        posicao = posicao + 1;

        Pessoa p = lista.get(posicao);
        txtnome.setText(p.getNome());
        txtcod.setText(p.getCod().toString());
        if (p.getSexo().equals("Feminino")) {
            boxsexo.setSelectedIndex(2);
        } else {
            boxsexo.setSelectedIndex(1);
        }

        if (posicao == lista.size() - 1) {
            proximo.setEnabled(false);
            ultimo.setEnabled(true);
        }
    }//GEN-LAST:event_proximoActionPerformed

    private void ultimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ultimoActionPerformed
        primeiro.setEnabled(true);
        anterior.setEnabled(true);
        proximo.setEnabled(false);
        ultimo.setEnabled(false);

        posicao = lista.size() - 1;
        Pessoa p = lista.get(posicao);
        txtnome.setText(p.getNome());
        txtcod.setText(p.getCod().toString());
        if (p.getSexo().equals("Feminino")) {
            boxsexo.setSelectedIndex(2);
        } else {
            boxsexo.setSelectedIndex(1);
        }
    }//GEN-LAST:event_ultimoActionPerformed

    private void listagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listagemActionPerformed
        pessoaListagem listagem = new pessoaListagem();
        listagem.setVisible(true);
        dispose();
    }//GEN-LAST:event_listagemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(pessoaManter.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pessoaManter.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pessoaManter.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pessoaManter.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pessoaManter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Codigo;
    private javax.swing.JLabel Nome;
    private javax.swing.JLabel Sexo;
    private javax.swing.JButton anterior;
    private javax.swing.JComboBox boxsexo;
    private javax.swing.JButton cadastrar;
    private javax.swing.JButton consultar;
    private javax.swing.JButton excluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton limpar;
    private javax.swing.JButton listagem;
    private javax.swing.JButton primeiro;
    private javax.swing.JButton proximo;
    private javax.swing.JTextField txtcod;
    private javax.swing.JTextField txtnome;
    private javax.swing.JButton ultimo;
    // End of variables declaration//GEN-END:variables
}
