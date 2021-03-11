/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10_TabelaUML.exercicio1Robo;

/**
 *
 * @author felipex
 */
public class MainRobo {

    public static void main(String[] args) {

        TestaRobo r2test = new TestaRobo();

        r2test.definirAmbiente();
        r2test.iniciarRobo();

        r2test.menu(); 
        
     System.exit(0);
    }

}
