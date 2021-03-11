/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula08_classesEobjetos;

/**
 *
 * @author felipex
 */
public class Celular_teste {
    
    public static void main(String[] args) {
        
        Celular cel1 = new Celular();        
        Celular cel2 = new Celular();        
        Celular cel3 = new Celular(); 
        
        cel1.numero = "95 981223103";
        cel2.numero = "95 981243303";
        cel3.numero = "95 981343434"; 
        Celular.empresa = "Numeros da Universidade Estadual de Roraima";
        
        
    }
    
}
