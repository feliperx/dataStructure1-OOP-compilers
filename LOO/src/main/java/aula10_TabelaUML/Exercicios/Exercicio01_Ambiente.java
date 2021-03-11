/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10_TabelaUML.Exercicios;

/**
 *
 * @author felipex
 */
public class Exercicio01_Ambiente { 
    
    private int qtdLinhas ; 
    private int qtdColunas ;
    
    public void Exercicio01_Ambiente(int linhas, int colunas){ 
        
        this.qtdLinhas = linhas; 
        this.qtdColunas = colunas; 
        
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
    
    
}
