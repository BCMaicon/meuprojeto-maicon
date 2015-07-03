/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import dao.JogadorDAO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import modelo.ManipularImagem;
import modelo.jogador;

/**
 *
 * @author Administrador
 */
public class jogadorManter extends javax.swing.JFrame {

    /**
     * Creates new form jogadorManter
     */
    private List<jogador> lista;
    private Integer posicao = 0;
    private BufferedImage imagem;

    public jogadorManter() {
        initComponents();
        // Bujscar a lista no banco de dados
        JogadorDAO dao = new JogadorDAO();
        lista = dao.listar();

        //lista = new ArrayList<jogador>();
    }

    public void Limpar() {
        txtlogin.setText(null);
        txtemail.setText(null);
        txtsenha.setText(null);
        lblarquivo.setIcon(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        primeiro = new javax.swing.JButton();
        anterior = new javax.swing.JButton();
        proximo = new javax.swing.JButton();
        ultimo = new javax.swing.JButton();
        Nome = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cadastrar = new javax.swing.JButton();
        excluir = new javax.swing.JButton();
        consultar = new javax.swing.JButton();
        limpar = new javax.swing.JButton();
        atualizar = new javax.swing.JButton();
        Codigo = new javax.swing.JLabel();
        txtsenha = new javax.swing.JTextField();
        Sexo = new javax.swing.JLabel();
        txtlogin = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        listagem = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblarquivo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btselecionarfoto = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setText("JOGADOR");

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

        Nome.setText("Senha:");

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
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 6;
        jPanel2.add(excluir, gridBagConstraints);

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

        atualizar.setText("Atualizar");
        atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarActionPerformed(evt);
            }
        });
        jPanel2.add(atualizar, new java.awt.GridBagConstraints());

        Codigo.setText("Login:");

        Sexo.setText("Email:");

        listagem.setText("Listagem de jogadores");
        listagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listagemActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblarquivo, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblarquivo, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
        );

        jLabel3.setText("Foto:");

        btselecionarfoto.setText("Selecionar foto");
        btselecionarfoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btselecionarfotoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(89, 89, 89)))
                .addGap(67, 67, 67)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nome)
                    .addComponent(Sexo)
                    .addComponent(jLabel3))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btselecionarfoto)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtlogin)
                        .addComponent(txtsenha)
                        .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(listagem, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Codigo)
                    .addComponent(txtlogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Nome)
                    .addComponent(txtsenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sexo)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btselecionarfoto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(listagem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void primeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primeiroActionPerformed
        primeiro.setEnabled(true);
        anterior.setEnabled(false);
        proximo.setEnabled(true);
        ultimo.setEnabled(true);

        posicao = 0;

        jogador j = lista.get(0);
        if (lista.size() > 0) {
            txtemail.setText(j.getEmail());
            txtlogin.setText(j.getLogin());
            txtsenha.setText(j.getSenha());
            ManipularImagem.exibiImagemLabel(j.getImagem(), lblarquivo);

            if (lista.size() == 1) {
                proximo.setEnabled(false);
                anterior.setEnabled(false);
            }
        } else {
            JOptionPane.showMessageDialog(null, " Não há nenhum jogador cadastrado!!!");
        }
    }

    private void btProximoActionPerformed(java.awt.event.ActionEvent evt) {
        primeiro.setEnabled(true);
        anterior.setEnabled(true);
        proximo.setEnabled(true);
        ultimo.setEnabled(true);

        posicao = posicao + 1;

        jogador j = lista.get(posicao);
        txtlogin.setText(j.getLogin());
        txtsenha.setText(j.getSenha());
        txtemail.setText(j.getEmail());
        ManipularImagem.exibiImagemLabel(j.getImagem(), lblarquivo);

        if (posicao == lista.size() - 1) {
            proximo.setEnabled(false);
            ultimo.setEnabled(true);
        }
    }//GEN-LAST:event_primeiroActionPerformed

    private void anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anteriorActionPerformed
        primeiro.setEnabled(true);
        anterior.setEnabled(true);
        proximo.setEnabled(false);
        ultimo.setEnabled(true);

        if (posicao > 0) {
            posicao = posicao - 1;
            jogador j = lista.get(posicao);
            txtemail.setText(j.getEmail());
            txtlogin.setText(j.getLogin());
            txtsenha.setText(j.getSenha());
            ManipularImagem.exibiImagemLabel(j.getImagem(), lblarquivo);

        } else {
            JOptionPane.showMessageDialog(null, " Não há nenhum jogador cadastrado!!!");
        }
    }//GEN-LAST:event_anteriorActionPerformed

    private void proximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proximoActionPerformed
        primeiro.setEnabled(true);
        anterior.setEnabled(true);
        proximo.setEnabled(true);
        ultimo.setEnabled(true);

        posicao = posicao + 1;

        jogador j = lista.get(posicao);
        txtemail.setText(j.getEmail());
        txtsenha.setText(j.getSenha());
        txtlogin.setText(j.getLogin());
        ManipularImagem.exibiImagemLabel(j.getImagem(), lblarquivo);

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
        jogador j = lista.get(posicao);
        txtemail.setText(j.getEmail());
        txtsenha.setText(j.getSenha());
        txtlogin.setText(j.getLogin());
        ManipularImagem.exibiImagemLabel(j.getImagem(), lblarquivo);


    }//GEN-LAST:event_ultimoActionPerformed

    private void listagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listagemActionPerformed
        jogadorListagem listagem = new jogadorListagem();
        listagem.setVisible(true);
        dispose();
    }//GEN-LAST:event_listagemActionPerformed

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
        jogador j = new jogador();
        Boolean y = false;

        if (txtemail.getText().isEmpty() || txtlogin.getText().isEmpty() || txtemail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Preencha todas as lacunas!");
            y = false;

        } else {
            j.setEmail(txtemail.getText());
            j.setLogin(txtlogin.getText());
            j.setSenha(txtsenha.getText());
            j.setImagem(ManipularImagem.getImgBytes(imagem));
 
            y = true;
        }

        if (y == true) {
            JogadorDAO dao = new JogadorDAO();
            //chamo o inserir
            dao.inserir(j);
            JOptionPane.showMessageDialog(rootPane, "Jogador cadastrado com sucesso!!!");
        }
        lista.add(j);
        Limpar();
    }//GEN-LAST:event_cadastrarActionPerformed

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
        // Se a chave primária foi informada
        if (txtlogin.getText().isEmpty() == false) {
            JogadorDAO dao = new JogadorDAO();
            Boolean deucerto = dao.excluir(lista.get(posicao));
            if (deucerto == true) {
                JOptionPane.showMessageDialog(rootPane, "Excluído com sucesso!");
                lista = dao.listar();
                Limpar();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Erro ao excluir");
            }
        }


    }//GEN-LAST:event_excluirActionPerformed

    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed
        jogador j = new jogador();

        String nome = JOptionPane.showInputDialog("Informe o login do jogador a ser pesquisado:");
        int posicaoachou = 0;
        Boolean encontrou = false;

        for (jogador lista2 : lista) {
            if (nome.equalsIgnoreCase(lista2.getLogin())) {
                posicao = posicaoachou;
                encontrou = true;
                txtlogin.setText(lista2.getLogin());
                txtsenha.setText(lista2.getSenha());
                txtemail.setText(lista2.getEmail());
                break;
            }
            posicaoachou++;

        }
        if (encontrou == false) {
            JOptionPane.showMessageDialog(null, "Esse jogador não está cadastrado!");
        }
    }//GEN-LAST:event_consultarActionPerformed

    private void limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparActionPerformed
        Limpar();
    }//GEN-LAST:event_limparActionPerformed

    private void atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarActionPerformed
        if (txtlogin.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Registro não informado");
        } else {
            jogador jog = new jogador();
            jog.setLogin(txtlogin.getText());
            jog.setEmail(txtemail.getText());
            jog.setSenha(txtsenha.getText());
            jog.setImagem(ManipularImagem.getImgBytes(imagem));
  

            JogadorDAO dao = new JogadorDAO();

            Boolean deucerto;
            deucerto = dao.atualizar(jog);
            if (deucerto == true) {
                JOptionPane.showMessageDialog(rootPane, "Registro alterado com sucesso");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Erro ao alterar o registro");
            }
            //Recarregar a lista
            lista = dao.listar();
        }
    }//GEN-LAST:event_atualizarActionPerformed

    private void btselecionarfotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btselecionarfotoActionPerformed
        JFileChooser fc = new JFileChooser(); // Serve 
        int res = fc.showOpenDialog(null);
        if (res == JFileChooser.APPROVE_OPTION) {
            // pegar o arquivo selecionado
            File file = fc.getSelectedFile();
            imagem = ManipularImagem.setImagemDimensao(file.getAbsolutePath(), 160, 160);
            lblarquivo.setIcon(new ImageIcon(imagem));
        }
    }//GEN-LAST:event_btselecionarfotoActionPerformed

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
            java.util.logging.Logger.getLogger(jogadorManter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jogadorManter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jogadorManter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jogadorManter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jogadorManter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Codigo;
    private javax.swing.JLabel Nome;
    private javax.swing.JLabel Sexo;
    private javax.swing.JButton anterior;
    private javax.swing.JButton atualizar;
    private javax.swing.JButton btselecionarfoto;
    private javax.swing.JButton cadastrar;
    private javax.swing.JButton consultar;
    private javax.swing.JButton excluir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lblarquivo;
    private javax.swing.JButton limpar;
    private javax.swing.JButton listagem;
    private javax.swing.JButton primeiro;
    private javax.swing.JButton proximo;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtlogin;
    private javax.swing.JTextField txtsenha;
    private javax.swing.JButton ultimo;
    // End of variables declaration//GEN-END:variables
}
