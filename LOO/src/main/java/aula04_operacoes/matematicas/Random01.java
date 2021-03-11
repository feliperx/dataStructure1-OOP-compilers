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
public class Random01 { 
    
    public static void main (String[] args){
        String sorteio = "";

        for(int i = 0; i < 3; i++) {
            int num = (int) (Math.random()*10); 
            sorteio += num; 

            JOptionPane.showMessageDialog(null, "Numero do concurso: " + sorteio); 
        }

        try{
             int nroJogos = Integer.parseInt(JOptionPane.showInputDialog("Quantos jogos deseja jogar")); 

             for (int cartao = 0; cartao <nroJogos; cartao++){
                 String nrsCartao = ""; 
                 for (int numSort = 1; numSort <= 6; numSort++){
                     int num = (int) (Math.random() * 60);
                     nrsCartao += num + " "; 
                 }
                 JOptionPane.showMessageDialog(null, "Numero do cartao: " + nroJogos + "\n" + nrsCartao);
             }   
        
            }catch (Exception e) {
                // Todo: handle exception
            }

        

    }
    
}
