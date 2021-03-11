package heap.v2;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;


    public class Arquivo {

        public int[] lerArquivo(String endereco) throws FileNotFoundException, IOException {

            File arquivo = new File(endereco);

            int[] array = new int[10000];

            String dados = null;

            FileReader filereader = new FileReader(arquivo);

            BufferedReader bufferreader = new BufferedReader(filereader);

            while (bufferreader.ready()) {

                dados = bufferreader.readLine();
            }

            int counter = 0;

            StringTokenizer dadostoken = new StringTokenizer(dados, ";");

            while (dadostoken.hasMoreTokens()) {
                array[counter] = Integer.parseInt(dadostoken.nextToken());
                counter++;
            }

            bufferreader.close();

            filereader.close();

            return array;
        }

        public void gravarArquivo(String endereco, int[] array) throws IOException {

            File arquivo = new File(endereco);

            try {

                if (!arquivo.exists()) {
                    arquivo.createNewFile();
                }

                FileWriter fw = new FileWriter(endereco);

                BufferedWriter bw = new BufferedWriter(fw);

                for (int counter = 0; counter < (array.length - 1); counter++) {
                    bw.write(array[counter]+";");
                    bw.newLine();
                }

                bw.close();
                fw.close();

            } catch (IOException ex) {
            }

        }
    }

