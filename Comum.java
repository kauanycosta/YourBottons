/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelDominio;

import java.io.Serializable;

/**
 *
 * @author Stefany
 */
public class Comum extends Usuario implements Serializable{
    private static final long serialVersionUID = 123456789L;

    public Comum(int codUsuario, String nomeusuario, String login, String senha, String cpf, String email, int tipo) {
        super(codUsuario, nomeusuario, login, senha, cpf, email, tipo);
    }

    public Comum(int codUsuario, String nomeusuario, String login, String senha, String email, int tipo) {
        super(codUsuario, nomeusuario, login, senha, email, tipo);
    }

    public Comum(String nomeusuario, String login, String senha, String email, String cpf, int tipo) {
        super(nomeusuario, login, senha, email, cpf, tipo);
    }


    public Comum(int codUsuario) {
        super(codUsuario);
    }

    public Comum(String nomeusuario, String login, String senha, String email, String cpf) {
        super(nomeusuario, login, senha, email, cpf);
    }

    public Comum(int codUsuario, String nomeusuario, String login, String senha, String email, String cpf) {
        super(codUsuario, nomeusuario, login, senha, email, cpf);
    }

    @Override
    public String toString() {
        return super.toString() +"Comum{" + '}';
    }

}
