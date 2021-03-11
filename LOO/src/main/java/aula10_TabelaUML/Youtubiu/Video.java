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
public class Video implements AcaoVideo {

    private String titulo;
    private int avaliacao;
    private long view;
    private int curtidas;
    private int tempoVideo;
    private boolean reproduzindo;

    public Video(String titulo, int tempoVideo) {
        this.titulo = titulo;
        this.tempoVideo = tempoVideo;
        this.view = 0; //default
        this.curtidas = 0; //default
        this.avaliacao = 0; //default
        this.reproduzindo = false; //default
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public long getView() {
        return view;
    }

    public void setView(long view) {
        this.view = view;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public int getTempoVideo() {
        return tempoVideo;
    }

    public void setTempoVideo(int tempoVideo) {
        this.tempoVideo = tempoVideo;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public void play() {
        this.reproduzindo = true;
    }

    @Override
    public void pause() {
        this.reproduzindo = false;
    }

    @Override
    public void like() {
        this.curtidas++;
    }

    @Override
    public void deslike() {
        if (curtidas > 0) {
            this.curtidas--;
        } else {
            this.curtidas = 0;
        }

    }

    @Override
    public void guardar() {
        
    } 
    
    public String mostraVideo() {
        return ">>> Video <<<" + "\nTitulo: " + titulo + "\nAvaliacao: " + avaliacao +
                "\nView: " + view + "\nCurtidas: " + curtidas + "\nTempo de Video: " + 
                tempoVideo + "\nReproduzindo: " + reproduzindo + "\n\n";
    }

}
