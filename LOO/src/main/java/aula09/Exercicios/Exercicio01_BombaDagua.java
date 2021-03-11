/*
Faça uma classe que simule o funcionamento de uma bomba d ́água. A bomba possui um
atributo booleano chamado “status” e os métodos “ligar” e “desligar” (ambos sem retorno). O
método “ligar” coloca true em “status” e o método “desligar” coloca false em status. A bomba
deve ficar ligada durante um certo intervalo de tempo (em segundos). O tempo em segundos
deve ser recebido pelo método ligar. A cada segundo, apresente em tela quantos segundos
faltam para a bomba ser desligada (decrementador). Decorrido o tempo, o método desligar é
acionado e a bomba é desligada.
 */
package aula09.Exercicios;

/**
 *
 * @author felipex
 */
public class Exercicio01_BombaDagua {

    private boolean status;

    public void ligar(int tempo) throws InterruptedException {
        this.status = true;

        for (int i = tempo; i <= tempo; i--) {
            if (i > 0) {

                Thread.sleep(1000);
                System.out.println(i);
            } else {
                desligar();
                System.out.println("Bomba Desligada!");
                break;

            }
        }
    }

    public void desligar() {
        this.status = false;

    }

}
