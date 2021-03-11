package aula12_JFrame.exercicios;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author felipex
 */
public class Exercicio01 extends JFrame {

    private static final long serialVersionUID = 1L;
    private ImageIcon image1 = new ImageIcon("/home/felipex/NetBeansProjects/LOO/src/main/java/aula12_JFrame/exercicios/bandeiras/bandeiraalemanha.png");
    private ImageIcon image2 = new ImageIcon("/home/felipex/NetBeansProjects/LOO/src/main/java/aula12_JFrame/exercicios/bandeiras/bandeirabrasil.png");
    private ImageIcon image3 = new ImageIcon("/home/felipex/NetBeansProjects/LOO/src/main/java/aula12_JFrame/exercicios/bandeiras/bandeirachina.png");
    private ImageIcon image4 = new ImageIcon("/home/felipex/NetBeansProjects/LOO/src/main/java/aula12_JFrame/exercicios/bandeiras/bandeiraespanha.png");
    private ImageIcon image5 = new ImageIcon("/home/felipex/NetBeansProjects/LOO/src/main/java/aula12_JFrame/exercicios/bandeiras/bandeiraportugal.png");
    private String[] paises = {"Alemanha", "Brasil", "China", "Espanha", "Portugal"};
    private JComboBox<String> bandeiras = new JComboBox<String>(paises);
    private static Exercicio01 frame;

    private JLabel label = new JLabel();

    public Exercicio01() {

        setTitle("BANDEIRAS");
        setBounds(0, 0, 400, 400);
        setLayout(null);
        add(bandeiras);

        bandeiras.setBounds(10, 20, 120, 30);
        label.setBounds(150, 120, 150, 100);

        label.setIcon(image1);

        getContentPane().add(bandeiras);
        getContentPane().add(label);

        definirEventos();
    }

    public Exercicio01(Exercicio05 frame2, boolean b) {

    }

    private void definirEventos() {
        bandeiras.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                int op = bandeiras.getSelectedIndex();

                switch (op) {

                    case 0:
                        label.setIcon(image1);
                        break;

                    case 1:
                        label.setIcon(image2);
                        break;

                    case 2:
                        label.setIcon(image3);
                        break;

                    case 3:
                        label.setIcon(image4);
                        break;

                    case 4:
                        label.setIcon(image5);
                        break;
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                frame = new Exercicio01();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
                frame.setLocation((tela.width - frame.getSize().width) / 2,
                        (tela.height - frame.getSize().height) / 2);
                frame.setVisible(true);
            }
        });
    }

}
