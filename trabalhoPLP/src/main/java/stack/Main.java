/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author felipex
 */
public class Main {

    public static void main(String[] args) {

        MyStack stack1 = new MyStack(); // Instanciando um objeto do tipo pilha

        System.out.println(stack1.empty()); // checando se a pilha esta vazia 

        stack1.push("A");
        stack1.push("B"); 
        
        stack1.theStack.val(1); // exemplo de tentativa de acesso a variavel 
       
        System.out.println(stack1.empty()); // false 
        System.out.println(stack1.top()); // verificando o topo
        System.out.println(stack1.pop()); // desempilhando 
        System.out.println(stack1.top()); // verificando o topo

        System.exit(0);

    }

}
