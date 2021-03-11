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
public class Exercicio03_for {

    public static void main(String[] args) {

        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero: "));

        for (int i = 1; i < 11; i++) {

            JOptionPane.showMessageDialog(null, numero + " x " + i + " = " + (numero * i));
        }

    }

}
