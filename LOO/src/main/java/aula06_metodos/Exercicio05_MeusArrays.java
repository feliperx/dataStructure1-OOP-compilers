/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06_metodos;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author felipex
 */
public class Exercicio05_MeusArrays {
    
	
	public static int meusArrays(int[] arrayA, int[] arrayB, int n) {
		
		int contadorA = 0, contadorB = 0;
		
		for (int i : arrayA) {
			if(n == i)
				contadorA++;
		}
		for (int i : arrayB) {
			if(n == i)
				contadorB++;
		}
		
		if(contadorA==0 && contadorB==0){
                    JOptionPane.showMessageDialog(null,"Não ocorre em nenhum dos arrays!");
			return 0;}
                
                else if(contadorA!=0 || contadorB!=0){
                    JOptionPane.showMessageDialog(null,"Ocorre em algum dos arrays!");
			return 1;}
		else if(contadorA!=0 && contadorB!=0){
                    JOptionPane.showMessageDialog(null,"Ocorre nos dois arrays!");
			return 2;}
                else{
			return -1;}
		
	}

	public static int[] meusArrays(int n) {
		Random rand = new Random();
		int array[] = new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(1000);
		}
		
		return array;
	}
    
}
