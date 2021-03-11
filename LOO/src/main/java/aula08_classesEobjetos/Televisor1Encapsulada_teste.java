/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula08_classesEobjetos;

/**
 *
 * @author felipex
 */
public class Televisor1Encapsulada_teste { 
    
    public static void main(String[] args) {
        
        Televisor1Encapsulada tv1 = new Televisor1Encapsulada(); 
        
        tv1.aumentaCanal();
        tv1.aumentaCanal();
        
        System.out.println(" Canal: " + tv1.getCanal());
        
        tv1.setCanal(10); 
        
        System.out.println(" Canal: " + tv1.getCanal() + "\nVolume: " + tv1.getVolume());
        
        tv1.setVolume(10); 
        
        
        
    }
    
}
