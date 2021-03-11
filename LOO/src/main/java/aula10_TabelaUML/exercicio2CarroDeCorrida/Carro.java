/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10_TabelaUML.exercicio2CarroDeCorrida;

import java.util.Scanner;

/**
 *
 * @author felipex
 */
public class Carro {

    private double nivelCombustivel;
    private double capacidadeTanque;
    private Piloto piloto;
    private Equipe equipe;
    private PneuMacio[] pneus1;
    private PneuDuro[] pneus2;
    private int tipoPneu;
    private double qtdadeTotalBorracha;
    private String situacao;

    public Carro(String nomePiloto, double nivelC, String nomeEquipe, int tipoPneu) {

        this.capacidadeTanque = 60;
        this.nivelCombustivel = nivelC;
        this.tipoPneu = tipoPneu;
        this.piloto = new Piloto(nomePiloto);
        this.equipe = new Equipe(nomeEquipe);

        if (tipoPneu == 1) {
            this.pneus1 = new PneuMacio[4];
        } else if (tipoPneu == 2) {
            this.pneus2 = new PneuDuro[4];
        }

    }

    public boolean rodar(double km) {

        if (nivelCombustivel > 0 && tipoPneu == 1 && pneus1[1].qtdBorracha > 0) {
            this.nivelCombustivel -= km / 5;
            this.pneus1[0 - 3].qtdBorracha -= km * pneus1[1].fatorDesgaste;
            return true;

        }

        if (nivelCombustivel > 0 && tipoPneu == 2 && pneus2[1].qtdBorracha > 0) {
            this.nivelCombustivel -= km / 7.5;
            this.pneus2[0 - 3].qtdBorracha -= km * pneus2[1].fatorDesgaste;
            return true;

        } else {
            return false;
        }
    }

    public void pitStop() {

        Scanner entrada = new Scanner(System.in);
        int opcao;

        System.out.println("1 - Trocar Pneus (para MACIOS)."
                + "\n2 - Trocar Pneus (para DUROS)."
                + "\n3 - Abastecer.");

        opcao = entrada.nextInt();

        switch (opcao) {
            case 1:
                this.pneus1 = new PneuMacio[4];
                break;
            case 2:
                this.pneus2 = new PneuDuro[4];
                break;
            case 3:
                this.nivelCombustivel = capacidadeTanque;
                break;

        }

    }

    public double getNivelCombustivel() {
        return nivelCombustivel;
    }

    public void setNivelCombustivel(double nivelCombustivel) {
        this.nivelCombustivel = nivelCombustivel;
    }

    public double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public void relatorio() {

        if (tipoPneu == 1) {

            System.out.println("\nNome: " + piloto.getNome()
                    + "\nPneu1: " + pneus1[0].qtdBorracha
                    + "\nPneu2: " + pneus1[1].qtdBorracha
                    + "\nPneu3: " + pneus1[2].qtdBorracha
                    + "\nPneu4: " + pneus1[3].qtdBorracha);
        }
        if (tipoPneu == 2) {

            System.out.println("\nNome: " + piloto.getNome()
                    + "\nPneu1: " + pneus2[0].qtdBorracha
                    + "\nPneu2: " + pneus2[1].qtdBorracha
                    + "\nPneu3: " + pneus2[2].qtdBorracha
                    + "\nPneu4: " + pneus2[3].qtdBorracha);
        }

        System.out.println("Nivel de Combustivel: " + this.nivelCombustivel);

        if (nivelCombustivel > capacidadeTanque * 0.7) {
            System.out.println("\nTanque Cheio!");
        } else if (nivelCombustivel <= capacidadeTanque * 0.7 && nivelCombustivel > capacidadeTanque * 0.5) {
            System.out.println("\nTanque Nivel Regular!");
        } else if (nivelCombustivel <= capacidadeTanque * 0.5 && nivelCombustivel > capacidadeTanque * 0.3) {
            System.out.println("\nMeio Tanque!");
        } else {
            System.out.println("\nTanque com Nivel Baixo, vá para o PitStop!");
        }

        if (pneus1[1].qtdBorracha > 7) {
            System.out.println("\nBom de Borracha!");
        } else if (pneus1[1].qtdBorracha <= 7 && pneus1[1].qtdBorracha > 5) {
            System.out.println("\nMeia vida dos pneus!");
        } else if (pneus1[1].qtdBorracha <= 5 && pneus1[1].qtdBorracha > 3) {
            System.out.println("\nTrocar a curto prazo!");
        } else {
            System.out.println("\nVá para o box!");
        }

    }

}
