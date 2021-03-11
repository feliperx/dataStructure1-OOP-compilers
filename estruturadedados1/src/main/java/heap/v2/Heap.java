/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heap.v2;

/**
 *
 * @author felipex
 */
public class Heap {

    //criar vetor
    int vetor[];
    int n;

    public Heap() {
        vetor = new int[10000];
        n = 0;
    }

    public int pai(int posicao) {

        return posicao / 2;

    }

    public void insere(int chave) {
        vetor[n + 1] = chave; // insere na ultima posicao do vetor
        ++n;
        subir(n);
    }

    // Aumentando a prioridade de um elemento
    public void subir(int Filho) {

        int Pai = Filho / 2;
        if (Pai >= 1) {
            if (vetor[Filho] > vetor[Pai]) {
                int aux;
                aux = vetor[Filho];
                vetor[Filho] = vetor[Pai];
                vetor[Pai] = aux;

                subir(Pai);
            }
        }
    }

    public String mostra() {

        StringBuffer saida = new StringBuffer();

        for (int i = 1; i <= n; i++) {
            saida.append(vetor[i] + " ");
        }

        return (saida.toString());
    }

    public void remover() {

        vetor[1] = vetor[n];
        --n;
        descer(1, n);
    }

    public void descer(int Pai, int Total) {

        int Filho = 2 * Pai;   // Filho Esquerdo
        if (Filho <= Total) { // Total = tamanho do vetor
            if (Filho < Total) // Tem FilhoDir
            {
                if (vetor[Filho + 1] > vetor[Filho]) {
                    ++Filho;
                }
            }
            if (vetor[Pai] < vetor[Filho]) {
                int aux;
                aux = vetor[Pai];
                vetor[Pai] = vetor[Filho];
                vetor[Filho] = aux; //Trocar Pai e Filho
                descer(Filho, Total);
            }
        }
    }

    public static void trocar(int[] v, int j, int aposJ) {
        int aux = v[j];
        v[j] = v[aposJ];
        v[aposJ] = aux;
    }

}
