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
public class Ex02_MetodosComRetorno {

    public static void main(String[] args) {

        Ex01_MetodosSemRetorno.somar(20, 10);
        
        System.out.println(Ex02_MetodosComRetorno.mostraDiaDaSemanaExtenso(Integer.parseInt
        (JOptionPane.showInputDialog("Informe o numero do dia: ")))); 
        System.out.println(Ex02_MetodosComRetorno.contaLetrasNaFrase
        (JOptionPane.showInputDialog("Informe a frase: "))); 
        

        System.exit(0);
    }

    public static String mostraDiaDaSemanaExtenso(int dia) {

        String extenso = "Não equivale a um dia da sema!";

        switch (dia) {

            case 1:
                extenso = "Segunda";
                break;
                
            case 2:
                extenso = "Terça";
                break;
                
            case 3:
                extenso = "Quarta";
                break;
                
            case 4:
                extenso = "Quinta";
                break;
                
            case 5:
                extenso = "Sexta";
                break;
                
            case 6:
                extenso = "Sabado";
                break;
                
            case 7:
                extenso = "Domingo";
                break;

        }
    return extenso;    
    }
    
    /**
    *Metodo contra letras 'A' em uma string!
    * 
    *@param palavra
    *
    *@return int quantidade letras
    * 
    **/

    public static int contaLetrasNaFrase (String palavra){
        
        int contador = 0; 
        
        char caracterBusca = 'A'; 
        
        for (int i = 0; i < palavra.length(); i++) {
            if(palavra.charAt(i) == caracterBusca){
            contador++;
            }
        }
        
        return contador;
        
    }
}
