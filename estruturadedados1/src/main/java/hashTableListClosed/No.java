/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashTableListClosed;

/**
 *
 * @author felipex
 */
public class No {

    public int item;
    public No prox; // proximo no da lista

    public No(int valor) {
        item = valor;
    } // construtor

    public void mostra() {
        System.out.print(item + " -> ");
    }

}
