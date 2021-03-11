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
public class Exercicio09_PessoaFisica extends Exercicio09_Pessoa { 
    
    private String rg; 

    public Exercicio09_PessoaFisica(String rg, String nome) {
        super(nome);
        this.rg = rg;
    }
    

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    } 
    
    public void show(){
        System.out.println(">> Pessoa Fisica <<" + "\n\nNome: " + getNome() +
                "\nRG: " + getRg() + "\n\n");
    }
    
    
    
}
