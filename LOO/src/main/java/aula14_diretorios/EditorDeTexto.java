/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula14_diretorios;

import java.awt.Color;
import java.awt.FileDialog;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author felipex
 */
public class EditorDeTexto extends JFrame {
    
    private JLabel label1, label2;
    private JButton btAbrir, btGravar, btLimpar;
    private JTextField tfTexto; 
    private TextArea taTexto; 
    private FileDialog fdAbrir, fdSalvar; 
    private String nomeArquivo; 
    
        public static void main(String[] args) {
        JFrame frame = new EditorDeTexto();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        //System.exit(0);
    } 
        
    public EditorDeTexto(){ 
        inicializaComponentes();
    }
        
   
    
    public void inicializaComponentes() {

        setTitle("Cadastro pessoa usando arquivo texto");
        setLayout(null);
        setBounds(250, 50, 500, 200);
        setBackground(Color.GREEN); 
        setResizable(false); 

        label1 = new JLabel("Texto a ser Editado: ");
        label1.setBounds(10, 5, 150, 20); 
        
        taTexto = new TextArea(); 
        taTexto.setBounds(10, 25, 480, 100); 
        
        btGravar = new JButton("Gravar"); 
        btGravar.setBounds(200, 210, 100, 25);
        
        btAbrir = new JButton("Abrir"); 
        btAbrir.setBounds(80, 210, 100, 25);
        
        btLimpar = new JButton("Limpar"); 
        btLimpar.setBounds(320, 210, 100, 25);
        
        label2 = new JLabel("Status:"); 
        label2.setBounds(10, 240, 100, 20);
        
        tfTexto = new JTextField(); 
        tfTexto.setBounds(65, 240, 420, 20);
        tfTexto.setEditable(false);
    
        fdAbrir = new FileDialog(this, "Abrir Arquivo", FileDialog.LOAD);
        fdSalvar = new FileDialog(this, "Salvar Arquivo", FileDialog.SAVE); 
        
        add(label1);
        add(label2);
        add(btAbrir);
        add(btGravar);
        add(btLimpar);
        add(tfTexto);
        add(taTexto);
        
    } 
    
    //FALTA DEFINIR EVENTOS PARA OS BOTÕES
    public void definirEventos(){
        btAbrir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    fdAbrir.setVisible(true);
                } catch (Exception e) {
                }
            }
        });
    }
}
