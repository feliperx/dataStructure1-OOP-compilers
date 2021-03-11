/*
Crie uma interface chamada Controle que especifique os métodos “andar”, “virar” e “falar”. A
seguir, crie uma classe chamada Robo que implemente esses métodos. Dentro de cada
método imprima uma mensagem em tela contendo a ação correspondente. Para testar,
elabore uma terceira classe chamada UsaRobo.
 */
package aula09.Exercicios;

/**
 *
 * @author felipex
 */
public class Exercicio08_Robo implements Exercicio08_Interface {

    @Override
    public void andar() {
        System.out.println("Robo andando.");

    }

    @Override
    public void falar() {
        System.out.println("Robo falando.");
    }

    @Override
    public void virar() {
        System.out.println("Robo virando.");
        
    }
    
    
    
    
}
