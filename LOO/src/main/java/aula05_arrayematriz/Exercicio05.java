/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05_arrayematriz;

import java.text.DecimalFormat;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author felipex
 */
public class Exercicio05 { 
    
    	private static int numberRandom(int min, int max) {
		return (int) (Math.random() * Math.abs(max-min+1) + min );
	}
	
	private static String formatoReal(float number) {
		DecimalFormat df = new DecimalFormat();
		df.applyPattern("R$ 0.00");
		
		return df.format(number);
	}
	
	private static String precoDaRaspadinha(int quantidadeDeRaspadinhas) {
		float precoDaRaspadinha = 1.75f;
	
		return formatoReal(precoDaRaspadinha * quantidadeDeRaspadinhas);
	}

	
	private static int[] raspadinha(int size, int valorMin, int valorMax) {
		int[] raspa = new int[size];
		
		for (int index = 0; index < size; index++) {
			raspa[index] = numberRandom(valorMin, valorMax);
		}
		
		return raspa;
	}
	
	private static int[][] raspadinhasSort(int quantidade) {
		int size = 6;
		int [][] raspadinha = new int[quantidade][size];
		
		for (int i = 0; i < quantidade; i++) {
			raspadinha[i] = raspadinha(size, 1, 500);
		}
		
		return raspadinha;
	}
	
	private static float valorAReceber(int[] raspadinha) {
		
		Arrays.sort(raspadinha);
		
		int[] posicaoCom3Numeros = new int[raspadinha.length];
		int contPosicao3Numeros = 0;
		
		for (int index = 0; index < raspadinha.length; index++) {
			int contNumero = 0;
			if ( !(Arrays.binarySearch(posicaoCom3Numeros, raspadinha[index]) >= 0) ) {
				for (int indexProx = index; indexProx < raspadinha.length; indexProx++) {
					if (raspadinha[index] == raspadinha[indexProx])
						contNumero++;
				}
				if (contNumero >= 3) {
					posicaoCom3Numeros[contPosicao3Numeros] = raspadinha[index];
					contPosicao3Numeros++;
				}
			}

		}
		
		int maior = posicaoCom3Numeros[contPosicao3Numeros];
		int segundoMaior = 0;
		if (contPosicao3Numeros >= 1)
			segundoMaior = posicaoCom3Numeros[contPosicao3Numeros - 1];
		
		if (maior > segundoMaior)
			return maior;
		else
			return segundoMaior;
	}
	
	private static String imprimirUmaRaspadinha(int[] raspadinha) {
		String output = "";
		for (int i = 0; i < raspadinha.length; i++) {
			output += raspadinha[i] + " ";
		}
		
		return output;
	}

	public static void main(String[] args) {
		try {
			String output = "";
			
			int quantidadeDeRaspadinhas = Integer.parseInt(JOptionPane.showInputDialog(
					"Digite o número de raspadinhas que você deseja comprar: ")
					);
			
			output += "Quantidade de Raspadinhas: " + quantidadeDeRaspadinhas;
			output += "\nValor total da compra: " + precoDaRaspadinha(quantidadeDeRaspadinhas);
			output += "\nRaspadinhas Sorteadas:\n";

			int[][] raspadinhasSort = raspadinhasSort(quantidadeDeRaspadinhas);
			
			float totalAReceber = 0;
			
			for(int[]raspadinha : raspadinhasSort) {
				float valorReceber = valorAReceber(raspadinha);
				totalAReceber += valorReceber;
				
				output += "\n";
				output += imprimirUmaRaspadinha(raspadinha);
				
				if (valorReceber != 0)
					output += "\nPREMIADA!!! {" + formatoReal(valorReceber)+ "} ";
				
				output += "\n";
			
			}
			
			output += "\n\nTotal a receber : " + formatoReal(totalAReceber);
			
			JOptionPane.showMessageDialog(null, output);
			
			main(new String[1]);
			
			
		} catch (NullPointerException e) {
			System.out.println("bye");
			System.exit(0);
		} catch (NumberFormatException e) {
			
			if (e.getCause() == null)
				System.exit(0);
			else
				JOptionPane.showMessageDialog(null, "Entra inválida: " + e.toString());
		} 
	}
    
}
