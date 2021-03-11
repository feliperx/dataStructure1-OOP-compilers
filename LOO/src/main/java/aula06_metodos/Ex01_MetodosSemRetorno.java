/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06_metodos;

import javax.swing.JOptionPane;

/**
 *
 * @author felipex
 */
public class Ex01_MetodosSemRetorno {
    
    public static void main(String[] args) {
        
        imprimir(); 
        imprimirTexto(JOptionPane.showInputDialog("Digite uma frase: "));
        somar (20,10); 
        quadradoDeUmNumero(Integer.parseInt(JOptionPane.showInputDialog("Informa um numero: ")));
        mostraMaior(10, 4, 12); 
        imprimeSexo(JOptionPane.showInputDialog("Informe seu sexo: ").charAt(0)); 
        
        
        
        
        System.exit(0);
        
    }
    
    public static void imprimir(){
        
        System.out.println("Método sem Retorno.");
    }
    
    public static void imprimirTexto(String texto){
        
        System.out.println(texto);
    } 
    
    public static void somar(int a, int b){
        
        System.out.println(a + b); 
        
    } 
    
    public static void quadradoDeUmNumero(int valor){
        
        System.out.println((int) Math.pow(valor, 2));
    } 
    
    public static void mostraMaior(int a, int b, int c){
        
        System.out.println(Math.max(c, Math.max(a, b)));
    }
    
    public static void imprimeSexo(char sexo){
        
        switch (sexo) {
            case 'm': case 'M': 
                System.out.println("Masculino");
                break;
            case 'f': case 'F': 
                System.out.println("Feminino");
                break;
            default: 
                System.out.println("Indefinido");
        }    
        
    }
}