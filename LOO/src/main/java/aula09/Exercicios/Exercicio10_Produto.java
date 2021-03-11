/*
A partir da implementação interface criada no exemplo da aula, implementar para cada classe
os métodos inserir(), excluir() e localizar().
Não mudar a assinatura do método, assim cada chamada de método deve realizar o
procedimento específico. Exemplo: inserir cliente, deve ser informado o nome e a variável
código deve ser incrementa sequencialmente. Para cada classe deve ser implementada suas
regras de negócio de acordo com cada método.
 */
package aula09.Exercicios;

/**
 *
 * @author felipex
 */
public class Exercicio10_Produto implements Exercicio10_DAO {

    private int numero;
    private String descricao;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Utilizar a palavra IMPLEMENTS para vincular a interface com a classe Ao
     * utilizar a palavra "implements" o compilador analisa e identifica aque a
     * classe cliente precisara implementar todos os metodos da interface (DAO).
     *
     */
    @Override
    public void inserir(String y) {
        setDescricao(y);
        this.numero++;
    }

    @Override
    public void excluir() {
        setNumero(0);
        setDescricao(null);

    }

    @Override
    public void localizar(int x) {
        this.numero = x;
        System.out.println("Numero: " + getNumero() + "\nDescricao: " + getDescricao());

    }

    public void baixar() {

    }

}
