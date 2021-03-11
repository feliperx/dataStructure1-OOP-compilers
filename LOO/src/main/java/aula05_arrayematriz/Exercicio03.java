/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05_arrayematriz;

/**
 *
 * @author felipex
 */
public class Exercicio03 {

    private static int corRandom() {
        return (int) (Math.random() * 256);
    }

    private static int[][] construtorMatrizDeCores(int largura, int altura) {
        int[][] matriz = new int[largura][altura];

        for (int indexLargura = 0; indexLargura < largura; indexLargura++) {
            for (int indexAltura = 0; indexAltura < altura; indexAltura++) {
                matriz[indexLargura][indexAltura] = corRandom();
            }
        }

        return matriz;
    }

    private static void imprimeMatriz(int[][] matriz, int largura, int altura) {
        String output = "";

        for (int indexLargura = 0; indexLargura < largura; indexLargura++) {
            for (int indexAltura = 0; indexAltura < altura; indexAltura++) {
                output += matriz[indexLargura][indexAltura] + "|";
            }
            output += "\n";
        }
        System.out.println(output);
    }

    public static void main(String[] args) {

        int largura = 40, altura = 40;

        int[][] matrizDeCores = construtorMatrizDeCores(largura, altura);

        imprimeMatriz(matrizDeCores, largura, altura);

    }

}
