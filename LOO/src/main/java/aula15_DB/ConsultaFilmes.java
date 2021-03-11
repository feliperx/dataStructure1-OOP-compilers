/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula15_DB;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author mateus
 */
public class ConsultaFilmes {

    public static void main(String[] args) {
        final String DRIVER = "com.mysql.jdbc.Driver";
        final String URL = "jdbc:mysql://localhost:3306/banco";
        try {
            Class.forName(DRIVER);
            Connection connection = DriverManager.getConnection(URL, "root", "123456789");
            String sql = "SELECT Codigo, Titulo "
                    +    "FROM filmes "
                    +    "WHERE Codigo > ? AND Codigo < ? "
                    +    "ORDER BY Codigo";
            
            
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, 100);
            statement.setInt(2, 500);
            
            ResultSet resultSQLSet = statement.executeQuery();
            
            System.out.println("Codigo      Titulo");
            System.out.println("--------    ------------------");
            
            while(resultSQLSet.next()){
                String codigo = resultSQLSet.getString("Codigo");
                String titulo = resultSQLSet.getString("Titulo");
                System.out.println(codigo + "       " + titulo);
            }
            
            resultSQLSet.close();
            statement.close();
            connection.close();
                    
            
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Driver não encontrado! " + e.toString());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Problema na conexão com o banco de dados! " + e.toString());
        }

    }
}
