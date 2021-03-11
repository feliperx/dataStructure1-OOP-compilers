/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06_metodos;

import javax.swing.JOptionPane;

/**
 *
 * @author felipex
 */
public class Exercicio04_BuscaCaractere {

    public static void main(String[] args) {

        System.out.println(buscandoCharacter("Buscando letra e contando", 'a'));
    }

    public static int buscandoCharacter(String frase, char letra) {
        int contador = 0;
        for (char c : frase.toCharArray()) {
            if (c == letra) {
                contador++;
            }
        }

        if (contador == 0) {
            JOptionPane.showMessageDialog(null, "Não ocorre a letra " + letra + " na frase.");
            return contador;
        } else {
            JOptionPane.showMessageDialog(null, "A letra " + letra + " aparece " + contador + " vezes na frase.");
        }
        return contador;
    }

}
