/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Padrao;

import javax.swing.JPanel;

/**
 *
 * @author andre
 */
public abstract class InterfacePadrao extends JPanel{
    protected Object objeto;
    public abstract Object getObjeto();   
    public  void setObjeto(Object o){
        objeto=o;
    };   
}
