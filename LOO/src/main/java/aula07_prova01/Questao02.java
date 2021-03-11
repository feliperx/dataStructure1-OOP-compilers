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
public class Questao02 {

    public static void main(String[] args) {

        //numero da vaga = index 
        // placa do veiculo = valor do index  
        String[] estacionamento = new String[10];
        String placaDoVeiculo = "";
        int nVaga = 0, numMenu=1;

        

        while (numMenu == 1 || numMenu == 2 || numMenu == 3 ) { 
            
             numMenu = Integer.parseInt(JOptionPane.showInputDialog("CONTROLE DE ESTACIONAMENTO: \n"
                + "1 - Entrada\n"
                + "2 - Saida\n"
                + "3 - Listar Situacao\n"
                + "4 - Encerrar Programa \n"));
            


            switch (numMenu) {
                case 1:
                    nVaga = Integer.parseInt(JOptionPane.showInputDialog("Qual o numero da vaga ? "));
                    placaDoVeiculo = JOptionPane.showInputDialog("Qual a placa do veículo ?");
                    estacionamento[nVaga] = placaDoVeiculo;
                    break;

                case 2:
                    nVaga = Integer.parseInt(JOptionPane.showInputDialog("Qual o numero da vaga ? "));
                    estacionamento[nVaga] = null;
                    break;

                case 3:
                    for (int i = 0; i < estacionamento.length; i++) {
                        System.out.println("Vaga " + i + " : " + estacionamento[i]);
                    }
                    break;
                    
                default: 
                    JOptionPane.showMessageDialog(null, "ERROR");
                    break;
                    
                    

            }

        }
        
        
        }
}
