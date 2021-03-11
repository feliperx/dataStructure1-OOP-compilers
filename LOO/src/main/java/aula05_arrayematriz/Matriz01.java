/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05_arrayematriz;

/**
 *
 * @author felipex
 */
public class Matriz01 { 
    
        public static void main(String[] args) {
        int [][] matriz = {
            {120, 264, 674},
            {244, 506, 642},
            {503, 005, 320}
        };
        /*
            int [][] matriz = new int[3][3];
 
            matriz[0][0] = 120; 
            matriz[0][1] = 263;
            matriz[0][2] = 674;

            matriz[1][0] = 323; 
            matriz[1][1] = 123;
            matriz[1][2] = 321;

            matriz[2][0] = 436; 
            matriz[2][1] = 127;
            matriz[2][2] = 409;
        */
        for (int linha = 0; linha < matriz.length; linha++) {
            for(int coluna = 0; coluna < matriz.length; coluna++) {
                System.out.println("|" + linha + "|" + coluna + "|" + matriz[linha][coluna]);
            }
            System.out.println("\n");
        }
    }
    
}
