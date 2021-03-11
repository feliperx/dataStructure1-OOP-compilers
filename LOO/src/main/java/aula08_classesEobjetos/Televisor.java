/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula08_classesEobjetos;

/**
 *
 * @author felipex
 */
public class Televisor {

    public int volume;
    public int canal;

    public void aumentaVolume() {

        volume++; 
        mostrar();

    }

    public void diminuiVolume() {

        volume--;
        mostrar();

    }

    public void trocaCanal(int c) {

        canal = c;
        mostrar();

    }

    public void mostrar() {

        System.out.println("Volume: " + volume + "\n Canal: " + canal);

    }

}
