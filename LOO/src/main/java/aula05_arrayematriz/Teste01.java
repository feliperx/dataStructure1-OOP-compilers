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



public class Teste01 {

    public static void main (String[] args) {

        int [][] matriz = { {120, 264, 674}, {232,456,56}, {555,464,964}}; // Mais utilizado

        // Menos Utilizado, mais didático
    /*  int [][] matriz = new int [3][3]; 

        matriz[0][0] = 120;     matriz[1][0] = 232;     matriz[2][0] = 555; 
        matriz[0][1] = 263;     matriz[1][1] = 456;     matriz[2][1] = 464;     
        matriz[0][2] = 674;     matriz[1][2] = 56;      matriz[2][2] = 964; 
        */

        for (int i=0; i < matriz.length; i++){
            for (int j = 0; j < matriz [i].length; j++){
                System.out.println("[" + i + "," + j + "] " + matriz[i][j]);
            }
            System.out.println("\n");

        }
    }
}