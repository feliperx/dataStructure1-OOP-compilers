/**
 * Imprima todos numeros pares de 0 - 100000
 */
package ControleDeFluxo;

/**
 *
 * @author felipex
 */
public class ExercicioAula16_whilefor {

    public static void main(String[] args) { 
       

        int valor = 100000;

        for (int i = 0; i <= valor; i++) {
            if ((i % 2) == 0) {
                System.out.println(i);

            }

        }

    }

}
