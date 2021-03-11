package heap.v2;

public class HeapSort extends Heap {

    public static int[] sort(int[] vetor) {
        
        buildMaxHeap(vetor);
        int n = vetor.length;

        for (int i = vetor.length - 1; i > 0; i--) {
            trocar(vetor, i, 0);
            maxHeapify(vetor, 0, --n);
        }

        return vetor;
    }

    private static void buildMaxHeap(int[] vetor) {
        
        for (int i = vetor.length / 2 - 1; i >= 0; i--) {
            maxHeapify(vetor, i, vetor.length);
        }

    }

    private static void maxHeapify(int[] vetor, int posicao, int tamanhoDoVetor) {

        int max = 2 * posicao + 1, direita = max + 1;
        if (max < tamanhoDoVetor) {

            if (direita < tamanhoDoVetor && vetor[max] < vetor[direita]) {
                max = direita;
            }

            if (vetor[max] > vetor[posicao]) {
                trocar(vetor, max, posicao);
                maxHeapify(vetor, max, tamanhoDoVetor);
            }
        }
    }


    public int[] heapSort(int[] array) {
        
        long tempoinicial = System.currentTimeMillis();
        array = HeapSort.sort(array);
        long tempofinal = System.currentTimeMillis();
        long tempototal = tempofinal - tempoinicial;
        System.out.println("\nTempo de Processamento de HeapSort: " + tempototal + "ms\n");
        return array;
    }
}
