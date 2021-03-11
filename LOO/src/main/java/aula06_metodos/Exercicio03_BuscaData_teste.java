/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06_metodos;

import java.util.zip.DataFormatException;
import javax.swing.JOptionPane;

/**
 *
 * @author felipex
 */
public class Exercicio03_BuscaData_teste { 
    
    	public static void main(String[] args) throws DataFormatException {

		System.out.println(Exercicio03_BuscaData.getDia("22/09/2019"));
		
		String aux = JOptionPane.showInputDialog("Nome:");
		mostraNome(aux);
	}

	private static void mostraNome(String nome) {
		System.out.println(nome);
	}
}
    

