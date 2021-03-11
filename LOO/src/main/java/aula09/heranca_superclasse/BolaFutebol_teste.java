/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09.heranca_superclasse;

/**
 *
 * @author felipex
 */
public class BolaFutebol_teste {
    
    public static void main(String[] args) {
        
        BolaFutebol bola1 = new BolaFutebol("Preta", 5, "Futsal");
        
        bola1.mostrar();
        
        //Bola bola2 = new Bola(); erro, pois a superclasse é abstract, ou seja, só pode ser instaciada a partir das subclasses 
        
        
        System.exit(0);
    }
    
}
