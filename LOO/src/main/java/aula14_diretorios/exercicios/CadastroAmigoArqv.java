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
import javax.swing.JTextField;

/**
 * EXERCICIO 01 - AULA 14
 * @author felipex
 */
public class CadastroAmigoArqv extends JFrame {

    private JLabel label1;
    private JButton btInserir;
    private JTextField tfNome;
    private AmigosArqv amigo;

    public static void main(String[] args) {
        JFrame frame = new CadastroAmigoArqv();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        //System.exit(0);
    }

    public CadastroAmigoArqv() {
        inicializaComponentes();
        definirEventos();
    }

    public void inicializaComponentes() {

        setTitle("Cadastro dos Amigo");
        setBounds(250, 50, 340, 150);
        setBackground(Color.DARK_GRAY);

        label1 = new JLabel("Nome: ");

        btInserir = new JButton("Inserir");

        tfNome = new JTextField();


        setLayout(null);

        label1.setBounds(10, 15, 60, 20);


        btInserir.setBounds(230, 80, 90, 20);


        tfNome.setBounds(70, 15, 250, 20);
   

        add(label1);
        add(btInserir);
        add(tfNome);
        
        
        amigo = new AmigosArqv();
    }

    public void definirEventos() {

        btInserir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
              if (tfNome.getText().equals("") ) {
                    JOptionPane.showMessageDialog(null, "Informe um nome!");
                } else {

                    amigo.nome = tfNome.getText();


                    JOptionPane.showMessageDialog(null, amigo.inserir("/home/felipex/NetBeansProjects/LOO/src/main/java/aula14_diretorios/exercicios/meusamigos"));

                    tfNome.setText("");

                }
            }
        });

    }
}
