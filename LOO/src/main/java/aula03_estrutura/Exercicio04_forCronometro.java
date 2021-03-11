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
public class Exercicio04_forCronometro {

    public static void main(String[] args) {
        String dado;
        int tempo;

        dado = JOptionPane.showInputDialog("Digite o tempo do cronômetro: ");
        tempo = Integer.parseInt(dado);

        for (int comecando = 3; comecando != 0; comecando--) {
            System.err.println(comecando);
            try {
                Thread.sleep(1000); // O processo vai contar de 1 em 1 segundos

                // Vai durar até 5 minutos
                if (comecando == 0) {
                    System.exit(10);
                }

            } catch (InterruptedException erro) {
                System.out.println("Erro: " + erro);
            }
        }

        System.out.println("Já");

        for (int hora = 0; hora < 24; hora++) {
            for (int minuto = 0; minuto < 60; minuto++) {
                for (int segundo = 0; segundo < 60; segundo++) {
                    for (int milisegundos = 100; milisegundos < 1000; milisegundos += 100) {
                        System.err.println(hora + "h:" + minuto + "m:" + segundo + "s" + " - " + milisegundos + "ms");

                        try {
                            Thread.sleep(1000); // O processo vai contar de 1 em 1 segundos

                            // Vai durar até 5 minutos
                            if (segundo >= tempo) {
                                System.exit(10);
                            }

                        } catch (InterruptedException erro) {
                            System.out.println("Erro: " + erro);
                        }
                    }
                }
            }
        }
    }

}
