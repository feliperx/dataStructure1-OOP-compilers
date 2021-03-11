package aula11_grupo2UML;

public class ClasseTeste {
	public static void main(String[] args) {
		Aluno p1;
		Curso p2;
		Aluno p3;
		p1 = new Aluno("Gustavo123 da Costa Oliveira", 2, "98105-4899", "Rua dos tamanduas", "Bairro jardim Primavera", 90, "Boa Vista", "RR");
		p2 = new Curso("Ciencia da computacao");
		p1.mostrarAluno();
		p2.inserirDisciplinas("Engenharia de Software", 60,"Diagrama de Classes; Engenharia de Requisitos;" , "Livro tal -- Livro tal --", 5);
		p2.inserirDisciplinas("Programacao Orientada a Objetos", 75,"Heranca - Polimorfismo - Sobrecagarga" , "Livro tal -- Livro tal --", 6);
		p2.mostrarCurso();
		p2.mostrarDisciplinas();
		p3 = new Aluno("Gustavo", 2, "98105-4899", "Rua dos tamanduas", "Bairro jardim Primavera", 90, "Boa Vista", "RR");
		p3.mostrarAluno();
		p1.calcularAprovacao();
                
        System.exit(0);
	}
}
