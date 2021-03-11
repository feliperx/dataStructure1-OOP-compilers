/*
 * 4. Usando a classe JOptionPane para entrada de dados, elabore uma classe que receba a nota de
duas provas e de um trabalho. Calcule e mostre a média e o resultado final (aprovado ou
reprovado). Para calcular a média utilize a fórmula seguinte: média = (nota da prova 1 + nota
da prova 2 + nota do trabalho) / 3. Considere que a média mínima para aprovação é 7.

 */
package aula02_tiposdedados;

import javax.swing.JOptionPane;

/**
 *
 * @author felipex
 */
public class Exercicio04_Media { 
    
    public static void main(String[] args) {
        
        float media, nota1, nota2, trabalho; 
        
        nota1 = Float.parseFloat(JOptionPane.showInputDialog("Informe a Nota 1: "));
        nota2 = Float.parseFloat(JOptionPane.showInputDialog("Informe a Nota 2: "));
        trabalho = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota do Trabalho: ")); 
        
        media = (nota1 + nota2 + trabalho)/3; 
        
        if (media < 7) {
            JOptionPane.showMessageDialog(null, "Média: " + media + "\nSituação: REPROVADO.");
        }
        
        else {
            JOptionPane.showMessageDialog(null, "Média: " + media + "\nSituação: APROVADO.");
            
        }
        
        System.exit(0);
        
    }
    
    
    
}
