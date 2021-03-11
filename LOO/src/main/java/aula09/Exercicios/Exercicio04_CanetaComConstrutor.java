/*
3. Considere a representação da classe Caneta da Figura abaixo. Elabore a classe em java de
acordo com a notação UML. O atributo ponta é um atributo do tipo float que deve receber
valores: “0.5”, “1.0”, “1.5” e “2.0”.
Crie uma nova classe para criar os objetos. Neste exemplo crie 5 tipos de canetas diferentes e
no final mostre cada uma com o método status(), que deve mostrar todos os atributos criados
para cada objeto.
 */
package aula09.Exercicios;

/**
 *
 * @author felipex
 */
public class Exercicio04_CanetaComConstrutor {

    private String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;
    private int i; //contador 
    
    public Exercicio04_CanetaComConstrutor(String modelo, float ponta, String cor){
        
        this.modelo = modelo; 
        this.ponta = ponta; 
        this.cor = cor; 
        this.tampada = true; //default
        
        
    }

    public void status() {
        System.out.println(">> Caneta <<" + "\n\nModelo: " + getModelo()
                + "\nPonta: " + getPonta()
                + "\nTampada: " + tampada
                + "\nCor: " + getCor() + "\n\n");

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String marca) {
        this.modelo = marca;
    }

    public float getPonta() {
        //return ponta; // retorna float, não float[]
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

}
