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
public class Aula22_Arrays05Multidimensionais {

    public static void main(String[] args) {

        int[] array1 = new int[3]; //inicializando já com tamanho
        int[] array2 = {1, 2, 3}; //inicializando já com  os valores 
        int[] array3 = new int[]{3, 2, 1}; //outra forma de inicializar um array

        int[][] dias = new int[3][];
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {1, 2, 3, 4, 5}}; //outra maneira

        dias[0] = new int[4]; //cria um array que referenciado pela dias[0]
        dias[1] = new int[]{1, 2, 3, 4}; //cria um array que referenciado pela dias[1]
        dias[2] = new int[2]; //cria um array que referenciado pela dias[2] 

        //matriz dias
        for (int[] ref : dias) {
            for (int dia : ref) {
                System.out.println(dia);
            }
        }
        System.out.println("-----------");
        //matriz array
        for (int[] ref : array) {
            for (int arr : ref) {
                System.out.println(arr);
            }
        }

    }

}
