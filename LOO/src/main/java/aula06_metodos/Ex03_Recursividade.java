/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06_metodos;

import javax.swing.JOptionPane;

/**
 *
 * @author felipex
 */
public class Ex03_Recursividade { 
    
    public static void main(String[] args) {
        
        int fatorial = Integer.parseInt(JOptionPane.showInputDialog("Digite o fatorial do numero: "));
        
        for (long i = 0; i < fatorial; i++) {
            
            System.out.println(i +"! = " + calculaFatorial(i));
        }
    }

    public static long calculaFatorial(long num) {
        if (num <= 1)
            return 1; 
        else{
            return (num * calculaFatorial(num-1));
        }
    }
    
}
