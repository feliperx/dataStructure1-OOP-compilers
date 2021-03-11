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
public class Canguru extends Mamifero {

    @Override // SOBREPOSICAO
    public void locomover() {
        System.out.println("Saltando.");
    }

    public void usaBolsa() {
        System.out.println("Usa Bolsa.");
    }

}
