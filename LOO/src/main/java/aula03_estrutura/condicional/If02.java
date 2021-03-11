/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03_estrutura.condicional;

import javax.swing.JOptionPane;

/**
 *
 * @author felipex
 */
public class If02 {

    public static void main(String[] args) {

        float real;
        String auxiliar = JOptionPane.showInputDialog("Forneça o dia do mês");
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho",
            "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        if (auxiliar != null) {
            real = Float.parseFloat(auxiliar);
            try {
                for (int contador = 0; contador <= meses.length; contador++) {
                    if (real == contador) {
                        JOptionPane.showMessageDialog(null, "O Mes mencionado foi: " + meses[contador - 1]);
                    }
                }
            } catch (Exception error) {
                JOptionPane.showMessageDialog(null, "Ocorreu algum erro durante a compilação");
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Nenhum valor foi inserido");
    }
    }

}
