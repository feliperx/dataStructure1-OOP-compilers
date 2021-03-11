/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/**
 *
 * @author felipex
 */
public class Aula19_Array02 {

    public static void main(String[] args) {

        /**
         * VALORES de inicializacao em ARRAYS int, byte, long, float, double,
         * shor = 0 char = '\u0000' || ' ' boolean = false references = null
         */
        int[] inteiro = new int[3];
        float[] flutuante = new float[3];
        char[] character = new char[3];
        boolean[] boleano = new boolean[3];
        String[] Objeto = new String[3]; // Array de objetos

        System.out.println("inteiro 1: " + inteiro[0] + "\ninteiro 2: " + inteiro[1]
                + "\ninteiro 3: " + inteiro[2]);
        System.out.println("\nfloat 1: " + flutuante[0] + "\nfloat 2: " + flutuante[1]
                + "\nfloat 3: " + flutuante[2]);
        System.out.println("\nchar 1: " + character[0] + "\nchar 2: " + character[1]
                + "\nchar 3: " + character[2]);
        System.out.println("\nbool 1: " + boleano[0] + "\nbool 2: " + boleano[1]
                + "\nbool 3: " + boleano[2]);
        System.out.println("\nobject 1: " + Objeto[0] + "\nobject 2: " + Objeto[1]
                + "\nobject 3: " + Objeto[2]); 
        
        
        Objeto[0] = "\nDeadpool"; 
        Objeto[1] = "Goku";
        Objeto[2] = "Naruto"; 
        
        for (int i = 0; i <Objeto.length; i++) { //array.length : contagem de elemento do array
            System.out.println(Objeto[i]);
            
        }
        
    }

}
