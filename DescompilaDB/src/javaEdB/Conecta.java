/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaEdB;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author mateus
 */
public class Conecta {
    
    public static void main(String[] args) {
        final String DRIVER = "org.postgresql.Driver";
        final String URL = "jdbc:postgresql://localhost:5432/banco";
        try { 
            Class.forName(DRIVER);
            try (Connection connection = DriverManager.getConnection(URL, "postgres", "vascoporra")) {
                JOptionPane.showMessageDialog(null, "Conexão realizada com Sucesso!");
            }
            
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Driver não encontrado! " + e.toString());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Problema na conexão com o banco de dados! " + e.toString());
        }
    }
    
}
