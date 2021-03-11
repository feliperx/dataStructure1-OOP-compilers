/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introducao_metodos.classes;


/**
 *
 * @author felipex
 */
public class Professor {
    
    public String nome; 
    public String matricula;
    public String rg;
    public String cpf; 
    
    public void imprime(/*Professor aux*/){
   
//        System.out.println("\nNome: " + aux.nome);
//        System.out.println("Matricula: " + aux.matricula);
//        System.out.println("RG: " + aux.rg);
//        System.out.println("CPF: " + aux.cpf);
  

// this. pega os valores dentro do próprio objeto
        System.out.println("\nNome: " + this.nome); 
        System.out.println("Matricula: " + this.matricula);
        System.out.println("RG: " + this.rg);
        System.out.println("CPF: " + this.cpf);


    }
}
