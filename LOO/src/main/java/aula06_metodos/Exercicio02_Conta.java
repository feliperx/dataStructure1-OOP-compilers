/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06_metodos;

/**
 *
 * @author felipex
 */
public class Exercicio02_Conta { 
    

	public static void contar() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}

	public static void contar(int fim) {
		for (int i = 1; i <= fim; i++) {
			System.out.println(i);
		}
	}

	public static void contar(int inicio, int fim) {
		for (int i = inicio; i <=fim ; i++) {
			System.out.println(i);
		}
	}

	public static void contar(int inicio, int fim, int pausa) throws InterruptedException {
		for (int i = inicio; i <=fim ; i++) {
			Thread.sleep(pausa);
			System.out.println(i);
		}
	}
    
}
