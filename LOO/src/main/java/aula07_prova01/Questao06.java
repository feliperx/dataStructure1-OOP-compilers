/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula07_prova01;

import java.util.Scanner;

/**
 *
 * @author felipex
 */
public class Questao06 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        char letraErrada, entradaLetra;
        String paSorteada;
        String[] palavras = {"mesa", "cadeira", "armario", "sofa", "java", "python",
            "fogo", "cigarra", "alemanha", "vasco"};

        int indice = (int) (Math.random() * 10);
        paSorteada = palavras[indice];

        System.out.println(paSorteada); 
        
        System.out.println("Informe a letra: ");
       
        


    }
}
