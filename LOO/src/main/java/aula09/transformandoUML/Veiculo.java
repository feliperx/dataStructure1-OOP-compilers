/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09.transformandoUML;

/**
 *
 * @author felipex
 */
public abstract class Veiculo { 
    
    private int velocidade; 
    private boolean estado; 
    
    public void ligar(){
        estado = true;
    }
    
     public void desligar(){
        estado = false;
    }
    
    
    
    
}
