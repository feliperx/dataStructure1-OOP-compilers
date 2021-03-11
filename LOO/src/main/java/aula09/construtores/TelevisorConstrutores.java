/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09.construtores;


/**
 *
 * @author felipex
 */



public class TelevisorConstrutores {

    private int volume;
    private int canal;
    private boolean estado;
    
    public TelevisorConstrutores(){

    }
    
    // metodo construtor com valores já inseridos nos atributos
    public TelevisorConstrutores(int volume, int canal){ 
        
        this.volume = volume; 
        this.canal = canal; 
        this.estado = true;

    }
    
        public int getVolume() {
        return volume;
    }

    public int getCanal() {
        return canal;
    } 
    
    public boolean getEstado() {
        return estado;
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
    
    /*public void setEstado(boolean estado) {
        try {
            if (can >= 0 && can <= 900) {
                this.canal = can;
            } else {
                throw new Exception("Canal fora da faixa permitida");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }*/
    



    

    public void aumentaVolume() {

        if (volume <= 100) {

            volume++;
            System.out.println("Volume: " + getVolume());
        }
        else 
            System.out.println("Limite do volume atingido!");

    }

    public void diminuiVolume() {

        if (volume > 0) {
            volume--;
            System.out.println("Volume: " + getVolume());
        }
         else 
            System.out.println("Volume = 0");
    }

    public void aumentaCanal() {

        if (canal <= 900) {

            canal++;
            System.out.println("Canal: " + getCanal());
        }

    }

    public void diminuiCanal() {

        if (canal > 0) {
            canal--;
            System.out.println("Canal: " + getCanal());
        }
    }

    public void mostrar() {

        System.out.println("Volume: " + getVolume() + "\n Canal: " + getCanal() +
                "\nEstado: " + getEstado());

    }

}