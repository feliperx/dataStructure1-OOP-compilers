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
public class CharAtUpperLower { 
    
       public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog(null, "Digite um frase: ");
        int tamanho = frase.length();

        JOptionPane.showMessageDialog(null, "Quantidade de caracteres" + tamanho);

        JOptionPane.showMessageDialog(null,
                "\n caracter 0: " + frase.charAt(0) + "\n caracter 1: " + frase.charAt(1) + "\n caracter 2: "
                        + frase.charAt(2) + "\n caracter 3: " + frase.charAt(3) + "\n caracter 4: " + frase.charAt(4)

                        + "\n UPPER: " + frase.toUpperCase() + "\n LOWER: " + frase.toLowerCase()

        );

        System.exit(0);

    }
    
}
