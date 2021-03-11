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
public class IndexOf_BuscasDentroDaString {

    public static void main(String[] args) {

        String frase = " Estou aprendendo java! ";

        char caracter = 'a';

        JOptionPane.showMessageDialog(null, "Frase: " + frase
                + "\n Indice letra a: " + frase.indexOf(caracter)
                + "\n Indice a partir da posicao 5: " + frase.indexOf(caracter, 5)
                + "\n Busca substing 'java': " + frase.indexOf("java")
                + "\n Busca substring 'java' a partir da posicao 20: " + frase.indexOf("java", 20)
        );

    }

}
