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
public class Exercicio03_Caneta_main { 
    
    public static void main(String[] args) {
        
        Exercicio03_Caneta c1 = new Exercicio03_Caneta (); 
        Exercicio03_Caneta c2 = new Exercicio03_Caneta (); 
        Exercicio03_Caneta c3 = new Exercicio03_Caneta (); 
        Exercicio03_Caneta c4 = new Exercicio03_Caneta (); 
        Exercicio03_Caneta c5 = new Exercicio03_Caneta (); 
        
        c1.setModelo("Bic");
        c1.setPonta(1);
        c1.setCor("Azul");
        c1.status();
        
        c2.setModelo("Bic");
        c2.setPonta(0);
        c2.setCor("Preta");
        c2.status();
        
        c3.setModelo("Faber Castel");
        c3.setPonta(3);
        c3.setCor("Verde");
        c3.status();
        
        c4.setModelo("Consor");
        c4.setPonta(2);
        c4.setCor("Vermelha");
        c4.status();
        
        c5.setModelo("Ben 10");
        c5.setPonta(1);
        c5.setCor("Amarela"); 
        c5.status();
        
        
        
    }
    
}
