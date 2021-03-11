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
public class MyStack {
    
    // classe protegida
    protected class Node {

        public Object val; // variavel que vai guardar o valor
        public Node next; // variavel que vai guardar informacao do proximo no
        
        // metodo construtor de Node
        public Node(Object v, Node n) {
            val = v;
            next = n;
        }
    }
    
    private Node theStack;
    
    // metodo construtor
    public MyStack() {
        theStack = null;
    }
    
    // metodo pilha vazia
    public boolean empty() {
        return theStack == null;
    }
    
    // metodo que retorna o topo da pilha
    public Object top() {
        return theStack.val;
    }
    
    // metodo que retira do topo da pilha
    public Object pop() {
        Object result = theStack.val;
        theStack = theStack.next;
        return result;
    }
    
    // metodo que insere no topo da pilha
    public void push(Object v) {
        theStack = new Node(v, theStack);
    }
}
