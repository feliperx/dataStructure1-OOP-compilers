/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03_estrutura.excecao;

import javax.swing.JOptionPane;

/**
 *
 * @author felipex
 */
public class Throw02 {
    
        public static void main(String[] args) {
        try {
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Fornece sua idade."));
            
            if ( idade >= 18) {
                throw new Exception("Menor de idade, entrada não permitida");
                // vai continuar a execução do programa
            } else {
                JOptionPane.showMessageDialog(null, "Bem vubdi");
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
        }
    }
    
}
