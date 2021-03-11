/*
 1. Elabore uma classe chamada Mes que possua um método chamado getMesPorExtenso que
recebe um número inteiro, referente ao mês do ano, um código referente ao idioma (1 para
português e 2 para inglês) e retorne o mês por extenso. A tabela a seguir ilustra alguns
exemplos.
Faça também outra classe para testar o método.
 */
package aula06_metodos;


/**
 *
 * @author felipex
 */
public class Exercicio01_Mes {

    public static String getMesPorExtenso(int mes, int idioma) {

        switch (idioma) {
            case 1:
                return portugues(mes);
            case 2:
                return ingles(mes);
            default:
                return "Idioma não encontrado!";
        }
    }

    private static String portugues(int mes) {
        String mesExtenso;
        switch (mes) {
            case 1:
                mesExtenso = "Janeiro";
                break;
            case 2:
                mesExtenso = "Fevereiro";
                break;
            case 3:
                mesExtenso = "Março";
                break;
            case 4:
                mesExtenso = "Abril";
                break;
            case 5:
                mesExtenso = "Maio";
                break;
            case 6:
                mesExtenso = "Junho";
                break;
            case 7:
                mesExtenso = "Julho";
                break;
            case 8:
                mesExtenso = "Agosto";
                break;
            case 9:
                mesExtenso = "Setembro";
                break;
            case 10:
                mesExtenso = "Outubro";
                break;
            case 11:
                mesExtenso = "Novembro";
                break;
            case 12:
                mesExtenso = "Dezembro";
                break;
            default:
                mesExtenso = "Mês não Encontrado!";
                break;

        }
        return mesExtenso;
    }

    private static String ingles(int mes) {
        String mesExtenso;
        switch (mes) {
            case 1:
                mesExtenso = "January";
                break;
            case 2:
                mesExtenso = "February";
                break;
            case 3:
                mesExtenso = "March";
                break;
            case 4:
                mesExtenso = "April";
                break;
            case 5:
                mesExtenso = "May";
                break;
            case 6:
                mesExtenso = "June";
                break;
            case 7:
                mesExtenso = "July";
                break;
            case 8:
                mesExtenso = "August";
                break;
            case 9:
                mesExtenso = "September";
                break;
            case 10:
                mesExtenso = "October";
                break;
            case 11:
                mesExtenso = "November";
                break;
            case 12:
                mesExtenso = "December";
                break;
            default:
                mesExtenso = "Mês não Encontrado!";
                break;

        }
        return mesExtenso;
    }

}
