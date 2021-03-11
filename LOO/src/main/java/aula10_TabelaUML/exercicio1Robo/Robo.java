/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10_TabelaUML.exercicio1Robo;

/**
 *
 * @author felipex
 */
public class Robo {

    private int linha;
    private int coluna;
    private Ambiente sala;


    public Robo(int linha, int coluna, Ambiente sala) {

        super();

        if (linha < sala.getQtdLinhas() && linha >= 1) {
            this.linha = linha;
        } else {
            System.out.println("\nPosição inválida!"
                    + "\n**Informe um posicao que esteja dentro do ambiente.");
            
            
        }
        if (coluna < sala.getQtdColunas() && coluna >= 1) {
            this.coluna = coluna;
        } else {
            System.out.println("\nPosição inválida!\n"
                    + "\n**Informe um posicao que esteja dentro do ambiente.");
            
        }
        this.sala = sala;
    }

    public void mostrarPosicao() {
        System.out.println("\n>> Posicao atual:");
        System.out.println("> Linha: " + linha);
        System.out.println("> Coluna: " + coluna + "\n");
    }

    public void andarFrente() {
        if (linha < sala.getQtdLinhas()) {
            linha++;
        } else {
            System.out.println("\nRobo bateu na parede!");
        }
        mostrarPosicao();
    }

    public void andarTras() {
        if (linha >= 1) {
            linha--;
        } else {
            System.out.println("\nRobo bateu na parede!");
        }
        mostrarPosicao();
    }

    public void parar() {

        mostrarPosicao();
    }

    public void virarDireita() {
        if (coluna < sala.getQtdColunas()) {
            coluna++;
        } else {
            System.out.println("\nRobo bateu na parede!");
        }
        mostrarPosicao();
    }

    public void virarEsquerda() {
        if (coluna >= 1) {
            coluna--;
        } else {
            System.out.println("\nRobo bateu na parede!");
        }
        mostrarPosicao();
    }

}
