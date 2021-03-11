package aula14_diretorios.exercicios;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Ex4_ArquivoGera {

    public static void main(String[] args) throws IOException {

        File arquivo = new File("arquivoInteiros.txt");

        if (!arquivo.exists()) {
            //cria um arquivo (vazio)
            arquivo.createNewFile();
        }

        //caso seja um diretorio, eh possi­vel listar seus arquivos e diretorios
        File[] arquivos = arquivo.listFiles();

        //escreve no arquivo
        FileWriter fw = new FileWriter(arquivo, true);

        BufferedWriter bw = new BufferedWriter(fw);

        //inicializa gerador de numeros aleatorios
        Random gerador = new Random();

        //gera aleatorio e grava com ;
        for (long x = 0; x < 100; x++) {
            bw.write(gerador.nextInt(1000) + ";");
        }
        //bw.newLine();

        bw.close();
        fw.close();

        System.exit(0);
    }

}
