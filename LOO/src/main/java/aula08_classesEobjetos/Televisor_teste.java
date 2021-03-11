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
public class Televisor_teste {
    
    /**
     * 
     * 1) Declarar objeto 
     * 2) Instaciar o objeto 
     * 3) Inicializar o objeto (valores aos atributos)
     * 
     *  
     * @param args
     */
    
    
    public static void main(String[] args) { 
        
        /**
         * Declaração e criação do objeto tv a partir da classe Televisor 
         * Tv vai receber todas as características da classe Televisor 
         * ou seja todos os atributos e metodos 
         * 
         */
        
    Televisor tv1 = new Televisor();
    tv1.canal = 12; 
    tv1.volume = 24; 
    
    
    tv1.aumentaVolume();
    tv1.aumentaVolume();  
    tv1.trocaCanal(10);
   
    
    
    System.exit(0);
    }
    
}
