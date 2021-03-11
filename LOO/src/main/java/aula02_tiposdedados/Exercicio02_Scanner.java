/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02_tiposdedados;

import java.util.Scanner;

/**
 *
 * @author felipex
 */
public class Exercicio02_Scanner { 
    
    public static void main(String[] args) {
        
        int pontoslider, pontoslanterna, numerodevitorias; 
        
        Scanner leitor = new  Scanner(System.in); 
        
        System.out.print("Pontos do lider: "); 
        pontoslider = leitor.nextInt(); 
        
        System.out.print("Pontos do lanterna: "); 
        pontoslanterna = leitor.nextInt(); 
        
       
       
        
        
        numerodevitorias = (pontoslider - pontoslanterna)/3; 
        
        if (pontoslider > ((pontoslider-pontoslanterna)/3)*numerodevitorias ){
            numerodevitorias++;
        }  
        
        
        System.out.println("Numero de vitorias necessarias: " + numerodevitorias);
        
        
        
        
        
    }
    
}
