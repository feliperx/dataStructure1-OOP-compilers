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
public class Ambiente {

    private int qtdLinhas;
    private int qtdColunas;

    public Ambiente(int linhas, int colunas) {
        this.qtdColunas = colunas;
        this.qtdLinhas = linhas;
    }

    public int getQtdLinhas() {
        return qtdLinhas;
    }

    public void setQtdLinhas(int qtdLinhas) {
        this.qtdLinhas = qtdLinhas;
    }

    public int getQtdColunas() {
        return qtdColunas;
    }

    public void setQtdColunas(int qtdColunas) {
        this.qtdColunas = qtdColunas;
    }

    @Override
    public String toString() {
        return "Ambiente [ Quantidade de Linhas: " + qtdLinhas + 
               ", Quantidade de Colunas: " + qtdColunas + " ]";
    }

}
