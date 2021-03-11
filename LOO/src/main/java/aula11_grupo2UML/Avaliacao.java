package aula11_grupo2UML;

public class Avaliacao {

    private float nota1;
    private float nota2;
    private float notaProvaFinal;
    private int frequenciaTotal = 60;
    private int frequencia;

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNotaProvaFinal() {
        return notaProvaFinal;
    }

    public void setNotaProvaFinal(float notaProvaFinal) {
        this.notaProvaFinal = notaProvaFinal;
    }

    public int getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }

    public void lancarAvaliacao(int n, float nota) {

        if (n >= 1 && n < 4 && nota <= 100 && nota >= 0) {

            switch (n) {
                case 1:
                    this.nota1 = nota;
                case 2:
                    this.nota2 = nota;
                case 3:
                    this.notaProvaFinal = nota;
            }
        }
        else 
            System.out.println("Digite um numero de (1-3) seguido da nota de 0 - 100 ");
    }

    public void calcularAprovacao() {
        if ((nota1 + nota2) / 2 >= 70 && frequencia >= (frequenciaTotal*0.75)) {
            System.out.println("Aprovado!");

        } else if ((((((nota1 + nota2) / 2) + notaProvaFinal) / 2) >= 70) && frequencia >= (frequenciaTotal*0.75)) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }
    }
}
