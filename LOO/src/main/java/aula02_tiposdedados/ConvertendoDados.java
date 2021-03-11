/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02_tiposdedados;

import java.util.Scanner;

/**
 *
 * @author felipex
 */
public class ConvertendoDados { 
    
            public static void main(String[] args) {

          String string = "";
          float largura, comprimento, area, perimetro;

          // Criando a classe de leitura do Scanner - ler
          Scanner ler = new Scanner(System.in); 
          
          

          try {
                // Entrada de dado
                System.out.print("Entre com o comprimento: ");
                comprimento = ler.nextFloat();

                // convertendo string para float - Erro
                comprimento = Float.parseFloat(string);

                // Entrada de dado
                System.out.println("Entre com o largura");
                largura = ler.nextFloat();

                // convertendo string para float - Erro
                comprimento = Float.parseFloat(string);

                perimetro = (comprimento * 2) + (largura * 2);
                area = comprimento * largura;

                System.out.println("Area: " + area);
                System.out.println("Perimetro:   " + perimetro);

            } catch(NumberFormatException error){
                System.out.println("Houve um Erro na conversão dos tipos de dados");
            } catch(IllegalArgumentException error) {
                System.out.println("Quando um argumento é passado invalidamente");
            } catch(Exception error ) {
                System.out.println("Houve algum erro durante a execução do programa");
            }
    }
    
}
