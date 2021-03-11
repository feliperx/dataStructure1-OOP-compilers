/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02_tiposdedados;

import javax.swing.JOptionPane;

/**
 *
 * @author felipex
 */
public class Exerciocio05_SalarioLiquidoProfessor {
    public static void main(String[] args) {
        
        String nomeProfessor; 
        float horasNoMes, valorDaHora, salarioLiquido, descontoINSS, salarioBruto; 
        
        nomeProfessor = (JOptionPane.showInputDialog("Informe o Nome do Professor: "));
        valorDaHora = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor da Hora/Aula: "));
        horasNoMes = Float.parseFloat(JOptionPane.showInputDialog("Informe quantas horas foram dadas no mes:  "));
        descontoINSS = (Float.parseFloat(JOptionPane.showInputDialog("Informe o desconto do INSS: ")))/100; 
        
        salarioLiquido = (valorDaHora * horasNoMes) - ((valorDaHora * horasNoMes) * descontoINSS); 
        
        salarioBruto = valorDaHora * horasNoMes;
        
        JOptionPane.showMessageDialog(null, "O Salário Líquido do Professor " +
                nomeProfessor + " é R$" + salarioLiquido + 
                "\n e o Salário Bruto é R$" + salarioBruto); 
        
        
        
    }
}
