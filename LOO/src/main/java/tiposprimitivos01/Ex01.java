/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos01;

import java.util.Scanner;

/**
 *
 * @author felipex
 */
public class Ex01 {
    public static void main (String[]args){ 
        
        Scanner teclado = new Scanner(System.in); 
        
        System.out.print("Digite um nome: ");
        String nome = teclado.nextLine();
        
        System.out.print("Digite uma nota: ");
        float nota = teclado.nextFloat(); 
        
        System.out.println("\nA nota é " + nota); // println
        System.out.printf("A nota de %s é %.2f\n", nome, nota); //outra maneira
        System.out.print("A nota de " + nome + " é " + nota + "\n"); // outra maneira
        
        
    }
}
