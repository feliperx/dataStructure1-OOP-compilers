/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herancaEpolimorfismo;

/**
 *
 * @author felipex
 */
public class Leao extends Mamifero { 

    @Override//SOBREPOSICAO
    public void emitirSom() {
        System.out.println("Rujindo.");
    }
    
    
    
}
