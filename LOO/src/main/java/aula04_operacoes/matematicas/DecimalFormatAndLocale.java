/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04_operacoes.matematicas;

import java.text.DecimalFormat;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author felipex
 */
public class DecimalFormatAndLocale {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat();
        Locale local = Locale.getDefault();
        double valorEstimado = 2770.25;

        if (local.getCountry().equals("BR")) {
            df.applyPattern("R$ #, ##0.00");
        }
        JOptionPane.showMessageDialog(null, "Valor estimado na maquina: " + df.format(valorEstimado)
                + "\n Sigla: " + local.getCountry()
                + "\n Pais: " + local.getDisplayCountry()
                + "\n Idioma: " + local.getDisplayLanguage()
                + "\n Linguagem do Teclado: " + local.getDisplayName()
        );

    }

}
