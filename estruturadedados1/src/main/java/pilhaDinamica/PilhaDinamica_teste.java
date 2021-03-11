/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilhaDinamica;

import javax.swing.JOptionPane;

/**
 *
 * @author felipex
 */
public class PilhaDinamica_teste {
    
    public static void main(String[] args) {
        
        PilhaDinamica validador = new PilhaDinamica();
        
        String entrada = JOptionPane.showInputDialog("Digite a String: ");
        
        validador.setEntrada(entrada);        
        
        if (validador.verifica()) {
            JOptionPane.showMessageDialog(null, "BALANCEADO!");
        } else {
            JOptionPane.showMessageDialog(null, "NÃO ESTÁ BALANCEADO!");
        }
        
        System.exit(0);
    }
    
}
