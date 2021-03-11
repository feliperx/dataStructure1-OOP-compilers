/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashTableListClosed;

/**
 *
 * @author felipex
 */
public class HashTable {

    private Lista[] tabela;
    private int TAM_MAX;

    public HashTable(int tam) {
        tabela = new Lista[tam];
        TAM_MAX = tam;
        for (int i = 0; i < tam; i++) // inicializando
        {
            tabela[i] = null;
        }
    }

    private int funcaohash(int chave) {
        int v = chave;
        return (v % TAM_MAX);
    }

    public void insere(int item) {
        int pos = funcaohash(item);
        if (tabela[pos] != null) { // se esta ocupado
            if (tabela[pos].busca_lista(item)) { // verificando se a chave ja existe
                System.out.println(" *** ATENCAO O item " + item + " ja foi cadastrado ***");
                return;
            }
        } else // se estiver livre
        {
            tabela[pos] = new Lista();
        }

        tabela[pos].insere_lista(item);
    }

    public void apaga(int chave) {
        int pos = busca((int) chave);
        if (pos != -1) {
            tabela[pos].apaga_lista(chave);
        } else {
            System.out.println("\n Item nao encontrado");
        }
    }

    public void imprime() {
        for (int i = 0; i < TAM_MAX; i++) {
            System.out.print("\n HASH[" + i + "] -> ");
            if (tabela[i] != null) {
                tabela[i].imprime_lista();
            }
            System.out.print("null");
        }
    }

    public int busca(int chave) {
        for (int i = 0; i < TAM_MAX; i++) {
            if (tabela[i] != null) {
                if (tabela[i].busca_lista(chave)) {
                    return i;
                }
            }
        }
        return -1;
    }

}
