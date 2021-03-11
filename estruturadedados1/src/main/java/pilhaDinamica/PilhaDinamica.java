/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilhaDinamica;

/**
 *
 * @author felipex
 */
// Implementação de uma Pilha Dinâmica como Lista Encadeada 
public class PilhaDinamica {

    public PilhaDinamica_No topo; //Nó que representa o Topo (única extremidade a ser manipulada) 
    private PilhaDinamica pilha; //Construtor para iniciar a Pilha no estado vazia (sem nós, portanto, nula)
    private String str;

    //Definindo o tipo da variavel da minha entrada
    private final char Aparentese = '(';
    private final char Fparentese = ')';
    private final char Achave = '{';
    private final char Fchave = '}';
    private final char Acolchete = '[';
    private final char Fcolchete = ']';

    //Criando método para subir a entrada
    public void setEntrada(String str) {
        this.str = str;
    }

    //Verifica a entrada
    public String getEntrada() {
        return this.str;
    }

    //Método que verifica se está balanceado
    public boolean verifica() {

        this.pilha = new PilhaDinamica();

        for (int i = 0; i < this.str.length(); i++) { //Verifica toda a String que percorre no meu vetor
            //verificando cada caracter
            switch (this.str.charAt(i)) {
                case Aparentese:
                    pilha.push("(");
                    break;
                case Achave:
                    pilha.push("{");
                    break;
                case Acolchete:
                    pilha.push("[");
                    break;
                case Fparentese:
                    if (pilha.isEmpty()) {
                        return false;
                    }
                    if (pilha.pop() != "(") {
                        return false;
                    }
                    break;
                case Fchave:
                    if (pilha.isEmpty()) {
                        return false;
                    }
                    if (pilha.pop() != "{") {
                        return false;
                    }
                    break;
                case Fcolchete:
                    if (pilha.isEmpty()) {
                        return false;
                    }
                    if (pilha.pop() != "[") {
                        return false;
                    }
                    break;
                default:
                    break;
            }
        }
        pilha.print();
        return pilha.isEmpty(); //função verifica pilha vazia

    }

    //Retorna true se a Pilha está vazia 
    public boolean isEmpty() {
        return this.topo == null;
    }

    //Insere um elemento na Pilha 
    public void push(String x) {
        PilhaDinamica_No novo = new PilhaDinamica_No(); //Cria um novo nó 
        novo.setDado(x); //Insere o valor no novo nó 
        novo.setAnt(this.topo); //Configura o topo atual como anterior ao novo nó, fazendo referencia
        this.topo = novo; //O novo topo será esse novo nó 
    }

    //Retorna o elemento do Topo (sem removê-lo) 
    public String top() {
        if (!isEmpty()) {
            return this.topo.getDado();
        } else {
            return null;
        }
    }

    //Retorna o elemento do topo, removendo-o 
    public String pop() {
        if (!isEmpty()) {
            String resp = this.topo.getDado(); //Captura quem está no topo
            this.topo = topo.getAnt(); //O topo será o anterior 
            return resp; //Retorna a resposta 
        } else {
            return null;
        }
    }

    //Exibe o conteúdo da Pilha dinâmica na tela 
    public void print() {
        if (!isEmpty()) {
            String resp = new String();
            PilhaDinamica_No aux;
            aux = this.topo;
            while (aux != null) {
                resp = ", " + aux.getDado() + resp;
                aux = aux.getAnt();
            }
            System.out.println("P:[ " + resp + " ]");
            System.out.println("Pilha não está vazia!");
        } else {
            System.out.println("Pilha Vazia!");
        }
    }

}
