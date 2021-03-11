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
public class Exercicio10_Cliente implements Exercicio10_DAO { 
    
    private int codigo; 
    private String nome; 
    
    /**
     * Utilizar a palavra IMPLEMENTS para vincular a interface com a classe 
     * Ao utilizar a palavra "implements" o compilador analisa e identifica aque a classe 
     * cliente precisara implementar todos os metodos da interface (DAO).
     * 
     */
    
    @Override
    public void inserir(String y){
        setNome(y);
        this.codigo++;
    } 
    
    @Override
    public void excluir(){ 
        this.nome = null; 
        this.codigo = 0;
        
    }
    
    @Override
    public void localizar(int x){ 
        this.codigo = x; 
        System.out.println("\nCodigo: " + getCodigo() + "\nNome: " + getNome() + "\n");
        
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
