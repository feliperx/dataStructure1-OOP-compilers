package aula11_grupo2UML;

import java.util.Calendar;

public class Professor extends Pessoa {
	static int contador = 0;
	private String titulacaoMaxima;
	private boolean coordenador;
	private int codCurso;
	private String matricula;
	
	public Professor(String nome, String telefone, String rua, String bairro, int num, String municipio, String uf, String titulo, int codCurso) {
		super(nome, telefone, rua, bairro, num, municipio, uf);	
		this.titulacaoMaxima = titulo;
		this.matricula = gerarMatricula(codCurso);
		this.coordenador = false;
		this.codCurso = codCurso;
	}
	
	public String gerarMatricula(int codCurso) {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int mes = cal.get(Calendar.MONTH);
		String serial = Integer.toString(year) + Integer.toString(codCurso) + "03" + Integer.toString(contador);
		
		if ( mes > 0 && mes <= 6) {
			serial += "01";
		} else { 
			serial += "02";
		}
		return serial;
	}
	
	public void mostraProfessor() {
		mostraPessoaeEndereco();
		System.out.println(titulacaoMaxima);
		System.out.println(coordenador);
	}
	
	public void setCoordenador(boolean coordenador) {
		this.coordenador = coordenador;
	}

    public String getTitulacaoMaxima() {
        return titulacaoMaxima;
    }

    public void setTitulacaoMaxima(String titulacaoMaxima) {
        this.titulacaoMaxima = titulacaoMaxima;
    }

    public int getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
        
}
