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
public class EntradaDeDados_Scanner { 
    
        public static void main (String[] args){ 
        float largura, comprimento, area, perimetro; 
        Scanner sc; 

        try {
            System.out.println("Entre com o comprimento:");
            sc = new Scanner(System.in); 
            comprimento = sc.nextFloat(); 
            // nextFloat permite ler um valor float convertido diretamente

            System.out.println("Entre com o largura: ");
            sc = new Scanner(System.in); 
            largura = sc.nextFloat(); 
            // nextFloat permite ler um valor float convertido diretamente 

            area = comprimento * largura ; 
            perimetro = comprimento *2 + largura *2 ; 

            System.out.println("Area do retangulo: " + area);
            System.out.println("Perimetro do retangulo: " + perimetro);



        } catch (Exception e) {
            System.out.println("erro " + e.toString()); 
        }
        
        System.exit(0);

    }
    
}
