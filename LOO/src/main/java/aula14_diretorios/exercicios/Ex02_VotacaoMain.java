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
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author felipex
 */
public class Ex02_VotacaoMain extends JFrame {

    private JRadioButton jrSim, jrNao;
    private JButton btVotar;
    private Ex02_VotacaoArqv voto;

    public static void main(String[] args) {
        JFrame frame = new Ex02_VotacaoMain();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        //System.exit(0);
    }

    public Ex02_VotacaoMain() {
        inicializaComponentes();
        definirEventos();
    }

    public void inicializaComponentes() {

        setTitle("Você é a favor do aborto ?");
        setBounds(500, 500, 320, 100);
        setBackground(Color.DARK_GRAY);

        jrSim = new JRadioButton("Sim", true);
        jrNao = new JRadioButton("Não", false);

        btVotar = new JButton("Votar");

        setLayout(null);

        jrSim.setBounds(10, 15, 60, 20);
        jrNao.setBounds(70, 15, 60, 20);

        btVotar.setBounds(140, 15, 90, 20);

        add(jrSim);
        add(jrNao);
        add(btVotar);

        voto = new Ex02_VotacaoArqv();
    }

    public void definirEventos() {

        btVotar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (jrSim.isSelected() && jrNao.isSelected() || !jrSim.isSelected() && !jrNao.isSelected() ) {
                    JOptionPane.showMessageDialog(null, "Marque UMA das opções!");
                } else if (jrSim.isSelected() && !jrNao.isSelected()) {
                    voto.opcaoSim();
                    JOptionPane.showMessageDialog(null, voto.gravar("/home/felipex/NetBeansProjects/LOO/src/main/java/aula14_diretorios/exercicios"));

                } else if (jrNao.isSelected() && !jrSim.isSelected()) {
                    voto.opcaoNao();
                    JOptionPane.showMessageDialog(null, voto.gravar("/home/felipex/NetBeansProjects/LOO/src/main/java/aula14_diretorios/exercicios"));

                }

            }
        });

    }
}
