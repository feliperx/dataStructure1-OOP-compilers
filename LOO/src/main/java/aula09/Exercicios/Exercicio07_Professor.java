/*
Uma universidade possui professores que ministram suas disciplinas. Os professores da UERR,
se dividem em 2 categorias: Professor de regime integral e Professor Horista. Professores de
regime possuem um salário fixo para 40 horas de atividade semanais. Já os professores
horistas recebem um valor estipulado por hora. Todos os professores da UERR possuem:
nome, idade, matrícula. Professores Integral possuem salário e professores horistas possuem
horas e valor hora. Crie uma classe principal que possa instanciar cada tipo de professor e
para cada categoria mostre seus respectivos salários e informações.
 */
package aula09.Exercicios;

/**
 *
 * @author felipex
 */
public class Exercicio07_Professor {
    
    private String nome; 
    private int idade; 
    private String matricula; 
    
    public Exercicio07_Professor (String nome, int idade, String matricula){
        
        this.nome = nome; 
        this.idade = idade; 
        this.matricula = matricula;
        
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    
    
    
}
