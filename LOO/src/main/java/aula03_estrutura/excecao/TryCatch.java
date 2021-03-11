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
public class TryCatch {
  
       public static void main(String[] args) {
        float numeroReal;
        int numeroInteiro;
        
        try {
           
            String string = JOptionPane.showInputDialog("Digite o 1° valor: "); 
            numeroReal = Float.parseFloat(string);

            string = JOptionPane.showInputDialog("Digite o 2° valor: "); 
            numeroInteiro = Integer.parseInt(string);

            JOptionPane.showMessageDialog(null, "Somar: " + (numeroReal + numeroInteiro) );
            JOptionPane.showMessageDialog(null, "Subtrair: " + (numeroReal + numeroInteiro) );
            JOptionPane.showMessageDialog(null, "Multiplicar: " + (numeroReal + numeroInteiro) );
            JOptionPane.showMessageDialog(null, "Dividir: " + (numeroReal + numeroInteiro) );
            
        } catch(NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Erro de conversão: " + erro);
        } catch(ArithmeticException erro) {
            JOptionPane.showMessageDialog(null, "Erro de aritmétrica: " + erro);  
        } catch(NullPointerException erro) {
            JOptionPane.showMessageDialog(null, "Erro de valor nulo: " + erro);
        } finally {
            JOptionPane.showMessageDialog(null, "Final da execução" );
        }
    }   
    
}
