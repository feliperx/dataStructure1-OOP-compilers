package aula11_grupo2UML;


import aula11_grupo2UML.Disciplina;

public class Curso {
	
	static int contador = 0;
	static int contadorDisc = 0;
	private int codigo;
	private String descricao;
	Disciplina[] disciplinas = new Disciplina[50];
	
	public Curso(String descricao){
		this.codigo = contador;
		this.descricao = descricao;
		contador++;
	}
	
	public void mostrarCurso() {
		System.out.println(codigo);
		System.out.println(descricao);
	}
	
	public void inserirDisciplinas(String descricao, int cargaHoraria, String ementa, String bibliografia, int semestre) {
		disciplinas[contadorDisc] = new Disciplina(descricao, cargaHoraria, ementa, bibliografia, semestre);
		contadorDisc++;
	}
	
	public void mostrarDisciplinas() {
		int i = 0;
		while(disciplinas[i] != null) {
			disciplinas[i].mostrarDisciplina();
			i++;
		}
	}
	
	public void mostrarDisciplinapeloCodigo(int i) {
		disciplinas[i].mostrarDisciplina();
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setCargaHoraria(int cargaHoraria, int n) {
		disciplinas[n].setCargaHoraria(cargaHoraria);
	}

	public void setEmenta(String ementa, int n) {
		disciplinas[n].setEmenta(ementa);
	}

	public void setBibliografia(String bibliografia, int n) {
		disciplinas[n].setBibliografia(bibliografia);
	}

	public void setSemestre(int semestre, int n) {
		disciplinas[n].setSemestre(semestre);
	}
	
	public void preReq(boolean preReq, int codReq, int n) {
		disciplinas[n].preReq(preReq, codReq);
	}
}
