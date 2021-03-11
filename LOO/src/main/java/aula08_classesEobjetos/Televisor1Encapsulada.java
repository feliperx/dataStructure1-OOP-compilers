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
public class Televisor1Encapsulada {

    private int volume;
    private int canal;

    public void aumentaVolume() {

        if (this.volume <= 100) {

            this.volume++;
            mostrar();
        }

    }

    public void diminuiVolume() {

        if (volume > 0) {
            volume--;
            mostrar();
        }
    }

    public void aumentaCanal() {

        if (canal <= 900) {

            canal++;
            mostrar();
        }

    }

    public void diminuiCanal() {

        if (canal > 0) {
            canal--;
            mostrar();
        }
    }

    public void mostrar() {

        System.out.println("Volume: " + getVolume() + "\n Canal: " + getCanal());

    }

    public int getVolume() {
        return volume;
    }

    public int getCanal() {
        return canal;
    }

    public void setVolume(int vol) {
        try {
            if (vol >= 0 && vol <= 100) {
                this.volume = vol;
            } else {
                throw new Exception("Volume fora da faixa permitida");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void setCanal(int can) {
        try {
            if (can >= 0 && can <= 900) {
                this.canal = can;
            } else {
                throw new Exception("Canal fora da faixa permitida");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
