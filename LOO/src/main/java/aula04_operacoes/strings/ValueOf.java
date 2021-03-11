/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04_operacoes.strings;

import javax.swing.JOptionPane;

/**
 *
 * @author felipex
 */
public class ValueOf { 
    
        public static void main(String[] args) {
        int i = 100;
        long l = 5000;
        float f = 150.515f;
        double d = 150.535;
        
        String concat = String.valueOf(i) + " " + String.valueOf(l) + " " + String.valueOf(f) + " " + String.valueOf(d);
        
        JOptionPane.showMessageDialog(null, "valueOf(): " + concat);
    }
    
}
