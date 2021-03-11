/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10_TabelaUML.Youtubiu;

/**
 *
 * @author felipex
 */
public class Visualizacao {

    //gerando os atributos agregados
    private Usuario espectador;
    private Video filme;
    
    public Visualizacao(Usuario espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        
        this.espectador.setViewUser(this.espectador.getViewUser() + 1);
        
        this.filme.setView(this.filme.getView() + 1);
    }
    
    public Usuario getEspectador() {
        return espectador;
    }
    
    public void setEspectador(Usuario espectador) {
        this.espectador = espectador;
    }
    
    public Video getFilme() {
        return filme;
    }
    
    public void setFilme(Video filme) {
        this.filme = filme;
    }

    //POLIMORFISMO SOBRECARGA: mesma classe, assinatura diferente
    public void avaliar() {
        
    }
    
    public void avaliar(int nota) {
        this.filme.setAvaliacao(nota);
        
    }
    
    public void avaliar(String porcentagem) {
        
        int contador = Integer.parseInt(porcentagem);
        
        if (contador < this.filme.getTempoVideo() * 0.2) {
            
            this.filme.setAvaliacao(2);
        } else if (contador < this.filme.getTempoVideo() * 0.5) {
            
            this.filme.setAvaliacao(3);
        } else if (contador < this.filme.getTempoVideo() * 0.8) {
            
            this.filme.setAvaliacao(4);
        } else if (contador <= this.filme.getTempoVideo()) {
            
            this.filme.setAvaliacao(5);
        }
        
    }
    
    public String mostraVisualizacao() {
        return ">>> V I S U A L I Z A C A O <<<" + "\n\n" + espectador.mostraUsuario() + filme.mostraVideo() + '\n';
    }
    
}
