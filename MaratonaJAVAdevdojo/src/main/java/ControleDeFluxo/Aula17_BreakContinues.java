/**
 * Informe em até quantas vezes pode parcelar o preco de um carro
 * mas as parcelas nao podem ser menor que 1000
 */
package ControleDeFluxo;

import javax.swing.JOptionPane;

/**
 *
 * @author felipex
 */
public class Aula17_BreakContinues {

    public static void main(String[] args) {

        float valorTotal = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor total do carro: "));

        for (int parcela = (int) valorTotal; parcela >= 1; parcela--) { 
            
           float valorParcelado = valorTotal/parcela;
           
           if(valorParcelado <= 1000){
               continue;
           }
         System.out.println( parcela + " parcelas de R$ " + valorParcelado);
           
        }
        
        
        /*for (int parcela = 1; parcela <= valorTotal; parcela++) { 
            
           float valorParcelado = valorTotal/parcela;
           
           if(valorParcelado >= 1000){
               System.out.println( parcela + " parcelas de R$ " + valorParcelado);
           }
           else{
               JOptionPane.showMessageDialog(null, "Saiu do laço!");
               break;
           }
        }*/
    }

}
