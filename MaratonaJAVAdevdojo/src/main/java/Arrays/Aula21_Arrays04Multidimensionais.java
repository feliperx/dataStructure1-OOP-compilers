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
public class Aula21_Arrays04Multidimensionais {

    public static void main(String[] args) {

        int[][] dias = new int[2][2/*secundario*/]; //nao precisa informar o tamanho  do array secundario

        dias[0][0] = 30;
        dias[0][1] = 20;
        dias[1][0] = 25;
        dias[1][1] = 35;

        //for com mais linhas
        for (int i = 0; i < dias.length; i++) {
            System.out.println(dias[i]); //espaco da memoria
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }
        
        System.out.println("\n-----------------\n");
        
        //foreach menos linhas
        for (int[] ref : dias) {
            for (int dia : ref) {
                System.out.println(dia);
            }

        }

    }

}
