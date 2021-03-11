/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula14_diretorios.exercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author felipex
 */
public class Ex04_SomaIntArqv {

    int total;

    public int somarInteiros(String path) {
        try {
            BufferedReader brArquivo = new BufferedReader(new FileReader(path + "/arquivoInteiros.txt"));
            String separar = brArquivo.readLine();

            String stringNumeros[] = separar.split(";");

            for (int i = 0; i < stringNumeros.length; i++) {

                int numero = Integer.parseInt(stringNumeros[i]);

                total += numero;

            }

        } catch (IOException e) {
            System.out.println(e.toString());
            return 0;
        }

        return total;
    }

    public static void main(String[] args) {

        Ex04_SomaIntArqv soma = new Ex04_SomaIntArqv();

        String path = JOptionPane.showInputDialog("Informe o endereço que se encontra o arquivo: ");
        JOptionPane.showMessageDialog(null, "A soma do numeros inteiros do arquivo é: " + soma.somarInteiros(path));

        // endereço: /home/felipex/NetBeansProjects/LOO
    }

}
