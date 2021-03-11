package aula11_grupo2UML;

import java.util.Calendar;

public class Aluno extends Pessoa {

    static int contador = 0;
    private String matricula;
    private String situacao;
    private int semestre;
    private int codCurso;
    private Avaliacao avaliacoes = new Avaliacao();
    private Turma turmas = new Turma();

    public Aluno(String nome, int codCurso, String telefone, String rua, String bairro, int num, String municipio, String uf) {
        super(nome, telefone, rua, bairro, num, municipio, uf);
        this.situacao = "Cursando";
        this.semestre = 1;
        this.codCurso = codCurso;
        this.matricula = gerarMatricula();
        contador++;
    }

    public String gerarMatricula() {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int mes = cal.get(Calendar.MONTH);
        String serial = Integer.toString(year) + Integer.toString(contador);

        if (mes > 0 && mes <= 6) {
            serial += "01";
        } else {
            serial += "02";
        }
        return serial;
    }

    public String trancar() {
        return this.situacao = "Trancou o Curso";
    }

    public String formar() {
        return this.situacao = "Pode se Formar";
    }

    public String evadir() {
        return this.situacao = "Evadido do Curso";
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Aluno.contador = contador;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public int getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }

    public int getTurmasCodDisc() {
        return turmas.getCodDisciplina();
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public void mostrarAluno() {
        mostraPessoaeEndereco();
        System.out.println(situacao);
        System.out.println(matricula);
        System.out.println(semestre + " Semestre");
    }

    public float getNota1() {
        return avaliacoes.getNota1();
    }

    public float getNota2() {
        return avaliacoes.getNota2();
    }

    public float getNotaProvaFinal() {
        return avaliacoes.getNotaProvaFinal();
    }

    public int getFrequencia() {
        return avaliacoes.getFrequencia();
    }

    public void calcularAprovacao() {
        if ((avaliacoes.getNota1() + avaliacoes.getNota2()) / 2 >= 70 && avaliacoes.getFrequencia() >= 75) {
            System.out.println("Aprovado!");
        } else if ((((avaliacoes.getNota1() + avaliacoes.getNota2() + avaliacoes.getNotaProvaFinal()) / 3) >= 70) && avaliacoes.getFrequencia() >= 75) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }

    }
}
