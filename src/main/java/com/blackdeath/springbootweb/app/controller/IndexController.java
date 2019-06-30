/**
 * 
 */
package com.blackdeath.springbootweb.app.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.blackdeath.springbootweb.app.model.Usuario;

/**
 * @author Seth Luis
 *
 */
@Controller
@RequestMapping("/app")
public class IndexController {

	@Value("${texto.indexcontroller.index.titulo}")
	private String textoIndex;
	@Value("${texto.indexcontroller.perfil.titulo}")
	private String textoPerfil;
	@Value("${texto.indexcontroller.listar}")
	private String textoListar;

	@GetMapping({ "", "/", "/index", "/home" })
	public String index(Model model) {
		model.addAttribute("titulo", textoIndex);

		return "index";
	}

	@RequestMapping("/perfil")
	public String perfil(Model model) {
		Usuario usuario = new Usuario();
		usuario.setNombre("Seth");
		usuario.setApellido("Luis");
		usuario.setEmail("seth.luis@correo.com");

		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", textoPerfil.concat(usuario.getNombre()));

		return "perfil";
	}

	@RequestMapping("/listar")
	public String listar(Model model) {
		model.addAttribute("titulo", textoListar);

		return "listar";
	}

	@ModelAttribute("usuarios")
	public List<Usuario> poblarUsuarios() {
		List<Usuario> usuarios = Arrays.asList(new Usuario("Seth", "Luis", "seth.luis@correo.com"),
				new Usuario("Libni", "Herrera", "libni.herrera@correo.com"),
				new Usuario("María", "Martínez", "maria.martinez@correo.com"),
				new Usuario("José", "Luis", "jose.luis@correo.com"));

		return usuarios;

	}

}
