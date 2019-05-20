/**
 * 
 */
package com.blackdeath.springbootweb.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.blackdeath.springbootweb.app.model.Usuario;

/**
 * @author Seth Luis
 *
 */
@Controller
@RequestMapping("/app")
public class IndexController {

	@GetMapping({ "", "/", "/index", "/home" })
	public String index(Model model) {
		model.addAttribute("titulo", "Hola Spring Framework!");

		return "index";
	}

	@RequestMapping("/perfil")
	public String perfil(Model model) {
		Usuario usuario = new Usuario();
		usuario.setNombre("Seth");
		usuario.setApellido("Luis");
		usuario.setEmail("ing.seth.luis@gmail.com");

		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", "Perfil del usuario ".concat(usuario.getNombre()));

		return "perfil";
	}

	@RequestMapping("/listar")
	public String listar(Model model) {
		List<String> usuarios = new ArrayList<>();

		model.addAttribute("titulo", "Listado de usuarios");
		model.addAttribute("usuarios", usuarios);

		return "listar";
	}

}
