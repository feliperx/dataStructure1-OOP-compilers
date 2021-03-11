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
public class Exercicio05_while {

    public static void main(String[] args) {

        String login = "java8", senha = "java8", loginOk, senhaOk;
        int chance = 3;

        while (chance != 0) {

            loginOk = JOptionPane.showInputDialog("Informe o login: ");
            senhaOk = JOptionPane.showInputDialog("Informe a senha: ");

            if (login.equals(loginOk) && senha.equals(senhaOk)) {
                JOptionPane.showMessageDialog(null, "Login e senha aceitos!");
                break;
            } else if (chance != 1 && (loginOk != login || senhaOk != senha)) {
                chance--;
                JOptionPane.showMessageDialog(null, "Login e/ou senha incorretos!"
                        + "\nVocê tem mais " + chance + " tentativa(s).");
            } else {
                chance--;
                JOptionPane.showMessageDialog(null, "Fim das tentativas. Conta bloqueada!");
            }

        }

    }

}
