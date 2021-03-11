/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09.heranca_superclasse;

/**
 *
 * @author felipex
 */
public abstract class Bola { 
    
    private String cor; 
    private int tamanho; 
    
    //Metodo Construtor
    public Bola(String cor, int tamanho){ 
        
        this.cor = cor; 
        this.tamanho = tamanho;         
    }
    
    public void mostrar(){
        
        System.out.println(cor);
        System.out.println(tamanho);
    }
    
}
