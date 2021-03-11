/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12_JFrame;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;

/**
 *
 * @author felipex
 */
public class TelaMenuPrincipal extends JFrame {

    private Container contentPane;

    private JMenuBar menuBar;
    private JMenu menuFile, menuExample;
    private JMenuItem menuExit, menuBotton, menuCaixaOpcao;

    private static TelaMenuPrincipal frame;

    public TelaMenuPrincipal() {

        inicializaComponentes();
        definirEventos();

    }

    public static void abrir() {

        frame = new TelaMenuPrincipal();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation((tela.width - frame.getSize().width) / 2, (tela.height - frame.getSize().width) / 2);
        frame.setVisible(true);

    }

    private void inicializaComponentes() {

        setTitle("Main MENU");
        setBounds(0, 0, 800, 600);
        setLayout(null);

        contentPane = getContentPane();
        menuBar = new JMenuBar();
        menuFile = new JMenu("File");
        menuExample = new JMenu("Example");

        menuExit = new JMenuItem("Exit", new ImageIcon("/aula12/sair-icone.png"));

        menuFile.add(menuExit);
        menuBar.add(menuFile);
        menuBar.add(menuExample);

        setJMenuBar(menuBar);

        //add novos componentes no frame principal 
        menuBotton = new JMenuItem("1 - Option");
        menuExample.add(menuBotton); 
        
        //Colocar a opção do frame TelaCaixaOpcao 
        menuCaixaOpcao = new JMenuItem("2 - Config"); 
        menuExample.add(menuCaixaOpcao); 
        
        //Colocar a opção do frame TelaCaixaOpcao 
        menuCaixaOpcao = new JMenuItem("2 - Config"); 
        menuExample.add(menuCaixaOpcao); 
        
        //Colocar a opção do frame TelaCaixaOpcao 
        menuCaixaOpcao = new JMenuItem("2 - Config"); 
        menuExample.add(menuCaixaOpcao); 

    }

    private void definirEventos() {

        menuExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);

            }
        });

        menuBotton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                GuiaBotao botao = new GuiaBotao();
                contentPane.removeAll(); //remove todos os objetos do containew e mantem apenas o ultimo
                contentPane.add(botao); // add o GuiaBotao ao container 
                contentPane.validate(); // valida o conatainer e todos os componentes que estao dentro dele

            }
        }); 
        
        menuCaixaOpcao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // vamos incrementar depois
                GuiaBotao botao = new GuiaBotao();
                contentPane.removeAll(); //remove todos os objetos do containew e mantem apenas o ultimo
                contentPane.add(botao); // add o GuiaBotao ao container 
                contentPane.validate(); // valida o conatainer e todos os componentes que estao dentro dele

            }
        });

    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                frame = new TelaMenuPrincipal();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
                frame.setLocation((tela.width - frame.getSize().width) / 2, (tela.height - frame.getSize().width) / 2);
                frame.setVisible(true);
            }

        });

    }

    /*

    public static void main(String[] args) {

        TelaMenuPrincipal frame = new TelaMenuPrincipal();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation((tela.width - frame.getSize().width) / 2, (tela.height - frame.getSize().width) / 2);
        frame.setVisible(true);

    } 

     */
}
