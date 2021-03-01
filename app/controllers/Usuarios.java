package controllers;

import java.util.List;

import javax.validation.Valid;

import models.Usuario;
import play.mvc.Controller;

public class Usuarios extends Controller {
	

	public static void form() {
		render();
	}
	public static void salvar(@Valid  Usuario usu) {

		if (validation.hasErrors()){
			System.out.println("Há campos incorretos no formulario");
			form();
		}
		
		 usu.save();
		 listar();
	}
	public static void listar() {
		List<Usuario> lista = Usuario.findAll();
		
		render(lista);
		}
	public static void editar(long id) {
		Usuario usu	= Usuario.findById(id);
	
	renderTemplate("Usuarios/form.html",usu);
	}
	public static void deletar(long id) {
		Usuario usu	= Usuario.findById(id);
	
		usu.delete();
		
		listar();
	}
}
