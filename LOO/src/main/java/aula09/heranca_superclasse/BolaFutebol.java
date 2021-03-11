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
public class BolaFutebol extends Bola{
    
    private String tipo; 
    
    
    public BolaFutebol(String cor, int tamanho, String tipo){
        
        // super, para acessar os recursos da superclasse 
        super (cor, tamanho);
        
        this.tipo = tipo;
    } 
    
    @Override
    public void mostrar(){
        //Sobreposicao (overriding)
        // super, acessando o metodo da superclasse 
        super.mostrar();
        
        
        
        System.out.println(tipo);
        
    }
    
    
}
