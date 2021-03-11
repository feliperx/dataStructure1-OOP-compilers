/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05_arrayematriz;

import javax.swing.JOptionPane;

/**
 *
 * @author felipex
 */
public class Exercicio02 {

    public static void main(String[] args) {

        String[] nomeDosMeses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        int numRandom = (int) (Math.random() * 12);

        JOptionPane.showMessageDialog(null, nomeDosMeses[numRandom]);
    }

}
