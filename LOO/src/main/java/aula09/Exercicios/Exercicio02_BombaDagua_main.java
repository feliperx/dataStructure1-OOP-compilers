/*
 Crie uma classe chamada UsaBomba que utilize a classe do exercício anterior. Ela deve conter
o método main e:
a) instanciar uma bomba (bomba1);
b) ligar o objeto bomba1 durante 5 segundos;
 */
package aula09.Exercicios;

/**
 *
 * @author felipex
 */
public class Exercicio02_BombaDagua_main {

    public static void main(String[] args) throws InterruptedException {

        Exercicio01_BombaDagua bomba1 = new Exercicio01_BombaDagua();

        bomba1.ligar(20);

        System.exit(0);

    }

}
