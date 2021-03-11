/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula14_diretorios;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author felipex
 */
public class CadastroPessoaComArquivo extends JFrame {

    private JLabel label1, label2, label3;
    private JButton btAbrir, btGravar, btLimpar;
    private JTextField tfCodigo, tfNome, tfEmail;
    private PessoaArquivo pessoa;

    public static void main(String[] args) {
        JFrame frame = new CadastroPessoaComArquivo();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        //System.exit(0);
    }

    public CadastroPessoaComArquivo() {
        inicializaComponentes();
        definirEventos();
    }

    public void inicializaComponentes() {

        setTitle("Cadastro pessoa usando arquivo texto");
        setBounds(250, 50, 340, 160);
        setBackground(Color.DARK_GRAY);

        label1 = new JLabel("Código: ");
        label2 = new JLabel("Nome: ");
        label3 = new JLabel("Email: ");

        btAbrir = new JButton("Abrir");
        btGravar = new JButton("Gravar");
        btLimpar = new JButton("Limpar");

        tfCodigo = new JTextField();
        tfNome = new JTextField();
        tfEmail = new JTextField();

        setLayout(null);

        label1.setBounds(10, 15, 60, 20);
        label2.setBounds(10, 40, 60, 20);
        label3.setBounds(10, 65, 60, 20);

        btAbrir.setBounds(10, 100, 80, 20);
        btGravar.setBounds(110, 100, 90, 20);
        btLimpar.setBounds(220, 100, 90, 20);

        tfCodigo.setBounds(70, 15, 55, 20);
        tfNome.setBounds(70, 65, 250, 20);
        tfEmail.setBounds(70, 40, 250, 20);

        add(label1);
        add(label2);
        add(label3);
        add(btAbrir);
        add(btGravar);
        add(btLimpar);
        add(tfCodigo);
        add(tfNome);
        add(tfEmail);
        
        
        pessoa = new PessoaArquivo();
    }

    public void definirEventos() {
        btLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                tfCodigo.setText("");
                tfNome.setText("");
                tfEmail.setText("");
            }
        });

        btGravar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (tfCodigo.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Código Vazio!");
                } else if (tfNome.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Nome Vazio!");
                } else if (tfEmail.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Email Vazio!");
                } else {
                    pessoa.codigo = tfCodigo.getText();
                    pessoa.nome = tfNome.getText();
                    pessoa.email = tfEmail.getText();

                    JOptionPane.showMessageDialog(null, pessoa.gravar("/home/felipex/NetBeansProjects/LOO/src/main/java/aula14_diretorios/Pessoas"));

                    tfCodigo.setText("");
                    tfNome.setText("");
                    tfEmail.setText("");

                }
            }
        });

        btAbrir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                pessoa.codigo = JOptionPane.showInputDialog(null, " Forneca o codigo da pessoa: ");
                pessoa = pessoa.ler("/home/felipex/NetBeansProjects/LOO/src/main/java/aula14_diretorios/Pessoas");
                if (pessoa != null) {
                    tfCodigo.setText(pessoa.codigo);
                    tfNome.setText(pessoa.nome);
                    tfEmail.setText(pessoa.email);
                } 
                
                else {
                    JOptionPane.showMessageDialog(null, "Codigo não encontrado.");
                }

            }
        });

    }
}
