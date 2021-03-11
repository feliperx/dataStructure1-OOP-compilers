/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09.herancaEpolimorfismo;

/**
 *
 * @author felipex
 */
public class Teste { 
    
    public static void main(String[] args) {
        
        Mamifero m1 = new Mamifero(); 
        Reptil r = new Reptil(); 
        
        Canguru c = new Canguru();
        Leao l = new Leao(); 
        
        l.locomover(); 
        c.locomover();
        
        l.emitirSom();
        c.emitirSom(); 
        
        //Exemplos de polimorfismo do tipo sobrecarga
        
        Cachorro ca = new Cachorro(); 
        ca.reagir("Vem ntsntsnts");
        ca.reagir(false);
        ca.reagir(20, 10);
        
        
        System.exit(0);
    }
    
}
