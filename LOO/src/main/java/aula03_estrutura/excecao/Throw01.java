/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03_estrutura.excecao;

import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author felipex
 */
public class Throw01 {

    public static void main(String[] args) throws IOException {
        // vai continuar a execução do programa
        String frase = JOptionPane.showInputDialog("Digite alguma frase");
        try {

            // vai criar um arquivo "frases.txt"
            FileWriter file = new FileWriter("C:\\Users\\Jose Vitor\\Desktop\\Java\\mavenproject1\\src\\main\\java\\Exceções\\frases.txt", true);
            PrintWriter out = new PrintWriter(file);

            // Vai escrever no arquivo "frases.txt"
            out.println(frase);

            // Fechando os arquivos
            file.close();
            out.close();

            JOptionPane.showMessageDialog(null, "Finalmente funciono");

        } catch (FileNotFoundException erro) {
            JOptionPane.showMessageDialog(null, "Verifique se o arquivo existe " + erro);
        }
    }

}
