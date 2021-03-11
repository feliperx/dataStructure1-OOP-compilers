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
public class Trim_RetirandoEspaços {

    public static void main(String[] args) {

        String frase = JOptionPane.showInputDialog(null, "Digite um frase: ");

        frase = "    " + frase + "    ";

        JOptionPane.showMessageDialog(null, "Frase: " + frase
                + "Frase - Trim: " + frase.trim()
        );

    }

}
