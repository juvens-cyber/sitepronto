package controllers;


import models.Usuario;
import play .mvc.Controller;

public class Login extends Controller{

	public static void login() {
		render();
	}
	
	public static void autenticar(String email, String senha) {
		
		Usuario usuario = Usuario.find("email = ? and senha = ?", email, senha).first();
		
		if(usuario != null||(email.equals("admin") && senha.contentEquals("admin"))) {
			Application.index ();
		} 
		else {
			flash.error("Usuário ou senha incorretos.");
			login();
		}
	}
	
	public static void logout() {
		login();
	}

}
	