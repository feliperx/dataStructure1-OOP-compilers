/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.Arrays;

/**
 *
 * @author felipex
 */
public class Aula18_Array01 {

    public static void main(String[] args) {

        int[] idade = new int[3];

        idade[0] = 30;
        idade[1] = 20;
        idade[2] = 10;

        System.out.println("idade 1: " + idade[0] + "\nidade 2: " + idade[1] + "\nidade 3: " + idade[2]);

        Arrays.sort(idade); //ordenando os elementos do array

        System.out.println("\nidade 1: " + idade[0] + "\nidade 2: " + idade[1] + "\nidade 3: " + idade[2]);
        
        System.out.println("-------");
        
        for (int aux : idade) {
            System.out.println(aux);

        }

    }

}
