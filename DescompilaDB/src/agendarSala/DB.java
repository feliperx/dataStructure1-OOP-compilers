/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendarSala;

import java.sql.*;

/**
 *
 * @author felipex
 */
public class DB {

    public Connection connection = null;
    private final String DRIVER = "org.postgresql.Driver";
    private final String DBNAME = "agendar-sala";
    private final String URL = "jdbc:postgresql://localhost:5432/" + DBNAME;
    private final String LOGIN = "postgres";
    private final String SENHA = "vascoporra"; 
    /**
     * Método que faz conexão com o banco de dados e retorna true se houver 
     * sucesso, false em caso negativo 
     * @return true or false 
     */
    
    public boolean getConnectiom(){
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, LOGIN, SENHA);
            System.out.println("Conectou");
            return true; 
        } catch (ClassNotFoundException e) {
            System.out.println("Driver não encontrado! " + e.toString());
            return false;
        } catch (SQLException e) {
            System.out.println("Problema na conexão com o banco de dados! " + e.toString());
            return false;
        }
    }
    
    public void close(){
        try {
            connection.close();
            System.out.println("Desconectou");
        } catch (SQLException e) {
        }
    }
    
    
}
