/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import Banco.BancoJPA;
import Model.Funcionario;
import Padrao.PadraoListagem;
import Padrao.PadraoListar;
import Padrao.Repository;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.Date;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dell
 */
public class TelaFuncionario extends javax.swing.JFrame {
    public TelaFuncionario(MenuPrincipal aThis, boolean par) {
        initComponents();
        atualiza();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanePrincipal = new javax.swing.JPanel();
        JTNome = new javax.swing.JTextField();
        JLNome = new javax.swing.JLabel();
        JTEndereco = new javax.swing.JTextField();
        JLEndereco = new javax.swing.JLabel();
        JLEmail = new javax.swing.JLabel();
        JTEmail = new javax.swing.JTextField();
        JLTelefone = new javax.swing.JLabel();
        BTSalvar = new javax.swing.JButton();
        BTAlterar = new javax.swing.JButton();
        BTExcluir = new javax.swing.JButton();
        JTTelefone = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        JTDNS = new javax.swing.JTextField();
        BTVoltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JLNome.setText("Nome");

        JLEndereco.setText("Endereço");

        JLEmail.setText("Email");

        JLTelefone.setText("Telefone");

        BTSalvar.setText("Salvar");
        BTSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTSalvarActionPerformed(evt);
            }
        });

        BTAlterar.setText("Alterar");
        BTAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTAlterarActionPerformed(evt);
            }
        });

        BTExcluir.setText("Excluir");
        BTExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTExcluirActionPerformed(evt);
            }
        });

        jLabel2.setText("Data Nascimento");

        JTDNS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTDNSActionPerformed(evt);
            }
        });

        BTVoltar.setText("Voltar");
        BTVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPanePrincipalLayout = new javax.swing.GroupLayout(JPanePrincipal);
        JPanePrincipal.setLayout(JPanePrincipalLayout);
        JPanePrincipalLayout.setHorizontalGroup(
            JPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanePrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanePrincipalLayout.createSequentialGroup()
                        .addGroup(JPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(JPanePrincipalLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(JLEndereco))
                            .addComponent(JLNome)
                            .addComponent(JLEmail)
                            .addComponent(JLTelefone))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JTEndereco)
                            .addComponent(JTNome, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                            .addComponent(JTEmail)
                            .addComponent(JTTelefone)
                            .addComponent(JTDNS))
                        .addContainerGap(286, Short.MAX_VALUE))
                    .addGroup(JPanePrincipalLayout.createSequentialGroup()
                        .addComponent(BTSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BTAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTVoltar)
                        .addGap(50, 50, 50))))
        );
        JPanePrincipalLayout.setVerticalGroup(
            JPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanePrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLNome)
                    .addComponent(JTNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(JPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLEndereco)
                    .addComponent(JTEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLTelefone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JTDNS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTSalvar)
                    .addComponent(BTAlterar)
                    .addComponent(BTExcluir)
                    .addComponent(BTVoltar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(Tabela);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 48, Short.MAX_VALUE))
            .addComponent(JPanePrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JPanePrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atualiza() {
        String[] ColumNames = new String[]{"ID","Nome","Endereço","E-Mail","Telefone","Data de Nascimento"};
        BancoJPA banco = new BancoJPA();
        Funcionario f = new Funcionario();
        List<Funcionario> dados = banco.listar(f);
       
        Object[][] data = new Object[dados.size()][ColumNames.length];

        for (int i = 0; i < dados.size(); i++) {
            data[i][0] = dados.get(i).getID();
            data[i][1] = dados.get(i).getNome();
            data[i][2] = dados.get(i).getEndereco();
            data[i][3] = dados.get(i).getEmail();
            data[i][4] = dados.get(i).getTelefone();
            data[i][5] = dados.get(i).getDataDeNascimento();
        }

        DefaultTableModel modelo = new DefaultTableModel(data, ColumNames);
        Tabela.setModel(modelo);
    }
    private void BTSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTSalvarActionPerformed
        if (evt.getSource().equals(BTSalvar)) {
            Funcionario funcionario = new Funcionario();
            funcionario.setNome(JTNome.getText());
            funcionario.setEndereco(JTEndereco.getText());
            funcionario.setEmail(JTEmail.getText());
            funcionario.setTelefone(JTTelefone.getText());
            funcionario.setDataDeNascimento(new Date(JTDNS.getText()));
            BancoJPA banco = new BancoJPA();
            banco.inserir(funcionario);
            atualiza();
            JOptionPane.showMessageDialog(rootPane, "Cliente Adicionado");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Erro ao Salvar");
        }
        


    }//GEN-LAST:event_BTSalvarActionPerformed

    private void BTAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTAlterarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTAlterarActionPerformed

    private void BTExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTExcluirActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_BTExcluirActionPerformed

    private void JTDNSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTDNSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTDNSActionPerformed

    private void BTVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_BTVoltarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTAlterar;
    private javax.swing.JButton BTExcluir;
    private javax.swing.JButton BTSalvar;
    private javax.swing.JButton BTVoltar;
    private javax.swing.JLabel JLEmail;
    private javax.swing.JLabel JLEndereco;
    private javax.swing.JLabel JLNome;
    private javax.swing.JLabel JLTelefone;
    private javax.swing.JPanel JPanePrincipal;
    private javax.swing.JTextField JTDNS;
    private javax.swing.JTextField JTEmail;
    private javax.swing.JTextField JTEndereco;
    private javax.swing.JTextField JTNome;
    private javax.swing.JTextField JTTelefone;
    private javax.swing.JTable Tabela;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
