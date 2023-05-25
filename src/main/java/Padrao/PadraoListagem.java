/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Padrao;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dell
 */
public final class PadraoListagem extends javax.swing.JDialog {
    private final PadraoListar padrao;
    private List dados;
    private JTable tabela;
    
    public PadraoListagem(PadraoListar padrao, JTable tabela) {
        this.padrao=padrao;
        atualiza(tabela);        
    }
    public void atualiza(JTable tablea){
        dados = Repository.Listar(padrao.getClass(),"");
        String columNames[] = padrao.getTitulo();
        Object[][] data = new Object[dados.size()][columNames.length];
        for(int i=0;i<dados.size();i++){
            data[i]=padrao.getDados();
        }
        DefaultTableModel dataModel = new DefaultTableModel(data, columNames);
        tabela.setModel(dataModel);
    }

}
