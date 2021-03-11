/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12_JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author felipex
 */
public class TelaCaixaOpcao extends JFrame { 
    
    private JButton btVerificar, btMarcar, btDesmarcar; 
    private JCheckBox ckIngles, ckInformatica; 
    
    public TelaCaixaOpcao() {

        inicializaComponentes();
        definirEventos();

    }

    private void inicializaComponentes() { 
        
        setLayout(null); 
        btVerificar = new JButton("Verificar"); 
        btMarcar = new JButton("Marcar"); 
        btDesmarcar = new JButton("Desmarcar"); 
        ckIngles = new JCheckBox("Ingles"); 
        ckInformatica = new JCheckBox("Informatica"); 
        
        btVerificar.setBounds(20, 70, 120, 20);
        btMarcar.setBounds(20, 100, 110, 25);
        btDesmarcar.setBounds(20, 130, 110, 20);
        ckIngles.setBounds(15, 40, 110, 25);
        ckInformatica.setBounds(15, 15, 110, 25);
        
        add(btVerificar);
        add(btMarcar);
        add(btDesmarcar);
        add(ckIngles);
        add(ckInformatica); 
        
        
        
    }

    private void definirEventos() {
        
        btMarcar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ckInformatica.setSelected(true);
                ckIngles.setSelected(true);

            }
        });
        btDesmarcar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ckInformatica.setSelected(false);
                ckIngles.setSelected(false);

            }
        });
        btMarcar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String selecao = "selecionados"; 
                
                if(ckInformatica.isSelected()){
                    selecao = "\n Informatica"; 
                    
                } 
                
                if(ckIngles.isSelected()){
                    selecao = "\n Ingles"; 
                    
                } 
                
                JOptionPane.showMessageDialog(null, selecao);

            }
        });
        
    }
    
}
