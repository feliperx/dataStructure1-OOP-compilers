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
public class Questao03_Senha {

    
    public static String gerar() {
        String senha = "";
        String[] num = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        // O tamanho padrão é 3
        for (int index = 0; index < 8; index++) {
            int indice = (int) (Math.random() * index);
                senha += num[indice];
            }
        

        return senha;
    }

}
