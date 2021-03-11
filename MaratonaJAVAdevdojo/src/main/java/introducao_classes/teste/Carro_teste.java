/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introducao_classes.teste;

import introducao_classes.classes.Carro;

/**
 *
 * @author felipex
 */
public class Carro_teste { 
    public static void main(String[] args){
    
    Carro c1 = new Carro(); 
    c1.modelo = "Fusca"; 
    c1.placa = "NAS1313"; 
    c1.vel_max = 120f;  
    
    System.out.println(c1.modelo);
    
    }
    
}
