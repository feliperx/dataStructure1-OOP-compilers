package aula12_JFrame.exercicios;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 *
 * @author felipex
 */
public class Exercicio05 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private static Exercicio05 frame;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                frame = new Exercicio05();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
                frame.setLocation((tela.width - frame.getSize().width) / 2, (tela.height - frame.getSize().height) / 2);
                frame.setVisible(true);
            }
        });
    }

    public Exercicio05() {
        setTitle("Menu Principal");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu mnArquivos = new JMenu("Arquivos");
        menuBar.add(mnArquivos);

        JMenu mnExercicios = new JMenu("Exercicios");
        menuBar.add(mnExercicios);

        JMenuItem mntmPases = new JMenuItem("Paises");
        mntmPases.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Exercicio01().setVisible(true);
            }
        });
        mnExercicios.add(mntmPases);

        JMenuItem mntmVendas = new JMenuItem("Vendas");
        mntmVendas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Exercicio02().setVisible(true);
            }
        });
        mnExercicios.add(mntmVendas);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);
    }
}
