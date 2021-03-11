/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09.Exercicios;

/**
 *
 * @author felipex
 */
public class Exercicio09_PessoaJuridica extends Exercicio09_Pessoa {

    private String cnpj;

    public Exercicio09_PessoaJuridica(String cnpj, String nome) {
        super(nome);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    } 
    
        public void show(){
        System.out.println(">> Pessoa Juridica <<" + "\n\nNome: " + getNome() +
                "\nCNPJ: " + getCnpj() + "\n\n");
    }

}
