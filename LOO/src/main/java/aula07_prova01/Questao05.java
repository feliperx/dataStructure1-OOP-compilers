/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula07_prova01;

import javax.swing.JOptionPane;

/**
 *
 * @author felipex
 */
public class Questao05 {

    public static void main(String[] args) {

        String entrada;
        int tam;

        entrada = (JOptionPane.showInputDialog("Informe o(s) número(s)?"));

        System.out.println(entrada.substring(2));
        System.out.println(entrada.substring(entrada.length() - 2));

        tam = entrada.length();

        for (int i = 0; i < tam; i++) {

            if ((entrada.substring(i, i + 1)).equals(entrada.substring((tam - (i + 1)), (tam - (i))))) {
                JOptionPane.showMessageDialog(null, "É um palídromo!");
                break;

            } else {
                JOptionPane.showMessageDialog(null, "Não é um palídromo!");
                break;

            }

        }

    }

}
