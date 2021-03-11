/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introducao_metodos.classes;

/**
 *
 * @author felipex
 */
public class Calculadora {
    
    public void somaDoisNumeros(int n1, int n2){
        System.out.println(n1 + n2);
    }
        public void subtraiDoisNumeros(int n1, int n2){
        System.out.println(n1 - n2);
    }
        public void multiplicaDoisNumeros(int n1, int n2){
        System.out.println(n1*n2);
    }
    public double DivideDoisNumeros(double n1, double n2){
        return n1/n2; 
    }
    
    public void somaArray(int[] numeros){
        int soma = 0; 
        for(int num : numeros){
            soma += num; 
        }
        System.out.println(soma);
    }
    
    //VarArgs pode pegar inteiros como parâmetro e transforma em array
    public void somaVarArgs(int... numeros){
        int soma = 0; 
        for(int num : numeros){
            soma += num; 
        }
        System.out.println(soma);
    }
    
    
}
