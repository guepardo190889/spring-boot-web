/**
 * 
 */
package com.blackdeath.springbootweb.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Seth Luis
 *
 */
@Controller
@RequestMapping("/params")
public class EjemploParamsController {

	@GetMapping("/")
	public String index() {
		return "params/index";
	}

	@GetMapping("/string")
	public String param(@RequestParam(required = false, defaultValue = "no se encontró el parámetro") String texto,
			Model model) {
		model.addAttribute("resultado", "El parámetro enviado es: " + texto);
		model.addAttribute("titulo", "Recibir parámetros del request HTTP GET por URL");
		return "params/ver";
	}

	@GetMapping("/mix-params")
	public String param(@RequestParam String saludo, Integer numero, Model model) {
		model.addAttribute("resultado", "El saludo enviado es: '" + saludo + "' y el número es '" + numero + "'");
		model.addAttribute("titulo", "Recibir parámetros del request HTTP GET por URL");
		return "params/ver";
	}
}
