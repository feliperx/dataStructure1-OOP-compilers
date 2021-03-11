/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10_TabelaUML.exercicio2CarroDeCorrida;

import java.util.Scanner;

/**
 *
 * @author felipex
 */
public class Main { 
    
    public static void main(String[] args) { 
        
        Scanner entrada = new Scanner(System.in); 
        
        System.out.print("\nInforme o nome do piloto: ");
        String nome = entrada.nextLine(); 
        System.out.print("Informe o nome da equipe: ");
        String equipe = entrada.nextLine(); 
        System.out.print("Informe o nivel de Combustivel do carro: ");
        double nivelComb = entrada.nextDouble();
        System.out.print("Informe o tipo do Pneu: ");           
        int tipoPneu = entrada.nextInt(); 
        
        
        Carro c1 = new Carro(nome, nivelComb, equipe, tipoPneu); 
        
        c1.rodar(100); 
        c1.relatorio(); 
        c1.pitStop(); 
        c1.relatorio();
        
        
        System.exit(0);
    }
    
}
