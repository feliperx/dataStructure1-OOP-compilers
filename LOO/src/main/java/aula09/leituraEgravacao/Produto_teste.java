/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09.leituraEgravacao;

/**
 *
 * @author felipex
 */
public class Produto_teste {
    
    public static void main(String[] args) {
        
        //teste GRAVACAO 
        ProdutoPersiste p1 = new ProdutoPersiste (); 
        p1.setCodigo(2);
        p1.setDescricao("Teclado.");
        System.out.println(p1.gravar()); 
        
        //teste LEITURA 
        Produto p = ProdutoPersiste.ler(2); 
        System.out.println(p.getCodigo());
        System.out.println(p.getDescricao());
        
        System.exit(0);
    }
}
