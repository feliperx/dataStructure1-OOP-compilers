package heap.v2;

import java.io.IOException;


public class Main {
    
        public static void main(String[] args) throws IOException {

            Arquivo arquivo = new Arquivo(); // novo objeto da classe Arquivo
            HeapSort hs = new HeapSort();  // novo objeto da classe HeapSort 
            BubbleSort bs = new BubbleSort(); // novo objeto da classe BubbleSort
            int[] arrayDesordenado = new int[10000];
            int[] arrayOrdenadoHS = new int[10000];
            int[] arrayOrdenadoBS = new int[10000];

            arrayDesordenado = arquivo.lerArquivo("arquivo.txt"); //Lê o .txt e atribui ao array
            arrayOrdenadoHS = hs.heapSort(arrayDesordenado); // Aplica o metodo HEAPSORT e atribui ao vetor
            arrayOrdenadoBS = bs.bubbleSort(arrayDesordenado); // Aplica o metodo BUBBLESORT e atribui ao vetor
            arquivo.gravarArquivo("ordenadoHS.txt", arrayOrdenadoHS); //Gera o arquivo ordenado pelo HeapSort
            arquivo.gravarArquivo("ordenadoBS.txt", arrayOrdenadoBS); //Gera o arquivo ordenado pelo BubbleSort
            
            System.exit(0);
        }
    }
