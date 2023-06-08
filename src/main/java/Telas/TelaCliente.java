/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import Banco.BancoJPA;
import Model.Cliente;
import Padrao.PadraoListagem;
import Padrao.PadraoListar;
import Padrao.Repository;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
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
public class TelaCliente extends javax.swing.JFrame {

    /**
     * Creates new form TelaCliente
     */
    public TelaCliente(MenuPrincipal aThis, boolean par) {
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
        JLCPF = new javax.swing.JLabel();
        BTSalvar = new javax.swing.JButton();
        BTAlterar = new javax.swing.JButton();
        BTExcluir = new javax.swing.JButton();
        JTTelefone = new javax.swing.JTextField();
        JTCPF = new javax.swing.JTextField();
        BTVoltar = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JLNome.setText("Nome");

        JLEndereco.setText("Endereço");

        JLEmail.setText("Email");

        JLTelefone.setText("Telefone");

        JLCPF.setText("CPF");

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
                            .addGroup(JPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(JPanePrincipalLayout.createSequentialGroup()
                                    .addGroup(JPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(JLTelefone)
                                        .addComponent(JLCPF)
                                        .addComponent(JLEmail))
                                    .addGap(12, 12, 12))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanePrincipalLayout.createSequentialGroup()
                                    .addComponent(JLEndereco)
                                    .addGap(8, 8, 8)))
                            .addGroup(JPanePrincipalLayout.createSequentialGroup()
                                .addComponent(JLNome)
                                .addGap(24, 24, 24)))
                        .addGroup(JPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(JTEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                            .addComponent(JTTelefone, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTEndereco, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTCPF, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTNome, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(JPanePrincipalLayout.createSequentialGroup()
                        .addComponent(BTSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BTAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BTExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        JPanePrincipalLayout.setVerticalGroup(
            JPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanePrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLNome)
                    .addComponent(JTNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(JPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanePrincipalLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(JPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLEndereco)
                            .addComponent(JTEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanePrincipalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(JPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLEmail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLTelefone))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLCPF))))
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
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
                    .addComponent(JPanePrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JPanePrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atualiza() {
        String[] ColumNames = new String[]{"ID", "Nome", "Endereço", "Email", "Telefone", "CPF"};
        BancoJPA banco = new BancoJPA();
        Cliente c = new Cliente();
        List<Cliente> dados = banco.listar(c);

        Object[][] data = new Object[dados.size()][ColumNames.length];

        for (int i = 0; i < dados.size(); i++) {
            data[i][0] = dados.get(i).getId();
            data[i][1] = dados.get(i).getName();
            data[i][2] = dados.get(i).getEndereco();
            data[i][3] = dados.get(i).getEmail();
            data[i][4] = dados.get(i).getTelefone();
            data[i][5] = dados.get(i).getCPF();
        }

        DefaultTableModel modelo = new DefaultTableModel(data, ColumNames);
        Tabela.setModel(modelo);

    }
    private void BTSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTSalvarActionPerformed
        if (evt.getSource().equals(BTSalvar)) {
            Cliente cliente = new Cliente();
            cliente.setName(JTNome.getText());
            cliente.setEndereco(JTEndereco.getText());
            cliente.setEmail(JTEmail.getText());
            cliente.setTelefone(JTTelefone.getText());
            cliente.setCPF(JTCPF.getText());
            BancoJPA banco = new BancoJPA();
            banco.inserir(cliente);
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
        if (evt.getSource().equals(BTExcluir)) {
            Cliente cliente = new Cliente();
                String nID = JOptionPane.showInputDialog( "Informe o ID a ser Excluido");
                int ID = Integer.parseInt(nID);
                cliente.setId(ID);
                
                BancoJPA banco = new BancoJPA();
                banco.remove(cliente);
                atualiza();
        }else{
            JOptionPane.showMessageDialog(rootPane, "Erro");
        }
        
    }//GEN-LAST:event_BTExcluirActionPerformed

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
    private javax.swing.JToggleButton BTVoltar;
    private javax.swing.JLabel JLCPF;
    private javax.swing.JLabel JLEmail;
    private javax.swing.JLabel JLEndereco;
    private javax.swing.JLabel JLNome;
    private javax.swing.JLabel JLTelefone;
    private javax.swing.JPanel JPanePrincipal;
    private javax.swing.JTextField JTCPF;
    private javax.swing.JTextField JTEmail;
    private javax.swing.JTextField JTEndereco;
    private javax.swing.JTextField JTNome;
    private javax.swing.JTextField JTTelefone;
    private javax.swing.JTable Tabela;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
