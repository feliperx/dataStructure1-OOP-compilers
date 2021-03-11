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
public class Ex05_BuscaPalavraArqv {

    public void buscaPalavra(String path) throws IOException {

        BufferedReader brArquivo = new BufferedReader(new FileReader(path + "/arquivoPalavras.txt"));
        String texto = brArquivo.readLine();

        if (texto.contains("jogo") || texto.contains("jogos") || texto.contains("game") || texto.contains("games")) {
            JOptionPane.showMessageDialog(null, "Esse arquivo provavelmente fala sobre jogos!");
        } else {

            JOptionPane.showMessageDialog(null, "Nenhuma palavra encontrada no arquivo.");

        }
    }

    public static void main(String[] args) throws IOException {

        Ex05_BuscaPalavraArqv busca = new Ex05_BuscaPalavraArqv();

        String path = JOptionPane.showInputDialog("Informe o endereço que se encontra o arquivo: ");
        busca.buscaPalavra(path); 
        
        //endereco: /home/felipex/Documentos/temp
    }

}
