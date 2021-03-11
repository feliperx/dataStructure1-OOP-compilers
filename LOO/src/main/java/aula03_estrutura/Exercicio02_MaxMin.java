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
public class Exercicio02_MaxMin {
    
    public static void main(String[] args) {
        
        float res1, res2, res3, res4, resEquivalente, maiorRes, menorRes; 
        
        res1 = Float.parseFloat(JOptionPane.showInputDialog("Informe a resistencia 1: "));
        res2 = Float.parseFloat(JOptionPane.showInputDialog("Informe a resistencia 2: "));
        res3 = Float.parseFloat(JOptionPane.showInputDialog("Informe a resistencia 3: "));
        res4 = Float.parseFloat(JOptionPane.showInputDialog("Informe a resistencia 4: ")); 
        
        resEquivalente = res1 + res2 + res3 + res4; 
        maiorRes = Math.max(res4, (Math.max(res3, (Math.max(res1, res2)))));
        menorRes = Math.min(res4, (Math.min(res3, (Math.min(res1, res2))))); 
        
        JOptionPane.showMessageDialog(null, "Resistencia Equivalente: " + resEquivalente +
                "\nMaior resistencia fornecida: " + maiorRes + 
                "\nMenor resistencia fornecida: " + menorRes);
        
      
    }
    
}
