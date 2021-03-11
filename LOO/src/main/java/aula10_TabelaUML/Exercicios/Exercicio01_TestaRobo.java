/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10_TabelaUML.Exercicios;

import java.util.Scanner;

/**
 *
 * @author felipex
 */
public class Exercicio01_TestaRobo {

    private Exercicio01_Ambiente sala;
    private Exercicio01_Robo r2;
    private Scanner entrada;

    public static void main(String[] args) {

        Exercicio01_TestaRobo robo = new Exercicio01_TestaRobo();
        
        robo.definirAmbiente(); 
        robo.sala.getQtdColunas();
        robo.sala.getQtdLinhas();
        
        robo.menu();
        

        System.exit(0);
    }

    public void definirAmbiente() {

        Exercicio01_Ambiente ambiente = new Exercicio01_Ambiente();
        Scanner leitor = new Scanner(System.in);
        
               
        System.out.println("Informe a quantidade de linhas: ");
        ambiente.setQtdLinhas(leitor.nextInt());
        System.out.println("Informe a quantidade de colunas: ");
        ambiente.setQtdColunas(leitor.nextInt());

    }

    public void iniciarRobo() {

    }

    public void menu() {

        System.out.println(">>>>> MENU ROBÔ <<<<<"
                + "\n\n1 - Andar para Frente."
                + "\n2 - Andar para Trás."
                + "\n3 - Parar."
                + "\n4 - Virar para Direita."
                + "\n5 - Virar para Esquerda."
                + "\n6 - Sair." + "\n\n");

    }

}
