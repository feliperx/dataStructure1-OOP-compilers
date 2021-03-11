package aula11_grupo2UML;

public class Turma {

    //contadores
    static int alunos = 0;
    static int contadorDiario = 0;

    //diario sobre o dia
    private String[] diario = new String[30];

    //turma
    private int ano;
    private int semestre;
    private int diaSemana;
    private String horarios;
    private int codDisciplina;

    //alunos no maximo at� 30 por turma
    private String[] aluno = new String[30];

    //1 professor por turma
    private String professor;

    public Turma() {

    }

    public Turma(int ano, int codDisciplina, int semestre, int diaSemana, String horarios) {
        this.ano = ano;
        this.codDisciplina = codDisciplina;
        this.semestre = semestre;
        this.diaSemana = diaSemana;
        this.horarios = horarios;
    }

    public void mostraTurma() {
        int i = 0;
        System.out.println(ano);
        System.out.println(codDisciplina);
        System.out.println(semestre);
        System.out.println(diaSemana);
        System.out.println(horarios);
        System.out.println(professor);
        while (aluno[i] != null) {
            System.out.println(aluno[i]);
            i++;
        }
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public void setDiaSemana(int diaSemana) {
        this.diaSemana = diaSemana;
    }

    public void setHorarios(String horarios) {
        this.horarios = horarios;
    }

    public int getCodDisciplina() {
        return codDisciplina;
    }

    public void setCodDisciplina(int codDisciplina) {
        this.codDisciplina = codDisciplina;
    }

    public void alocarProfessor(String matricula) {
        this.professor = matricula;
    }

    public void matricularAluno(String matricula) {
        if (alunos <= 30) {
            aluno[alunos] = matricula;
        } else {
            System.out.println("Alunos nao podem mais ser matriculados");
        }
    }

    public void emitirDiario(String obs) {
        this.diario[contadorDiario] = obs;
    }

    public void getEmitirDiario() {
        int i = 0;
        while (diario[i] != null) {
            System.out.println(diario[i]);
        }
    }
}
