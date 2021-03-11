/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introducao_classes.teste;

import introducao_classes.classes.Professor;

/**
 *
 * @author felipex
 */
public class Professor_teste {

    public static void main(String[] args){
        
        Professor prof1 = new Professor(); 
        prof1.nome = "Francisco"; 
        prof1.matricula = "1515";
        prof1.rg = "123456788";
        prof1.cpf = "123-234-345-10";
        
        Professor prof2 = new Professor(); 
        prof2.nome = "Wender"; 
        prof2.matricula = "1525";
        prof2.rg = "1223456788";
        prof2.cpf = "213-324-534-01";
        
        System.out.println("Nome: " + prof1.nome);
        System.out.println("Matricula: " + prof1.matricula);
        System.out.println("RG: " + prof1.rg);
        System.out.println("CPF: " + prof1.cpf);
   
        System.out.println("\nNome: " + prof2.nome);
        System.out.println("Matricula: " + prof2.matricula);
        System.out.println("RG: " + prof2.rg);
        System.out.println("CPF: " + prof2.cpf + "\n"); 
        System.out.println("prof1 é igual prof2 ? " + (prof1==prof2));
        
        
    }
}
