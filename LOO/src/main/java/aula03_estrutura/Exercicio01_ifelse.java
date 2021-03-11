/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03_estrutura;

import javax.swing.JOptionPane;

/**
 *
 * @author felipex
 */
public class Exercicio01_ifelse {
    
    public static void main(String[] args) {
        
        String nomeProduto; 
        float precoProduto, precofinalProduto = 0; 
        
        nomeProduto = JOptionPane.showInputDialog(null, "Informe o nome do produto: ");
        precoProduto = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o preco do produto: "));
        
        if (precoProduto < 50 && precoProduto > 0 ) {
            precofinalProduto = precoProduto; 
        }
        else if ( precoProduto >= 50 && precoProduto < 200){
            precofinalProduto = precoProduto * 0.95f;    
        } 
        else if (precoProduto >=200 && precoProduto < 500) {
            precofinalProduto = precoProduto * 0.94f;     
        }
        else if ( precoProduto >= 500 && precoProduto < 1000){
            precofinalProduto = precoProduto * 0.93f;    
        } 
        else if ( precoProduto >= 1000){
            precofinalProduto = precoProduto * 0.92f;    
        } 
        
        else if ( precoProduto < 0){
            JOptionPane.showMessageDialog(null,"Informe um valor POSITIVO.");
        }
        
        else {
            JOptionPane.showMessageDialog(null,"Informe um NÚMERO!");
        } 
        
        JOptionPane.showMessageDialog(null, "Nome do Produto: " + nomeProduto +
                "\nValor Original do Produto: R$" + precoProduto + 
                "\nValor do Produto com Desconto: R$" + precofinalProduto);
        
      System.exit(0);
        
    }
    
    
}
