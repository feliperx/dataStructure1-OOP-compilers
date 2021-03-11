/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herancaEpolimorfismo;

/**
 *
 * @author felipex
 */
public class Cachorro extends Mamifero { 

    @Override //SOBREPOSICAO
    public void emitirSom() {
        System.out.println("AU aU Au.");
    }
    
    public void reagir (String frase){
        if ("Vem ntsntsnts".equals(frase) || "ts ts ts".equals(frase)){
            System.out.println("Abanar o rabo");
        }
        else 
            System.out.println("Rosnar");
    }
    
    
    //SOBRECARGA , mesma classe, assinatura diferente
    public void reagir (boolean dono){ 
        if(dono){
            System.out.println("Abanar");
        }
        else 
            System.out.println("Rosnar e Morder.");
        
    }
    
    public void reagir (int hora, int minuto){
        
        if (hora <= 12 && hora > 0){
            System.out.println("Abanar o rabo.");
        } 
        else if (hora >= 18 && hora <= 24){
            System.out.println("Ignorar.");
        } 
        else{
            System.out.println("Abanar.");
            this.emitirSom();
        }
    }
    
}
