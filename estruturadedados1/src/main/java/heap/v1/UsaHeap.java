/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heap.v1;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/**
 *
 * @author felipex
 */
public class UsaHeap extends JFrame  {

    Heap heap;
    JLabel textoEntrada;
    JTextField entrada;
    JButton botaoInsere;
    JButton botaoRemove;
    JTextArea Saida;
    JTextArea Saida1;

    /** Inicia a classe UsaAbb criando uma árvore vazia e apresentando os
	componentes da Interface Gráfica */
    public UsaHeap() {
	   heap = new Heap(); // Cria uma heap.
	   criaComponentes();
	   setVisible(true); 
    };


    /** Mostra o conteúdo da pilha na caixa de texto "preOrdem" */
    private void mostraHeap() {
	   Saida.setText(heap.mostra(1));
	   Saida1.setText(heap.mostra());
	}


    /** Cria, posiciona e inicia os componentes da Interface
	    gráfica, como caixas de textos e botões */
    private void criaComponentes() {

        /** Altera o texto na barra de título da Janela. */
        setTitle("Programa Simples que Utiliza uma Abb");

        /** Cria o texto que será mostrado acima da caixa de entrada */
        textoEntrada = new JLabel("Entrada:");
		
		/** Cria a caixa de entrada para digitação dos elementos 
		    a serem inserido.
		    O tamanho da caixa de texto é de 10 caracteres. */
	entrada = new JTextField(10);

        /** Cria o botão que ao ser clicado, empilha o elemento contido
		 na caixa de texto entrada. */
        botaoInsere = new JButton();
        botaoInsere.setText("Insere");
        botaoInsere.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
			
			    // Aqui deve ser colocado o código a ser executado quando
				// o usuário clicar no botão. 			
           heap.insere(Integer.parseInt(entrada.getText()));
                mostraHeap();
            }
        });

        /** Cria o botão que ao ser clicado, desempilha um elemento. */
        botaoRemove = new JButton();
        botaoRemove.setText("Remove");
        botaoRemove.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {

			    // Aqui deve ser colocado o código a ser executado quando
				// o usuário clicar no botão.
                heap.Remover();
                mostraHeap();
            }
        });

        /** Cria caixa de texto para mostrar o conteúdo da pilha (com 20 linhas e
		   50 colunas */
        Saida = new JTextArea(20,50);
	Saida.setLineWrap(true);

	Saida1 = new JTextArea(1,50);
	Saida1.setLineWrap(true);

        /** Determina como os elementos gráficos devem ser posicionados
		 na Janela.	 */
		 
		Container principal = getContentPane();
		principal.setLayout(new BoxLayout(principal,BoxLayout.Y_AXIS));
		principal.add(textoEntrada);
		principal.add(entrada);
		
		/** O Código abaixo é responsável pelo alinhamento horizontal (X_AXIS) 
		    dos dois botões. Sem esse códigos, os botões seriam alinhados
			horizontalmente (Y_AXIS) */			
		JPanel botoes = new JPanel();
		botoes.setLayout(new BoxLayout(botoes,BoxLayout.X_AXIS));
		botoes.add(botaoInsere);
		botoes.add(botaoRemove);
		
		principal.add(botoes);
		principal.add(Saida);
		principal.add(Saida1);


		/** Posicionamento da Janela na Tela do Computador. */
        setLocation(100,40);

        pack();

        /** Fecha o programa quando a janela é fechada. (Sem o código abaixo,
		    a janela fecha mas o programa continua aberto - porém,s inacessível) */	         addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                System.exit(0);
            }
        });
	}
		
    public static void main(String args[]) {
	    new UsaHeap();
	}


}