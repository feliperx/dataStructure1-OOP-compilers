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
public class Mamifero extends Animal { 
    
    private String corPelo; 

    @Override
    public void locomover() {
        System.out.println("Caminhando."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Rosnando.");
    }
    
    

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    } 
    
    
}
