package com.blackdeath.springbootweb.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/variables")
public class EjemploVariablesRutaController {

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("titulo", "Enviar parámetros de la ruta (@PathVariable)");
		return "variables/index";
	}

	/**
	 * Este método se puede probar ejecutando en la url:
	 * http://localhost:8080/variables/string/enviar_texto
	 * 
	 * @param texto
	 * @param model
	 * @return
	 */
	@GetMapping("/string/{texto}")
	public String variables(@PathVariable String texto, Model model) {
		model.addAttribute("titulo", "Recibir parámetros de la ruta (@PathVariable");
		model.addAttribute("resultado", "El texto enviado en la ruta es: " + texto);
		return "variables/ver";
	}

	/**
	 * Este método se puede probar ejecutando en la url:
	 * http://localhost:8080/variables/string/Saludos%20Seth/7
	 * 
	 * @param texto
	 * @param numero
	 * @param model
	 * @return
	 */
	@GetMapping("/string/{texto}/{numero}")
	public String variables(@PathVariable String texto, @PathVariable Integer numero, Model model) {
		model.addAttribute("titulo", "Recibir parámetros de la ruta (@PathVariable");
		model.addAttribute("resultado",
				"El texto enviado en la ruta es: " + texto + " y el nùmero enviado en el path es: " + numero);
		return "variables/ver";
	}

}
