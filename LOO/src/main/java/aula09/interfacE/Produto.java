/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09.interfacE;

/**
 *
 * @author felipex
 */
public class Produto implements DAO { 
    
    private int numero; 
    private String descricao;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
       /**
     * Utilizar a palavra IMPLEMENTS para vincular a interface com a classe 
     * Ao utilizar a palavra "implements" o compilador analisa e identifica aque a classe 
     * cliente precisara implementar todos os metodos da interface (DAO).
     * 
     */
    
    @Override
    public void inserir(){
        
    } 
    
    @Override
    public void excluir(){
        
    }
    
    @Override
    public void localizar(){
        
    }
    
    public void baixar(){
        
    }
    
    
}
