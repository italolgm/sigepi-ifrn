package form;

import java.security.NoSuchAlgorithmException;

import models.Avaliador;

public class LoginForm {

	public String login;
	public String senha;
	
	public String validate() throws NoSuchAlgorithmException {
        if (Avaliador.autenticar(login, senha) == null) {
        	return "Login ou Senha Inválida(s). Tente novamente!";
        }
        
        return null;
    }
}
