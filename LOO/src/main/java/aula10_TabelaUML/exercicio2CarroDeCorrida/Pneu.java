/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10_TabelaUML.exercicio2CarroDeCorrida;

/**
 *
 * @author felipex
 */
public abstract class Pneu {

    protected double pressao;
    protected double qtdBorracha;
    protected String marca;
    protected double fatorDesgaste;

    public Pneu() {
        this.pressao = 25; 
        this.qtdBorracha = 10; 
        this.marca = "Pirelli";
    }


    public boolean rodar() {
        return false;
    }

    public double getPressao() {
        return pressao;
    }

    public void setPressao(double pressao) {
        this.pressao = pressao;
    }

    public double getQtdBorracha() {
        return qtdBorracha;
    }

    public void setQtdBorracha(double qtdBorracha) {
        this.qtdBorracha = qtdBorracha;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getFatorDesgaste() {
        return fatorDesgaste;
    }

    public void setFatorDesgaste(double fatorDesgaste) {
        this.fatorDesgaste = fatorDesgaste;
    }

}
