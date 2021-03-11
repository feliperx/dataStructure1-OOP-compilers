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
public class Aula20_Array03 { 
    
    public static void main(String[] args) {
        
        int[] array1 = new int[3]; //inicializando já com tamanho
        int[] array2 = {1,2,3}; //inicializando já com  os valores 
        int[] array3 = new int[]{3,2,1}; //outra forma de inicializar um array
        String[] nomes = {"Felipe","Henrique","Pedro"};
//        
//        for (int i = 0; i < array2.length; i++) {
//            System.out.println(array2[i]);
//            
//        }
//        
        for (int aux : array2){ // Vai jogar todos os elementos do array (1 por 1) na variavel aux
            System.out.println(aux);
        }
        
        for (String aux : nomes){ // Vai jogar todos os elementos do array (1 por 1) na variavel aux
            System.out.println(aux);
        }
        
    }
    
}
