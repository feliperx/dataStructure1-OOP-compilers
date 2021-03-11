/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula07_prova01;

import javax.swing.JOptionPane;

/**
 *
 * @author felipex
 */
public class Questao01 {

    public static void main(String[] args) {

        int anosFaltam;

        int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: "));
        String sexo = JOptionPane.showInputDialog("Informe seu sexo: ");
        int anosDeContrib = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos ja contribuiu: "));

        if (sexo.equals("F")) {
            if (idade >= 60 || anosDeContrib >= 30) {

                JOptionPane.showMessageDialog(null, "Você já tem direito a aposentadoria!");
            } else {
                anosFaltam = 30 - anosDeContrib;
                JOptionPane.showMessageDialog(null, "Faltam" + anosFaltam
                        + " anos para se aposentar.");

            }

        } else if (sexo.equals("M")) {
            if (idade >= 65 || anosDeContrib >= 35) {

                JOptionPane.showMessageDialog(null, "Você já tem direito a aposentadoria!");

            } else {
                anosFaltam = 35 - anosDeContrib;
                JOptionPane.showMessageDialog(null, "Faltam " + anosFaltam
                        + " anos para se aposentar.");
            }

        }
        System.exit(0);
    }

}
