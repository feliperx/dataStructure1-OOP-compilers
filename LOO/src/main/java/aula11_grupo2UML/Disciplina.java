package aula11_grupo2UML;

public class Disciplina {

    static int contador = 0;
    private int codigo;
    private String descricao;
    private int cargaHoraria;
    private String ementa;
    private String bibliografia;
    private int semestre;
    private boolean preReq;
    private int codReq;

    public Disciplina(String descricao, int cargaHoraria, String ementa, String bibliografia, int semestre) {
        this.codigo = contador;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
        this.ementa = ementa;
        this.bibliografia = bibliografia;
        this.semestre = semestre;
        this.preReq = false;
        codigo++;
    }

    public void mostrarDisciplina() {
        System.out.println(descricao + " | " + semestre);
        System.out.println(cargaHoraria);
        System.out.println(ementa);
        System.out.println(bibliografia);
        if (preReq == true) {
            System.out.println("Codigo da Disciplina " + codReq);
        }
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    public void setBibliografia(String bibliografia) {
        this.bibliografia = bibliografia;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public void preReq(boolean preReq, int codReq) {
        this.preReq = preReq;
        if (preReq == true) {
            this.codReq = codReq;
        }
    }
}
