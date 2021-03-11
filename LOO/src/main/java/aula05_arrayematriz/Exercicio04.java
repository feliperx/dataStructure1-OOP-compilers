/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05_arrayematriz;

import javax.swing.JOptionPane;

/**
 *
 * @author felipex
 */
public class Exercicio04 {

    private static boolean par(int n) {
        return (n % 2 == 0);
    }

    private static int numRandom(int min, int max) {
        return (int) (Math.random() * Math.abs(max - min + 1) + min);
    }

    private static String imprimeConteudo(int[] vetor) {
        String output = "";
        for (int i = 0; i < vetor.length; i++) {
            output += vetor[i] + " ";
        }
        output += '\n';

        return output;
    }

    public static void main(String[] args) {

        int size = 10;

        int[] vetorPar = new int[size];
        int[] vetorImpar = new int[size];

        int contPar = 0;
        int contImpar = 0;
        int numSort = 0;

        for (int i = 0; i < size; i++) {
            numSort = numRandom(1, 20);
            if (par(numSort)) {
                vetorPar[contPar] = numSort;
                contPar++;
            } else {
                vetorImpar[contImpar] = numSort;
                contImpar++;
            }
        }

        JOptionPane.showMessageDialog(null, "Par : " + imprimeConteudo(vetorPar) + "Impar : " + imprimeConteudo(vetorImpar));
    }

}
