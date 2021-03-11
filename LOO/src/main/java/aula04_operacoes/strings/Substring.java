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
public class Substring {

    public static void main(String[] args) {

        try {
            String frase = JOptionPane.showInputDialog(null, "Digite um frase: ");

            JOptionPane.showMessageDialog(null, "frase: " + frase
                    + "\n (0,2): " + frase.substring(0, 2)
                    + "\n (3,5): " + frase.substring(3, 5)
                    + "\n (7,11): " + frase.substring(7, 11)
                    + "\n (11,14): " + frase.substring(11, 14)
                    + "\n (10): " + frase.substring(10)
            );

        } catch (StringIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }

    }
}
