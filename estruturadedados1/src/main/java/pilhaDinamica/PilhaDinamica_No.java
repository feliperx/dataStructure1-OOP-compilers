/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilhaDinamica;

/**
 *
 * @author felipex
 */
public class PilhaDinamica_No {

    private String dado;  //Dado a ser armazenado no nó 
    private PilhaDinamica_No anterior;  //Referência para o nó anterior

    //Devolve o conteúdo do nó 
    public String getDado() {
        return this.dado;
    }

    //Atribui um valor ao conteúdo do nó 
    public void setDado(String novoDado) {
        this.dado = novoDado;
    }

    //Devolve a referência do nó anterior 
    public PilhaDinamica_No getAnt() {
        return this.anterior;
    }

    //Atribui uma referência para o próximo nó 
    public void setAnt(PilhaDinamica_No novoAnterior) {
        this.anterior = novoAnterior;
    }
}
