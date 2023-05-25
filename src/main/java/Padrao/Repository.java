/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Padrao;


import Banco.BancoJPA;
import java.util.List;

/**
 *
 * @author andre
 */
public abstract class Repository {
    private static final BancoJPA banco;
   
    static{        
        banco = new BancoJPA();
    }
 
     public static List Listar(Class classe, String where){
        return banco.listar(classe, where);
    }
}
