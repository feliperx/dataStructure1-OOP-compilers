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
public class Exercicio04_CanetaComConstrutor_main { 
    
    public static void main(String[] args) { 
        
        Exercicio04_CanetaComConstrutor c1 = new Exercicio04_CanetaComConstrutor(
        "Bic", 1.0f, "Vermelho.");
        Exercicio04_CanetaComConstrutor c2 = new Exercicio04_CanetaComConstrutor(
        "Bec", 2.0f, "Preta");
        Exercicio04_CanetaComConstrutor c3 = new Exercicio04_CanetaComConstrutor(
        "Bac", 1.5f, "Azul");
        
        c1.status();
        c2.status();
        c3.status();
        
    }
    
}
