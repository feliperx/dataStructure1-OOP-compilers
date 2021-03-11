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
public class Livro implements Publicacao {

    private String titulo;
    private String autor;
    private int totalPag;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    //metodo construtor
    public Livro(String titulo, String autor, int totalPag, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPag = totalPag;
        this.leitor = leitor;

        //Cada novo livro vai default
        this.aberto = false;
        this.pagAtual = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPag() {
        return totalPag;
    }

    public void setTotalPag(int totalPag) {
        this.totalPag = totalPag;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    //Metodo da classe
    public void detalhes() {
        System.out.println(">>> Livro <<< " + "\nTitulo: " + titulo + "\nAutor: " + autor
                + "\nTotal de Paginas: " + totalPag + "\nPagina Atual: " + pagAtual
                + "\nAberto: " + aberto + "\nLeitor: " + leitor.getNome() + "\n");

    }

    //Implementando os metodos com as regras de negocios
    @Override
    public void abrir() {
        this.aberto = true;

    }

    @Override
    public void fechar() {
        this.aberto = false;

    }

    @Override
    public void folharPagina(int p) {
        if (p > this.totalPag) {
            this.pagAtual = this.totalPag;

        } 
        else if (p<0){
            this.pagAtual = 0;
        }
        
        else {
            this.pagAtual = p;
        }
    this.aberto = true;    
    }

    @Override
    public void avancarPagina() {
        this.pagAtual++;

    }

    @Override
    public void voltarPagina() {
        this.pagAtual--;

    }

}
