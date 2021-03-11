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
public class Exercicio07_ProfessorIntegral extends Exercicio07_Professor {

    private float salario;

    //metodo construtor 
    public Exercicio07_ProfessorIntegral(float salario, String nome, String matricula, int idade) {

        super(nome, idade, matricula);

        this.salario = salario;

    }

    public void mostrar() {

        System.out.println("\nNome: " + getNome() + "\nIdade: " + getIdade()
                + "\nMatricula: " + getMatricula() + "\nSalario: R$ " + getSalario());

    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

}
