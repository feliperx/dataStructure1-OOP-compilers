/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09.leituraEgravacao;

import java.io.Serializable;


/**
 *
 * @author felipex
 */
public class Produto implements Serializable {
    
    // pacote necessario do java.io para leituraa e gravacao de arquivos
    
    private int codigo; 
    private String descricao; 

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
}
