/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilhaEstática;

import java.util.Stack;

/**
 *
 * @author felipex
 *
 */
public class PilhaDuracel {

    private Stack<Character> pilha;

    //definindo o tipo da variavel da minha entrada
    private final char Aparentese = '(';
    private final char Fparentese = ')';
    private final char Achave = '{';
    private final char Fchave = '}';
    private final char Acolchete = '[';
    private final char Fcolchete = ']';

    private String str; //String passada pelo usuário

    //Criando método para subir a entrada
    public void setEntrada(String str) {
        this.str = str;
    }

    public String getEntrada() {
        return this.str;
    }
    //verifica a entrada

    public boolean verifica() {

        this.pilha = new Stack<Character>();  //topo da pilha

        for (int i = 0; i < this.str.length(); i++) {//Verifica toda a String que percorre no meu vetor

            //verificando cada caracter
            if (this.str.charAt(i) == Aparentese) {
                pilha.push(Aparentese);
            } else if (this.str.charAt(i) == Achave) {
                pilha.push(Achave);
            } else if (this.str.charAt(i) == Acolchete) {
                pilha.push(Acolchete);
            } else if (this.str.charAt(i) == Fparentese) {
                if (pilha.isEmpty()) {
                    return false;
                }
                if (pilha.pop() != Aparentese) {
                    return false;
                }
            } else if (this.str.charAt(i) == Fchave) {
                if (pilha.isEmpty()) {
                    return false;
                }
                if (pilha.pop() != Achave) {
                    return false;
                }
            } else if (this.str.charAt(i) == Fcolchete) {
                if (pilha.isEmpty()) {
                    return false;
                }
                if (pilha.pop() != Acolchete) {
                    return false;
                }
            }
        }
        return pilha.isEmpty();
        //função verifica
    }

}
