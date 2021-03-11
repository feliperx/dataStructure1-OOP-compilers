/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09.Exercicios;

/**
 *
 * @author felipex
 */
public class Exercicio10_Fornecedor implements Exercicio10_DAO {
    
    private String cnpj;
    private String razaoSocial;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    /**
     * Utilizar a palavra IMPLEMENTS para vincular a interface com a classe Ao
     * utilizar a palavra "implements" o compilador analisa e identifica aque a
     * classe cliente precisara implementar todos os metodos da interface (DAO).
     *
     */
    @Override
    public void inserir(String y) {

    }

    @Override
    public void excluir() { 
        this.cnpj = null; 
        this.razaoSocial = null; 

    }

    @Override
    public void localizar(int x) { 
        
    }

}
