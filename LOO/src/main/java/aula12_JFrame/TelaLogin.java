/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12_JFrame;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author felipex
 */
public class TelaLogin extends JFrame {

    private JTextField tfLogin;
    private JPasswordField pfPassword;

    private JLabel lbLogin;
    private JLabel lbPassword;

    private JButton btLogin;
    private JButton btCancel;

    private static TelaLogin frame;

    public TelaLogin() {

        inicializaComponentes();
        definirEventos();

    }

    private void inicializaComponentes() {

        setTitle("System Login");
        setBounds(0, 0, 250, 200);
        setLayout(null);

        tfLogin = new JTextField();
        pfPassword = new JPasswordField(5);

        lbLogin = new JLabel("Login");
        lbPassword = new JLabel("Password");

        btLogin = new JButton("Login");
        btCancel = new JButton("Cancel");

        tfLogin.setBounds(100, 30, 120, 25);
        pfPassword.setBounds(100, 75, 120, 25);

        lbLogin.setBounds(30, 30, 80, 25);
        lbPassword.setBounds(30, 75, 120, 25);

        btLogin.setBounds(20, 120, 100, 25);
        btCancel.setBounds(120, 120, 100, 25);

        add(tfLogin);
        add(pfPassword);
        add(lbLogin);
        add(lbPassword);
        add(btLogin);
        add(btCancel);

    }

    private void definirEventos() { 
        
        btLogin.addActionListener(new ActionListener(){
            @Override 
            public void actionPerformed(ActionEvent e){
                String senha = String.valueOf(pfPassword.getPassword()); 
                if(tfLogin.getText().equals("Felipe") && senha.equals("321")) { 
                    JOptionPane.showMessageDialog(null, "Login and Password corrects.");
                    //frame.setVisible(false); 
                    
                    TelaMenuPrincipal.abrir();
                    
                }else {
                    JOptionPane.showMessageDialog(null, "Login or Password invalids.");
                }
                
            }
        }); 
        
        btCancel.addActionListener(new ActionListener(){
            @Override 
            public void actionPerformed(ActionEvent e){ 
                System.exit(0);
                
            }
        });

    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                frame = new TelaLogin();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
                frame.setLocation((tela.width - frame.getSize().width) / 2, (tela.height - frame.getSize().width) / 2);
                frame.setVisible(true);
            }

        });

    }

}
