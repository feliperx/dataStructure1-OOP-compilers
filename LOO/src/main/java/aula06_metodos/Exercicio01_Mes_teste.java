/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06_metodos;

import static aula06_metodos.Exercicio01_Mes.getMesPorExtenso;
import javax.swing.JOptionPane;

/**
 *
 * @author felipex
 */
public class Exercicio01_Mes_teste {
    
        public static void main(String[] args) {

        int mes, idioma;

        mes = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero referente ao mes: "));
        idioma = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero referente ao idioma: "));

        JOptionPane.showMessageDialog(null, getMesPorExtenso(mes, idioma));

        System.exit(0);
    }
}
