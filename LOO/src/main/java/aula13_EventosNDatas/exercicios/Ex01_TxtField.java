/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula13_EventosNDatas.exercicios;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author felipex
 */
public final class Ex01_TxtField extends JFrame {

    private JLabel label1;
    private Ex_01LimitedTextField tfTexto;

    public static void main(String[] args) {
        JFrame frame = new Ex01_TxtField();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        //System.exit(0);
    }

    public Ex01_TxtField() {
        inicializaComponentes();
    }

    public void inicializaComponentes() {

        setTitle("Evento da Caixa de Texto");
        setBounds(250, 50, 340, 100);
        setBackground(Color.DARK_GRAY);

        label1 = new JLabel("Degite algo: ");

        tfTexto = new Ex_01LimitedTextField(10);

        setLayout(null);

        label1.setBounds(20, 15, 100, 20);

        tfTexto.setBounds(110, 15, 200, 20);

        add(label1);
        add(tfTexto);

    }

}
