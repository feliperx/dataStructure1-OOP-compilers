/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10_TabelaUML.livraria;

/**
 *
 * @author felipex
 */
public interface Publicacao {

    // LEMBRAR : Interface não tem implementação!
    public void abrir();

    public void fechar();

    public void folharPagina(int p);

    public void avancarPagina();

    public void voltarPagina();

}
