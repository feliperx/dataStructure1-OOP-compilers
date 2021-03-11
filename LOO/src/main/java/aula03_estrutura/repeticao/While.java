/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03_estrutura.repeticao;

import javax.swing.JOptionPane;

/**
 *
 * @author felipex
 */
public class While {
    
        static public void main(String[] args) {
        String palavraChave, correto;
        
        palavraChave = "";
        
        correto = JOptionPane.showInputDialog("Digite a palavra-chave: ");
        
        while ( !correto.equals(palavraChave)) {
            palavraChave = JOptionPane.showInputDialog("Qual a palavra-chave? ");
        }
    }
}


