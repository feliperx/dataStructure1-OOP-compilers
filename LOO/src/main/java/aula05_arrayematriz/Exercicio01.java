/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05_arrayematriz;

import java.text.DecimalFormat;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author felipex
 */
public class Exercicio01 {

    private static float media(float[] notas) {

        float soma = 0;

        for (float nota : notas) {
            soma += nota;
        }

        return soma / notas.length;
    }

    private static float[] reverseSort(float[] notas) {

        float[] sort = new float[notas.length];

        for (int i = 0; i < notas.length; i++) {
            sort[i] = notas[(notas.length - 1) - i];
        }

        return sort;
    }

    private static void imprime(float[] notas) {

        Arrays.sort(notas);
        String output = "Notas: \n";

        DecimalFormat df = new DecimalFormat();
        df.applyPattern("00");

        for (float nota : reverseSort(notas)) {
            output += df.format(nota) + "\n";
        }

        output += "\n> Média: " + df.format(media(notas));

        System.out.println(output);

    }

    public static void main(String[] args) {

        float[] notas = new float[5];

        try {

            for (int i = 0; i < notas.length; i++) {
                notas[i] = Float.parseFloat(
                        JOptionPane.showInputDialog("\nInforme a Nota " + (i + 1) + ": "));
            }

            imprime(notas);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO DE TIPO: " + e.toString());
        }

    }

}
