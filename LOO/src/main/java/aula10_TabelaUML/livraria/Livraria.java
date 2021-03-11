/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10_TabelaUML.livraria;

/**
 *
 * @author felipex
 */
public class Livraria { 
    
    public static void main(String[] args) {
        
        Pessoa[] p = new Pessoa[5]; 
        Livro[] l = new Livro[5]; 
        
        //atribuindo valores aos objetos da classe Pessoa
        p[0] = new Pessoa("Felipe", 24, 'M');
        p[1] = new Pessoa("Taina", 23, 'F');
        p[2] = new Pessoa("Aryel", 24, 'M');
        p[3] = new Pessoa("Vanessa", 20, 'F');
        p[4] = new Pessoa("Bruno", 21, 'M'); 
        
        //atribuido valores aos objetos da classe Livro
        l[0] = new Livro("Harry Potter", "J.K. Holling", 400, p[2]);
        l[1] = new Livro("Laranja Mecânica", "Anthony Burgess", 234, p[1]);
        l[2] = new Livro("1984", "George Owell", 480, p[0]);
        l[3] = new Livro("Tuma da Mônica", "Mauricio de Souza", 23, p[4]);
        l[4] = new Livro("Saltimbancos", "Caetano Velozo", 45, p[3]); 
        
        // exemplos
        l[0].abrir();
        l[3].abrir(); 
        
        l[0].avancarPagina(); 
        l[0].detalhes(); 
        
        l[1].folharPagina(300);
        l[1].detalhes();
        
        l[3].folharPagina(10);
        l[3].detalhes();
        
        
        
    }
    
}
