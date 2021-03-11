/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula14_diretorios.exercicios;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author felipex
 */
public class Ex03_ApuracaoVotos extends JFrame {

    private JTextField tfVotos;
    private JButton btVer;
    private Ex02_VotacaoArqv voto;
    //private int qtdadeSim, qtdadeNao;

    public static void main(String[] args) {
        JFrame frame = new Ex03_ApuracaoVotos();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        //System.exit(0);
    }

    public Ex03_ApuracaoVotos() {
        inicializaComponentes();
        definirEventos();
    }

    public void inicializaComponentes() {

        setTitle("Apuracao dos Votos");
        setBounds(500, 500, 280, 200);
        setBackground(Color.DARK_GRAY);

        btVer = new JButton("Ver");
        tfVotos = new JTextField();

        setLayout(null);

        btVer.setBounds(100, 10, 90, 20);
        tfVotos.setBounds(50, 50, 200, 20);

        add(btVer);
        add(tfVotos);

        voto = new Ex02_VotacaoArqv();
    }

    public void definirEventos() {

        btVer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

               tfVotos.setText(voto.ler("/home/felipex/NetBeansProjects/LOO/src/main/java/aula14_diretorios/exercicios"));

            }
        });

    }
}
