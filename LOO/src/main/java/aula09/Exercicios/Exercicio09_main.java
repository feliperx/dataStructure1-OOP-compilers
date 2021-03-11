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
public class Exercicio09_main { 
    
    public static void main(String[] args) { 
        
        Exercicio09_PessoaJuridica pj1 = new Exercicio09_PessoaJuridica ("422.450.232.20", "Oswaldo");
        Exercicio09_PessoaFisica pf1 = new Exercicio09_PessoaFisica ("1234566-2", "Haroldo");
        Exercicio09_Funcionario f1 = new Exercicio09_Funcionario ("8999-8990-8302-3421", "1232131-4", "Hamilton");
        
        
        pj1.show(); 
        pf1.show(); 
        f1.show();
    }
    
}
