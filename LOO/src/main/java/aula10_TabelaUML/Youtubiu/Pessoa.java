/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10_TabelaUML.Youtubiu;

/**
 *
 * @author felipex
 */
public abstract class Pessoa {

    protected String nome;
    protected int idade;
    protected char sexo;
    protected int experiencia;
    
    
    //metodo construtor
    public Pessoa(String nome, int idade, char sexo) {

        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = 0; //default
    }
    
    // UML '#' = protected
    protected void ganharExp() {
        this.experiencia++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    
}
