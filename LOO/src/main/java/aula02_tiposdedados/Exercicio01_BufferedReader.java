/*

01) Usando a classe BufferedReader para entrada de dados, crie uma classe que 
receba o valor deum produto e a porcentagem de desconto, calcule e mostre o valor
do desconto e o valor do produto com o desconto. Observação: o valor do desconto
é calculado por meio da fórmula: valor do desconto = valor do produto * percentual
de desconto / 100

 */
package aula02_tiposdedados;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author felipex
 */
public class Exercicio01_BufferedReader { 
    
    public static void main(String[] args) throws IOException {
        
        float porcentagemdesconto, produto, desconto; 
        String str; 
        
        BufferedReader leitor = new BufferedReader( new InputStreamReader(System.in)); 
        
        System.out.print("Preco do produto: ");
        str = leitor.readLine(); 
        produto = Float.parseFloat(str);
        
        System.out.print("Desconto do produto: ");
        str = leitor.readLine(); 
        porcentagemdesconto = Float.parseFloat(str); 
        
        desconto = produto * (porcentagemdesconto / 100); 
        
        System.out.println("\n>O valor do produto eh: " + produto + 
                "\n>O valor do produto com desconto eh: " + (produto - desconto));
        
        
        
        
    }
    
}
