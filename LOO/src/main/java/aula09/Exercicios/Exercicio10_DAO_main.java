/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09.Exercicios;


/**
 *
 * @author felipex
 */
public class Exercicio10_DAO_main {
    
    public static void main(String[] args) { 
        
        Exercicio10_Cliente ci = new Exercicio10_Cliente(); 
        ci.setCodigo(1);
        ci.setNome("Aryel"); 
        
        System.out.println("Cliente: " + ci.getNome() + "\nId: " + ci.getCodigo());
        
        
        
        
        System.exit(0);
    }
    
}
