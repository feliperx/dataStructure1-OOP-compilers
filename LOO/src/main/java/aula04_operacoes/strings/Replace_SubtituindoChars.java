/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04_operacoes.strings;

import javax.swing.JOptionPane;

/**
 *
 * @author felipex
 */
public class Replace_SubtituindoChars {

    public static void main(String[] args) {

        String frase = JOptionPane.showInputDialog(null, "Digite um frase: ");

        JOptionPane.showMessageDialog(null, "Frase: " + frase
                + "\n Retiranddo os espacos: " + frase.replace("", "")
                + "\n Subtituindo a por u: " + frase.replace("a", "u")
        );

    }
}
