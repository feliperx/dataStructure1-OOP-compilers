/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03_estrutura.repeticao;

import javax.swing.JOptionPane;

/**
 *
 * @author felipex
 */
public class DoWhile {

    static public void main(String[] args) {
        String palavraChave, correto;

        correto = JOptionPane.showInputDialog("Digite a palavra-chave: ");

        do {
            palavraChave = JOptionPane.showInputDialog("Qual a palavra-chave? ");
        } while (!palavraChave.equals(correto));
    }

}
