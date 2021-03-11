/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula14_diretorios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author felipex
 */
public class PessoaArquivo {

    public String codigo, nome, email;

    public PessoaArquivo ler(String path) {
        try {
            BufferedReader brArquivo = new BufferedReader(new FileReader(path + "/" + codigo + ".txt"));
            codigo = brArquivo.readLine();
            nome = brArquivo.readLine();
            email = brArquivo.readLine();

            brArquivo.close();
            return this;

        } catch (IOException e) {
            System.out.println(e.toString());
            return null;
        }
    }

    public String gravar(String path) {
        try {
            File dir = new File(path);
            if (!dir.exists()) {
                dir.mkdir();

            }
            // cria arquivo 
            PrintWriter pwArquivo = new PrintWriter(path + "/" + codigo + ".txt");
            pwArquivo.println(codigo);
            pwArquivo.println(nome);
            pwArquivo.println(email);

            pwArquivo.flush();
            pwArquivo.close();
            return ("Arquivo gravado com SUCESSO.");

        } catch (Exception e) {
            return ("FALHA ao gravar o arquivo." + e.toString());
        }

    }
}
