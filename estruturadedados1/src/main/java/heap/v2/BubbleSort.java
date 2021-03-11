/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heap.v2;

import heap.v2.Heap;

/**
 *
 * @author felipex
 */
public class BubbleSort extends Heap {

    public int[] bubbleSort(int vetor[]) {
        long tempoinicial = System.currentTimeMillis();
        for (int i = vetor.length; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                if (vetor[j - 1] > vetor[j]) {

                    trocar(vetor, j, j - 1);

                }
            }
        }
        long tempoFinal = System.currentTimeMillis();
        long tempoTotal = tempoFinal - tempoinicial;
        System.out.println("\nTempo de Processamento de BubbleSort: " + tempoTotal + "ms\n");
        return vetor;
    }

}
