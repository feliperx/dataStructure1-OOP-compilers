/*
 * 3) O Imposto sobre a Transmissão de Bens Móveis (ITBI) é aplicado sobre o valor de um imóvel a
ser negociado. A base de cálculo do ITBI (o valor a ser considerado no cálculo) será o maior
valor entre o valor de transação (o valor negociado) e o valor venal de referência (fornecido
pela Prefeitura). Com base nisso, elabore uma classe que receba o valor da transação, o valor
venal e o percentual de imposto. Após isso, encontre o maior valor e aplique o percentual
sobre ele. Ao final, apresente o valor do imposto a ser pago. Observação: o valor do imposto a
ser pago é calculado por meio da fórmula: valor do imposto = maior valor * percentual / 100.
Para entrada e saída de dados utilize a classe JOptionPane.
 */
package aula02_tiposdedados;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author felipex
 */
public class Exercicio03_Máximo {

    public static void main(String[] args) {

        float maiorValor, valorTransacao, valorVenal, percentual, valordoImposto;

        valorTransacao = Float.parseFloat(JOptionPane.showInputDialog("Informe o Valor de Transacao: "));

        valorVenal = Float.parseFloat(JOptionPane.showInputDialog("Informe o Valor Venal de Referencia: "));

        percentual = Float.parseFloat(JOptionPane.showInputDialog("Informe o Percentual de Imposto: "));

        maiorValor = Math.max(valorTransacao, valorVenal);
        valordoImposto = maiorValor * (percentual / 100);

        JOptionPane.showMessageDialog(null, "\nValor do imposto a ser pago: R$" + valordoImposto);

    }

}
