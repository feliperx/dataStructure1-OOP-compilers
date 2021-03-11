/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06_metodos;


import static aula06_metodos.Exercicio05_MeusArrays.meusArrays;

/**
 *
 * @author felipex
 */
public class Exercicio05_MeusArrays_teste {
    
        	public static void main(String[] args) {
		
		int[] array1 = {1,2,4,5};
		int[] array2 = {4,5,6,7,8};
		
		System.out.println(meusArrays(array1,array2,4));
		
		int[] array3 = meusArrays(50);
		for (int i : array3) {
			System.out.println(i);
		}
	}
    
}
