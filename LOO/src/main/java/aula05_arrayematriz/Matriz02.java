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
public class Matriz02 {

    public static void main(String[] args) {
        int[][][] matriz = {{{1, 2}, {3, 4}, {5, 6}}, {{7, 8}, {9, 10}, {11, 12}}};

        int somaPares = 0, somaImpares = 0, somaPares2 = 0, somaImpares2 = 0;

        //usando for classico
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                for (int diagonal = 0; diagonal < matriz[linha][coluna].length; diagonal++) {
                    System.out.println("|" + linha + "|" + coluna + "|"
                            + matriz[linha][coluna][diagonal]);

                    if (matriz[linha][coluna][diagonal] % 2 == 0) {
                        somaPares += matriz[linha][coluna][diagonal];
                    } else {
                        somaImpares += matriz[linha][coluna][diagonal];
                    }
                }
            }
            System.out.println("\n");
        }

        //Usando foreach
        for (int[][] ref1 : matriz) {
            for (int[] ref2 : ref1) {
                for (int lcd : ref2) {
                    System.out.println(lcd);
                    System.out.println("\n|" + ref1 + "|" + ref2 + "|"
                            + lcd); // ref1 e ref2 são apenas enderecos de memoria

                    if (lcd % 2 == 0) {
                        somaPares2 += lcd;
                    } else {
                        somaImpares2 += lcd;
                    }
                }
            }
        }

        JOptionPane.showMessageDialog(null, "\nSoma doas valores pares: " + somaPares
                + "\nSoma dos valores Impares: " + somaImpares);
        JOptionPane.showMessageDialog(null, "\nSoma doas valores pares do segundo for: " + somaPares2
                + "\nSoma dos valores Impares do segundo for: " + somaImpares2);
    }

}
