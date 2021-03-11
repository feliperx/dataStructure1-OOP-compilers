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
public class Exercicio06_Brinquedo_main {

    public static void main(String[] args) {

        Exercicio06_Brinquedo b1 = new Exercicio06_Brinquedo();
        Exercicio06_Brinquedo b2 = new Exercicio06_Brinquedo("Cubo Mágico");
        Exercicio06_Brinquedo b3 = new Exercicio06_Brinquedo("Bola de Futebol", 30);

        b1.setNome("Wood");
        b1.setFaixaEtaria(2);
        b1.setPreco(60);

        b2.setPreco(40);
        b2.setFaixaEtaria(4);

        b1.mostrar();
        b2.mostrar();
        b3.mostrar();

        System.exit(0);

    }

}
