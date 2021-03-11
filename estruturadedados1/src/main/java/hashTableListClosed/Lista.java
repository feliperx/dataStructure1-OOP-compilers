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
public class Lista {

    private No primeiro; // referencia ao primeiro Nó da lista

    public Lista() {
        primeiro = null;
    }  // Construtor

    public boolean empty() {
        return (primeiro == null);
    }

    public void insere_lista(int v) {
        No lista = new No(v); // Alocando memoria para o Nó
        if (empty()) { // Se a lista estiver vazia
            lista.prox = null;
            primeiro = lista;
            return;
        }
        No atual = primeiro;
        while (atual.prox != null) // caminhando para o ultimo Nó da lista
        {
            atual = atual.prox;
        }
        atual.prox = lista;
        lista.prox = null;
    }

    public void imprime_lista() {
        No atual = primeiro;
        while (atual != null) {   // caminhando para o fim da lista
            atual.mostra();
            atual = atual.prox;
        }
    }

    public boolean busca_lista(int chave) {
        No atual = primeiro;
        while (atual != null) {  // caminhando para o fim da lista
            if (atual.item == chave) {
                return true;
            }
            atual = atual.prox;
        }
        return false;
    }

    public void apaga_lista(int valor) {  // Apaga item recebido no parametro
        if (!busca_lista(valor)) {
            System.out.println(" *** ATENCAO item NAO encontrado ***");
            return;
        }
        No atual, anterior;
        atual = anterior = primeiro;
        while (atual != null) { // caminhando para o fim da lista
            if (atual.item == valor) {
                break;
            }
            anterior = atual;
            atual = atual.prox;
        }
        if (atual == primeiro) {
            primeiro = primeiro.prox;
        } else {
            anterior.prox = atual.prox;
        }
    }

}
