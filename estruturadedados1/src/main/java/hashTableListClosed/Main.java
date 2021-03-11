/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashTableListClosed;

import java.util.Scanner;

/**
 *
 * @author felipex
 */
public class Main {

    public static void main(String[] args) {
        
        HashTable tabela = new HashTable(10);
        Scanner le = new Scanner(System.in);
        int item, tam;

        System.out.println("\n*********************************************************************");
        System.out.println("Tabela HASH com tratamento de colisoes Lista (10 itens)");
        System.out.println("*********************************************************************");
        System.out.print("\nInforme quantos itens deseja inserir: ");
        tam = le.nextInt();
        for (int i = 0; i < tam; i++) {
            System.out.print(" Inserindo elemento " + (i + 1));
            System.out.print(" - Forneca valor real: ");
            item = le.nextInt();
            tabela.insere(item);
        }

        System.out.print("\n Imprimindo conteudo:");
        tabela.imprime();

        while (true) {
            System.out.print("\n\n>> Forneca o item que deseja apagar (-1 sai): ");
            item = le.nextInt();
            if (item == -1) {
                break;
            }
            tabela.apaga(item);
            tabela.imprime();
        }

        System.out.println("\n");
    }

}
