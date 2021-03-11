/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula15_DB;

import java.sql.*;

/**
 *
 * @author mateus
 */
public class ConsultaFilmesComBD {

    public static void main(String[] args) {
        BD bancoDados = new BD();
        if (bancoDados.getConnectiom()) {
            try {
                String sql = "SELECT Codigo, Titulo "
                        + "FROM filmes "
                        + "WHERE Codigo > ? AND Codigo < ? "
                        + "ORDER BY Codigo";

                PreparedStatement statement = bancoDados.connection.prepareStatement(sql);
                statement.setInt(1, 100);
                statement.setInt(2, 500);

                ResultSet resultSet = statement.executeQuery();

                System.out.println("Codigo      Titulo");
                System.out.println("--------    ------------------");

                while (resultSet.next()) {
                    String codigo = resultSet.getString("Codigo");
                    String titulo = resultSet.getString("Titulo");
                    System.out.println(codigo + "       " + titulo);
                }

                resultSet.close();
                statement.close();
                bancoDados.close();
            } catch (SQLException e) {
                System.out.println("Problema na conexão com o banco de dados! " + e.toString());

            }
        }
    }
}
