/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09.leituraEgravacao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author felipex
 */
public class ProdutoPersiste extends Produto {

    public String gravar() {
        String ret = "Produto armazenado com sucesso!";

        try {
            FileOutputStream file = new FileOutputStream("produto" + this.getCodigo());
            ObjectOutputStream stream = new ObjectOutputStream(file);
            stream.writeObject(this);
            stream.flush();

        } catch (Exception e) {
            ret = "Falha na gravacao do arquivo \n" + e.toString();
        }
        return ret;
    }

    public static Produto ler(int codigo) {
        try {
            FileInputStream file = new FileInputStream("produto" + codigo);
            ObjectInputStream stream = new ObjectInputStream(file);
            return ((Produto) stream.readObject());

        } catch (IOException | ClassNotFoundException erro) {
            System.out.println("Falha na leitura." + erro.toString());

            return null;
        }
    }

}
