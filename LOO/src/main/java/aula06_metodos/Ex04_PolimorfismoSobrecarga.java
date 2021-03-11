/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06_metodos;

/**
 *
 * @author felipex
 */
public class Ex04_PolimorfismoSobrecarga {
    
    public static void main(String[] args) {
        
        System.out.println("Área de um quadrado: " + calculaArea(3));
        System.out.println("Área de um triangulo: " + calculaArea(3,4));
        System.out.println("Área de um cubo: " + calculaArea(3,5,4));
        
        
        System.exit(0);
    }
    
    public static double calculaArea(int x){
        return(x*x);
        
    }
    
    public static double calculaArea(int x, int y){
        return (x*y);
    }
        
    public static double calculaArea(int x, int y, int z){
        return (x*y*z);
    }
}
