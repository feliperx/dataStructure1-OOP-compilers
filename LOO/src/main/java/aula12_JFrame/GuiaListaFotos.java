/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12_JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;

/**
 *
 * @author felipex
 */
public class GuiaListaFotos extends JFrame { 
    
    private JList lsFotos; 
    private DefaultListModel dlm; 
    private ImageIcon imgIcon; 
    private JScrollPane spane; 
    private JLabel lbImagem; 
    
    
    public GuiaListaFotos(){ 
        
        inicializaComponentes();
        definirEventos();
        
    } 
    
    private void inicializaComponentes(){ 
        
        setLayout(null); 
        dlm = new DefaultListModel(); 
        for (int i = 1; i < 6; i++) {
            
            dlm.addElement("Foto" + i);
            
        } 
        
        lsFotos = new JList(dlm); 
        spane = new JScrollPane(lsFotos); 
        spane.setBounds(50, 40, 70, 100); 
        
        imgIcon = new ImageIcon(); 
        lbImagem = new JLabel(imgIcon); 
        lbImagem.setBounds(150, 30, 180, 180); 
        
        add(spane); 
        add(lbImagem);
        
    }
    
    private void definirEventos(){ 
//        
//        lsFotos.aListSelectionLister(new aListSelectionLister() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                ckInformatica.setSelected(true);
//                ckIngles.setSelected(true);
//
//            }
//        });
//        
    }
    
    
    
    
}
