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
public class Ex02_VotacaoArqv {

    private String VotosSim, VotosNao;
    private int qtdadeSim, qtdadeNao; 
    
    public String ler(String path) {
        try {
            BufferedReader brArquivo = new BufferedReader(new FileReader(path + "/votacaoAborto.txt"));
            VotosSim = brArquivo.readLine();
            VotosNao = brArquivo.readLine();
            brArquivo.close();
            return VotosSim + " | " + VotosNao;

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
            PrintWriter pwArquivo = new PrintWriter(path + "/votacaoAborto.txt");
            pwArquivo.println("Voto(s) Sim: " + qtdadeSim);
            pwArquivo.println("Voto(s) Nao: " + qtdadeNao);

            pwArquivo.flush();
            pwArquivo.close();
            return ("Voto Computado.");

        } catch (Exception e) {
            return ("FALHA ao gravar voto." + e.toString());
        }

    }

    public int opcaoSim() {
        return qtdadeSim++;
    }

    public int opcaoNao() {
        return qtdadeNao++;
    } 

    public int getQtdadeSim() {
        return qtdadeSim;
    }

    public int getQtdadeNao() {
        return qtdadeNao;
    }
    
    

}
