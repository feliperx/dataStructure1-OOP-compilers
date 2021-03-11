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
public class Exercicio07_main {
    
    
    public static void main(String[] args) {
        
        Exercicio07_ProfessorIntegral profInt1 = new Exercicio07_ProfessorIntegral (2000, "Bruno Xavier", "101010", 34);
        Exercicio07_ProfessorHorista profHr1 = new Exercicio07_ProfessorHorista (120, 200, "Ronaldo", "191919", 50);
        
        profInt1.mostrar(); 
        profHr1.mostrar();
        
        System.exit(0);
        
    }
    
}
