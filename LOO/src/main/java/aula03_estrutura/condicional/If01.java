/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03_estrutura.condicional;

import javax.swing.JOptionPane;

/**
 *
 * @author felipex
 */
public class If01 {

    public static void main(String[] args) {

        try {
            Object[] vetor = {"Masculino", "Feminino", "Indefinido"};
            String resposta = (String) JOptionPane.showInputDialog(null, "Selecione o sexo: \n",
                    "pesquisa", JOptionPane.PLAIN_MESSAGE,
                    null, vetor, "Masculino");

            if (resposta == null) {
                JOptionPane.showConfirmDialog(null, "Por favor, escolha o seu gênero");
            } else if ("Feminino".equals(resposta)) {
                JOptionPane.showConfirmDialog(null, "Você é uma mulher");
            } else if ("Masculino".equals(resposta)) {
                JOptionPane.showConfirmDialog(null, "Você é um homen");
            } else {
                JOptionPane.showConfirmDialog(null, "Tudo bem, respeitamos sua decisão");
            }

        } catch (Exception error) {
            JOptionPane.showConfirmDialog(null, "Aconteceu um erro bizarro");
        }

    }
}
