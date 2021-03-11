/*
Crie uma classe chamada GPS contendo os seguintes atributos do tipo String: “idioma” e
“rota”. Defina dois métodos construtores: o default e outro para ligar o GPS com o idioma
português e uma rota qualquer. Elabore métodos para realizar as seguintes funções:
a) Definir idioma;
b) Definir rota;
c) Um método chamado “mostrar” para apresentar todos os valores atuais dos atributos do
GPS. Elabore também uma outra classe (UsaGPS) para testar essas funcionalidades.
 */
package aula09.Exercicios;

/**
 *
 * @author felipex
 */
public class Exercicio05_GPS { 
    
    private String idioma;
    private String rota;
    
    //metodo default
    public Exercicio05_GPS (){
        this.idioma = "English";
        this.rota = "California";
    }
    
    //metodo idioma portugues
    public Exercicio05_GPS (String rota){
        this.idioma = "Portugues - BR";
        this.rota = rota;
    } 
    
    public void mostrar(){
        
        System.out.println("\nIdioma: " + getIdioma() + "\nRota: " + getRota());
        
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getRota() {
        return rota;
    }

    public void setRota(String rota) {
        this.rota = rota;
    }
    
    
    
}
