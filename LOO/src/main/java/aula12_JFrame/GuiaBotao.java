/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12_JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author felipex
 */
public class GuiaBotao extends JFrame {

    private JButton btMessage, btTeimoso;
    private ImageIcon imageIcon;

    public GuiaBotao() {

        inicializaComponentes();
        definirEventos();

    }

    private void inicializaComponentes() {
        
        setLayout(null);
        ImageIcon imageIcon = new ImageIcon("./aula12/sair2.png");

        btMessage = new JButton("Message", imageIcon);
        btMessage.setBounds(50, 20, 140, 38);
        btMessage.setToolTipText("Clique aqui para ver mensagens.");

        btTeimoso = new JButton("Teimoso");
        btTeimoso.setBounds(50, 70, 100, 25);

        add(btMessage);
        add(btTeimoso);

    }

    private void definirEventos() {

        btMessage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Clicou no botão mensagem.");

            }
        });

        btTeimoso.addMouseListener(new MouseListener() {
            
            @Override
            public void mouseClicked(MouseEvent me) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mousePressed(MouseEvent me) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent me) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            
        });

    }

}
