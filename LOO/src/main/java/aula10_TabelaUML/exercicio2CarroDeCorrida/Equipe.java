/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10_TabelaUML.exercicio2CarroDeCorrida;

/**
 *
 * @author felipex
 */
public class Equipe {

    private String nome;
    private String pais;

    public Equipe(String nome) {
        this.nome = nome;
        this.pais = "Brasil";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

}
