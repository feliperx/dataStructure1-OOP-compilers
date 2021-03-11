/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09.Exercicios;

/**
 *
 * @author felipex
 */
public class Exercicio07_ProfessorHorista extends Exercicio07_Professor {

    private float horasTrabalhadas;
    private float valorHora;

    public Exercicio07_ProfessorHorista(float horasTrabalhadas, float valorHora, String nome, String matricula, int idade) {

        super(nome, idade, matricula);

        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;

    }

    public void mostrar() {

        System.out.println("\nNome: " + getNome() + "\nIdade: " + getIdade()
                + "\nMatricula: " + getMatricula() + "\nSalario: R$ " + getSalario());

    }

    private float getSalario() {

        return horasTrabalhadas * valorHora;

    }
}
