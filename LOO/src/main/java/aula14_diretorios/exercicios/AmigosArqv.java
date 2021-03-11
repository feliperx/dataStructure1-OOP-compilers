/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula14_diretorios.exercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * EXERCICIO 01 - AULA 14
 *
 * @author felipex
 */
public class AmigosArqv {

    public String nome, tempNomes;

    public String inserir(String path) {
        try {
            File dir = new File(path);
            if (!dir.exists()) {
                dir.mkdir();
                // cria arquivo 
                PrintWriter pwArquivo = new PrintWriter(path + "/amigos.txt");
                pwArquivo.println(nome);

                pwArquivo.flush();
                pwArquivo.close();
                return ("Amigo armazeado.");

            }
            BufferedReader brArquivo = new BufferedReader(new FileReader(path + "/amigos.txt"));
            //nome = brArquivo.readLine(); 
            tempNomes = brArquivo.readLine();

            // cria arquivo 
            PrintWriter pwArquivo = new PrintWriter(path + "/amigos.txt");
            pwArquivo.println(tempNomes + ", " + nome);

            brArquivo.close();
            pwArquivo.flush();
            pwArquivo.close();
            return ("Amigo armazeado.");

        } catch (Exception e) {
            return ("FALHA ao gravar o amigo." + e.toString());
        }

    }
}
