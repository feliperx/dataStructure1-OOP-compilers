/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09.construtores;



/**
 *
 * @author felipex
 */
public class TelevisorConstrutores_teste { 
    
    public static void main(String[] args) {
        
        TelevisorConstrutores tv1 = new TelevisorConstrutores(50,12); 
        TelevisorConstrutores tv2 = new TelevisorConstrutores();  
        
        tv1.mostrar(); 
        tv2.mostrar();
        
        
        
        
      System.exit(0);
    }
    
}
