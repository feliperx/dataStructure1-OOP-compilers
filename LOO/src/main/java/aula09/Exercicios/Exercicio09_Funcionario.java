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
public class Exercicio09_Funcionario extends Exercicio09_PessoaFisica {

    private String cartao;

    public Exercicio09_Funcionario(String cartao, String rg, String nome) {
        super(rg, nome);
        this.cartao = cartao;
    }

    public String getCartao() {
        return cartao;
    }

    public void setCartao(String cartao) {
        this.cartao = cartao;
    } 
    
    public void show(){
        System.out.println(">> Funcionario <<" + "\n\nNome: " + getNome() +
                "\nRG: " + getRg() + "\nCartao: " + getCartao() + "\n\n");
    }

}
