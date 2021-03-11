/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula07_prova01;

import javax.swing.JOptionPane;
import static aula07_prova01.Questao03_Senha.gerar;

/**
 *
 * @author felipex
 */
public class Questao03_Senha_teste {
    
    public static void main(String[] args) {
        String minhaSenha = gerar();
        int contador = 0;
        
        String senha = JOptionPane.showInputDialog("Informe a senha: "); 
        
        if (minhaSenha.equals(senha)){ 
            JOptionPane.showMessageDialog(null, "Senha correta!");
            
        } 
        else {
            
            contador++;
            JOptionPane.showMessageDialog(null, "Senha errada!\n" + contador + " tentativa(s)");
            
            
        }
        
    }
    
    
}
