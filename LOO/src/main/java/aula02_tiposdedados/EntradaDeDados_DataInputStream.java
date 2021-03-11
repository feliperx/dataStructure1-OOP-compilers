/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02_tiposdedados;

import java.io.DataInputStream;

/**
 *
 * @author felipex
 */
public class EntradaDeDados_DataInputStream { 
    
        public static void main (String[] args){
        String s; 
        float largura, comprimento, area,  perimetro; 
        DataInputStream dado; 

        try{
            System.out.println("Entre com o comprimento:"); 
            dado = new DataInputStream(System.in); 

            s = dado.readLine(); 
            comprimento = Float.parseFloat(s); 

            System.out.println("Entre com a largura:"); 
            dado = new DataInputStream(System.in); 

            s = dado.readLine(); 
            largura = Float.parseFloat(s); 

            area = comprimento * largura ; 
            perimetro = comprimento *2 + largura*2; 

            System.out.println("Area:" + area);
            System.out.println("Perimetro:" + perimetro);  


        }catch(Exception Erro){
            System.out.println("Houve um erro na entrada de dados!" + Erro);
            
        }

    }
    
}
