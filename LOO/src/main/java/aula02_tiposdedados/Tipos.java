/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02_tiposdedados;

/**
 *
 * @author felipex
 */
public class Tipos {

    public static void main(String[] args) {

        int codigo = 524141225; // 9 bytes
        short alunos = 256; // 5 bytes
        long matricula = 1212412413; // 11 bytes
        float Real = 10.50f; // Real
        double RealDouble = 10.5054; // Real
        boolean verdadeiro = true; // Default: false
        char sexo = 'M'; // caracter
        byte idade = 89; // de - 127 a + 127

        System.out.println("sexo: " + sexo);
        System.out.println("short: " + alunos);
        System.out.println("int: " + codigo);
        System.out.println("long: " + matricula);
        System.out.println("double: " + RealDouble);
        System.out.println("float: " + Real);
        System.out.println("boolean: " + verdadeiro);
        System.out.println("byte: " + idade);
    }

    // comentário linha 
    /*comentário até onde eu quiser */
}
