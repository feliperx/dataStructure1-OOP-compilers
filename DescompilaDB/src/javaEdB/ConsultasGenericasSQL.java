/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaEdB;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mateus
 */
public class ConsultasGenericasSQL extends JFrame {
    
    private JLabel label1;
    private JButton btExecutar; 
    private JTextField tfSQL;
    private JScrollPane scrollTable;
    private JTable jTable; 
    private BD bancoDados;
    private PreparedStatement pstConsulta; 
    private ResultSet rsResultado;
    
    
    public static void main(String[] args) {
        JFrame frame = new ConsultasGenericasSQL();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    public ConsultasGenericasSQL(){
        inicializaComponentes();
        definirEventos();
    }
            
    public void inicializaComponentes() {
        
        setTitle("Consultas SQL");
        setLayout(null);
        setBounds(200, 100, 600, 450);
        setBackground(Color.GREEN);
        setResizable(false);
        
        label1 = new JLabel("Digite o comando SQL:");
        label1.setBounds(50, 10, 200, 25);
        tfSQL = new JTextField(50);
        tfSQL.setBounds(50, 35, 500, 25);
        btExecutar = new JButton("Executar");
        btExecutar.setBounds(50, 70, 100, 25);
        scrollTable = new JScrollPane();
        scrollTable.setBounds(50, 100, 500, 300);
        
        add(scrollTable);
        add(label1);
        add(tfSQL);
        add(btExecutar);
        bancoDados = new BD();
        
    }

    public void definirEventos(){
        btExecutar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tfSQL.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Escreva uma consulta SQL!");
                    return;
                }
                try {
                    if(!bancoDados.getConnectiom()){
                       JOptionPane.showMessageDialog(null, "Falha ao conectar no banco de dados! "
                               + "O sistema será encerrado!");
                       System.exit(0);
                    }
                    
                    pstConsulta = bancoDados.connection.prepareStatement(tfSQL.getText());
                    rsResultado = pstConsulta.executeQuery();
                    DefaultTableModel tableModel = new DefaultTableModel( new String[]{}, 0){};
                    
                    int qtdeColunas = rsResultado.getMetaData().getColumnCount();
                    for (int indice = 1; indice <= qtdeColunas; indice++) {
                        tableModel.addColumn(rsResultado.getMetaData().getColumnName(indice));
                    }
                    
                    jTable = new JTable(tableModel);
                    DefaultTableModel dtm = (DefaultTableModel) jTable.getModel();
                    
                    while (rsResultado.next()) {
                        try {
                            String[] dados = new String[qtdeColunas];
                            for (int i = 1; i <= qtdeColunas; i++) {
                                dados[i-1] = rsResultado.getString(i);
                                System.out.println(rsResultado.getString(i));
                            }
                            dtm.addRow(dados);
                            System.out.println();
                        } catch (SQLException erroSql) {
                        }
                        scrollTable.setViewportView(jTable);
                    }
                    
                    rsResultado.close();
                    pstConsulta.close();
                    bancoDados.close();
                            
                } catch (Exception erro) {
                    JOptionPane.showMessageDialog(null, "Comando SQL Inválido " + erro.toString());
                }
            }
        });
    }
    
    /* Algumas consultas SQL
    select * from filmes
    select * from filmes order by datacompra
    select titulo from filmes where genero = 'comedia'
    select * from filmes where dataCompra > "1995-01-01" and datacompra < "2010-01-01" 
    
    
    */
    
}
