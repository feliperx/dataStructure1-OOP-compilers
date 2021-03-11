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
public class Usuario extends Pessoa {

    private String login;
    private int viewUser;

    public Usuario(String nome, int idade, char sexo, String login) {

        super(nome, idade, sexo);

        this.login = login;
        this.viewUser = 0;
    }

    public void viewNovamente() {

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getViewUser() {
        return viewUser;
    }

    public void setViewUser(int viewUser) {
        this.viewUser = viewUser;
    } 

   
    public String mostraUsuario() {
        return ">>> Usuario <<<" + "\nLogin: " + login + "\nViewUser: " + viewUser + "\n\n";
    }
    
    

}
