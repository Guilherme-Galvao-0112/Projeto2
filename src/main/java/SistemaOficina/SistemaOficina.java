package SistemaOficina;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import Telas.TelaLogin;
import javax.swing.JFrame;

/**
 *
 * @author dell
 */
public class SistemaOficina {
    public static void main(String [] args) throws ClassNotFoundException, InstantiationException, IllegalAccessError{
        
 
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
                TelaLogin login = new TelaLogin();
                login.setExtendedState(JFrame.NORMAL);
                login.setVisible(true);
            }
        });
    }
}
