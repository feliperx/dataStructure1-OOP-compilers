/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05_arrayematriz;

import java.text.DecimalFormat;
import java.util.Arrays;

/**
 *
 * @author felipex
 */
public class Vetor { 
    
     public static void main(String[] args) {
        String[] nomes = {"Jose", "Vitor", "Rogerio", "Matheus", "Bruno", "Rebeca"};
        char[] vogais = {'a', 'e', 'i', 'o', 'u'};
        int[] numeros = {7, 8, 5, 10, 90};
        float[] notas = {7.50f, 5.40f, 9.70f, 3.76f, 7.64f};
        int[] inteiro = new int[10];
        
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("###");
        
        System.out.println("Inteiro Sorteados: ");
        for (int indice = 0; indice <= inteiro.length; indice++) {
            inteiro[indice] = (int) (Math.random() * 1000);
            System.out.println(df.format(inteiro[indice]));
        }
        
        Arrays.sort(nomes); // Ordenando os elemento do array, metodo de ordenação
        System.out.println("\nNome: ");
        for (String nome : nomes) // Um "for" feito para arrays
            System.out.println(nome + " ");
        
        Arrays.sort(numeros); // Ordenando os elemento do array, metodo de ordenação
        System.out.println("\nNumeros: ");
        for (int numero : numeros) // Um "for" feito para arrays
            System.out.println(numero + " ");
        
        Arrays.sort(vogais); // Ordenando os elemento do array, metodo de ordenação
        System.out.println("\nVogais: ");
        for (char vogal : vogais) // Um "for" feito para arrays
            System.out.println(vogal + " ");
        
        Arrays.sort(notas); // Ordenando os elemento do array, metodo de ordenação
        System.out.println("\nNotas: ");
        for (float nota : notas) // Um "for" feito para arrays
            System.out.println(nota + " ");
    }
    
}
