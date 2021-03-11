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
public class Matriz02_2 {

    public static void main(String[] args) {

        int[][][] cubo = {{{1, 2}, {3, 4}, {5, 6}}, {{7, 8}, {9, 10}, {11, 12}}}; // Mais utilizado

        int somaPares = 0, somaImpares = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 2; k++) {
                    System.out.println("[" + i + "," + j + "," + k + "]" + cubo[i][j][k]);

                    if (cubo[i][j][k] % 2 == 0) {
                        somaPares += cubo[i][j][k];
                    } else {
                        somaImpares += cubo[i][j][k];
                    }

                }

                System.out.println("\n");
            }
            System.out.println("\n");

        }

        JOptionPane.showMessageDialog(null, "Soma dos valores pares: " + somaPares
                + "\n Soma Impares: " + somaImpares);
        System.exit(0);
    }

}
