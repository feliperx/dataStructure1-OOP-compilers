/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introducao_metodos.teste;

import introducao_metodos.classes.Calculadora;
import java.util.Scanner;

/**
 *
 * @author felipex
 */
public class Calculadora_teste { 
    public static void main(String[] args) {
        
        Calculadora calc1 = new Calculadora(); 
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Informe o primeiro dígito: ");
        int n1 = Integer.parseInt(teclado.nextLine());
        
        System.out.print("Informe o segundo dígito: ");
        int n2 = Integer.parseInt(teclado.nextLine());
        
        System.out.println("---------------------- \n");
        
        calc1.somaDoisNumeros(n1, n2); 
        calc1.subtraiDoisNumeros(n1, n2);
        calc1.multiplicaDoisNumeros(n1, n2);
        System.out.println(calc1.DivideDoisNumeros(n1, n2) + "\n"); 
        
        int[] numeros = {1,2,4,6,7}; 
        
        calc1.somaArray(numeros); 
        
        calc1.somaVarArgs(1,3,4,5,13);
        
       
        
        
        
        
        
    }

    private static int Scanner(String informe_o_primeiro_dígito_) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
