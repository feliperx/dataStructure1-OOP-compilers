/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilhaEstática;

import javax.swing.JOptionPane;

/**
 *
 * @author felipex
 */
public class PilhaDuracel_teste { 
    

    public static void main(String[] args) {

        PilhaDuracel validadorDuracel = new PilhaDuracel();

        String entrada = JOptionPane.showInputDialog("Digite um String: ");

        validadorDuracel.setEntrada(entrada);

        if (validadorDuracel.verifica() == true)
            JOptionPane.showMessageDialog(null, "BALANCEADO.");

        if (validadorDuracel.verifica() == false)
            JOptionPane.showMessageDialog(null, "NÃO ESTÁ BALANCEADO.");

    }

}
    

