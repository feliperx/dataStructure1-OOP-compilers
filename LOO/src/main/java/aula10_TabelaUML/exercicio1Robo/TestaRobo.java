/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10_TabelaUML.exercicio1Robo;

import java.util.Scanner;

/**
 *
 * @author felipex
 */
public class TestaRobo {

    private Ambiente sala;
    private Robo mig;
    private Scanner entrada;

    public void definirAmbiente() {

        entrada = new Scanner(System.in);
        System.out.print("Quantidade de linhas: ");
        int linhas = entrada.nextInt();
        System.out.print("Quantidade de colunas: ");
        int colunas = entrada.nextInt();
        sala = new Ambiente(linhas, colunas);
    }

    public void iniciarRobo() {

        entrada = new Scanner(System.in);

        System.out.println("\nInforme a posição inicial: ");
        System.out.print("Linha: ");
        int posicaoLinha = entrada.nextInt();
        System.out.print("Coluna: ");
        int posicaoColuna = entrada.nextInt();
        mig = new Robo(posicaoLinha, posicaoColuna, sala);
    }

    public void menu() {

        int op = 0;
        entrada = new Scanner(System.in);
        do {
            System.out.println(
                    "\n\t>> MENU <<"
                    + "\n1 - Andar para Frente"
                    + "\n2 - Andar para Trás"
                    + "\n3 - Parar"
                    + "\n4 - Virar para Direita"
                    + "\n5 - Virar para Esquerda"
                    + "\n6 - Sair");

            System.out.print("\nInforme a opção: ");
            op = entrada.nextInt();

            switch (op) {
                case 1:
                    mig.andarFrente();
                    break;
                case 2:
                    mig.andarTras();
                    break;
                case 3:
                    mig.parar();
                    break;
                case 4:
                    mig.virarDireita();
                    break;
                case 5:
                    mig.virarEsquerda();
                    break;
                case 6:
                    op = 0;
                    System.out.println("SAIR.");
                    break;
                default:
                    System.out.println("\nOpçao não encontrada! \nInforme um número de 1-6\n");
                    break;
            }

        } while (op != 0);
    }

}
