/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05_arrayematriz;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author felipex
 */
public class BuscaEmArrays {

    public static void main(String[] args) {
        String[] cores = {"verde", "amarelo", "vermelho", "preto", "branco"};

        String cor = JOptionPane.showInputDialog("Digite uma cor: ");

        String mensagem = "Cor não encontrada";

        // Uma busca simples
        for (String cors : cores) { // Um "for" feito para arrays
            if (cor.equalsIgnoreCase(cors)) {
                mensagem = "Cor encontrada";
            }
        }

        JOptionPane.showMessageDialog(null, mensagem);

        int[] numeros = {5, 4, 5, 6, 3, 4, 5, 6, 7, 10, 12};
        int posicao = 0;

        try {
            int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero "));

            mensagem = "Numero não encontrado!";

            // Fazendo a busca sequencial simples   
            for (int indice = 0; indice < numeros.length; indice++) {
                if (numeros[indice] == valor) {
                    posicao = indice;
                    mensagem = "Valor encontrado";
                    break;
                }
            }
            funcaoBinariaSearch(numeros, valor); // Fazendo a busca binária

            System.out.println("Na busca sequencial: " + posicao);
            JOptionPane.showMessageDialog(null, mensagem);

        } catch (NumberFormatException error) {
            JOptionPane.showMessageDialog(null, "Houve um erro no formato numérico: " + error);
        }
    }

    private static void funcaoBinariaSearch(int[] numeros, int valor) {
        Arrays.sort(numeros);
        int posicao = Arrays.binarySearch(numeros, valor);
        System.out.println("Na busca binária: " + posicao);
    }

}
