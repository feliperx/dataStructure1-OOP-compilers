/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introducao_classes.teste;

import introducao_classes.classes.Estudante;



/**
 *
 * @author felipex
 */
public class Estudante_teste {
    public static void main (String[] args){
        
        Estudante e1 = new Estudante(); 
        e1.nome = "Felipe"; 
        e1.matricula = "1313"; 
        e1.idade = 24; 
        
        System.out.println(e1.nome);
        System.out.println(e1.matricula);
        System.out.println(e1.idade);
        
        
    }

}
