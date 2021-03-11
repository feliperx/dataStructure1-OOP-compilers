/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula15_DB.filmes;

import aula15_DB.BD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author lab-07
 */
public class FilmesDAO {

    public Filmes filme;
    public BD bancoDeDados;
    private PreparedStatement pstConsulta;
    private ResultSet rsResultado;
    private String mens, sql;

    //contantes estaticas para determinar que operacao deseja executar 
    public static final byte INCLUSAO = 1;
    public static final byte ALTERACAO = 2;
    public static final byte EXCLUSAO = 3;

    public FilmesDAO() {

        bancoDeDados = new BD();
        filme = new Filmes();
    }

    public boolean localizar() {
        sql = "select * from filmes where codigo = ? ";

        try {
            pstConsulta = bancoDeDados.connection.prepareStatement(sql);
            pstConsulta.setInt(1, filme.getCodigo());
            rsResultado = pstConsulta.executeQuery();
            rsResultado.next();

            filme.setCodigo(rsResultado.getInt(1));
            filme.setTitulo(rsResultado.getString(2));
            filme.setGenero(rsResultado.getString(3));
            filme.setProdutora(rsResultado.getString(4));
            filme.setDataDeCompra(rsResultado.getString(5));

            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public String atualizar(int operacao) {
        try {
            switch (operacao) {
                case INCLUSAO:
                    sql = "Insert into filmes (titulo, genero, produtora, data_compra) values (?,?,?,?,?)";
                    pstConsulta = bancoDeDados.connection.prepareStatement(sql);
                    pstConsulta.setInt(1, filme.getCodigo());
                    pstConsulta.setString(2, filme.getTitulo());
                    pstConsulta.setString(3, filme.getGenero());
                    pstConsulta.setString(2, filme.getProdutora());
                    pstConsulta.setString(2, filme.getDataDeCompra());

                    mens = "Inclusao realizada com sucesso!";

                    break;

                case ALTERACAO:
                    sql = "Update filmes set titulo = ?, genero = ?, produtora ?,"
                            + "data_compra = ? where codigo = ?";
                    pstConsulta = bancoDeDados.connection.prepareStatement(sql);
                    pstConsulta.setInt(1, filme.getCodigo());
                    pstConsulta.setString(2, filme.getTitulo());
                    pstConsulta.setString(3, filme.getGenero());
                    pstConsulta.setString(2, filme.getProdutora());
                    pstConsulta.setString(2, filme.getDataDeCompra());

                    mens = "Alteracao realizada com sucesso!";

                    break;

                case EXCLUSAO:

                    sql = "Delete from filmes where codigo = ?";
                    pstConsulta = bancoDeDados.connection.prepareStatement(sql);

                    mens = "Exclusao realizada com sucesso!";

                    break;
            }

            if (pstConsulta.executeUpdate() == 0) {
                mens = "Falha na operacao" + operacao;
            }

        } catch (SQLException e) {
            mens = "Falha na operacao " + e.toString();
        }
        return mens;
    }

}
