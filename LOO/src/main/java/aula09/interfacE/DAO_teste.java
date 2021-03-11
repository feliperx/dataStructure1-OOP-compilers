/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09.interfacE;

/**
 *
 * @author felipex
 */
public class DAO_teste {
    
    public static void main(String[] args) { 
        
        Cliente ci = new Cliente(); 
        ci.setCodigo(1);
        ci.setNome("Aryel"); 
        
        System.out.println("Cliente: " + ci.getNome() + "\nId: " + ci.getCodigo());
        
        
        
        
        System.exit(0);
    }
    
}
