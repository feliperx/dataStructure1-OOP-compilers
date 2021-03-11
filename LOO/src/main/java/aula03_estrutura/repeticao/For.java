/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03_estrutura.repeticao;

/**
 *
 * @author felipex
 */
public class For {

    public static void main(String[] args) {

        for (int hora = 0; hora < 24; hora++) {
            for (int minuto = 0; minuto < 60; minuto++) {
                for (int segundo = 0; segundo < 60; segundo++) {
                    System.err.println(hora + "h:" + minuto + "m:" + segundo + "s");

                    try {
                        Thread.sleep(1000); // O processo vai contar de 1 em 1 segundos

                        // Vai durar até 5 minutos
                        if (segundo == (1000 * 60 * 5)) {
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
