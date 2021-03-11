/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04_operacoes.matematicas;

import javax.swing.JOptionPane;

/**
 *
 * @author felipex
 */
public class Random02_Megasena { 
    
        static public void main(String[] args) {
        String sorteio = "";
        
        for (int contador = 0; contador < 3; contador++) {
                int numero = (int) (Math.random()*10 ); // Aleatorio de 0 a 10
                sorteio += numero;
        }
        
        JOptionPane.showMessageDialog(null, "Número de concursos: " + sorteio);
        
        try {
            int numeroDeJogos = Integer.parseInt(JOptionPane.showInputDialog("Quantos jogos deseja jogar: "));
            
            for (int index = 0; index < numeroDeJogos; index++){
                String numeroDaSorte = "";
                for (int numeroSorteado = 0; numeroSorteado <= 6; numeroSorteado++) {
                    int numero = (int) (Math.random() * 60);
                    numeroDaSorte += numero + " ";
                }
                
                JOptionPane.showMessageDialog(null, "O seu jogo da Megasena foi: " + numeroDaSorte);
            }
            
        } catch(NumberFormatException error) {
            JOptionPane.showMessageDialog(null, "Houve um erro: " + sorteio);
        }
    }
    
}
