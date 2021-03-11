/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10_TabelaUML.Youtubiu;

/**
 *
 * @author felipex
 */
public class Youtubiu_teste {

    public static void main(String[] args) {

        Video v[] = new Video[5];

        v[0] = new Video("Gatinho fofinho.", 120);
        v[1] = new Video("Trolando minha mãe!", 300);
        v[2] = new Video("Caio caiu!", 234);
        v[3] = new Video("FJV bate em Raça-Fla.", 345);
        v[4] = new Video("Bolsonaro falando algo inteligente.", 0); 
        
        System.out.println(v[1].mostraVideo());

        Usuario u[] = new Usuario[5];

        u[0] = new Usuario("Pedro", 17, 'M', "p1234");
        u[1] = new Usuario("Aline", 24, 'F', "a1234");
        u[2] = new Usuario("Silvia", 24, 'F', "s1234");
        u[3] = new Usuario("Herison", 24, 'M', "h1234");
        u[4] = new Usuario("Henrique", 20, 'M', "h1235"); 
        
        System.out.println(u[4].mostraUsuario());

        Visualizacao view[] = new Visualizacao[5];

        view[0] = new Visualizacao(u[0], v[2]);
        System.out.println(view[0].mostraVisualizacao());
        view[0].avaliar(4); 
        System.out.println(view[0].mostraVisualizacao());
        

        System.exit(0);
    }

}
