/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introducao_metodos.teste;

import introducao_metodos.classes.Professor;

/**
 *
 * @author felipex
 */
public class Professor_teste { 
    
    public static void main(String[] args) {
    
    Professor prof1 = new Professor(); 
    Professor prof2 = new Professor();
    
        prof1.nome = "Fabio"; 
        prof1.matricula = "1535";
        prof1.rg = "1212312";
        prof1.cpf = "173-224-385-20"; 
                
        prof2.nome = "Jadson"; 
        prof2.matricula = "1545";
        prof2.rg = "123080853";
        prof2.cpf = "234-894-444-20"; 
        
        prof1.imprime();
        prof2.imprime();
    
    }
}
