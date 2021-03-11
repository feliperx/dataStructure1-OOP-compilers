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
public class Cliente implements DAO { 
    
    private int codigo; 
    private String nome; 
    
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
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
   
    
}
