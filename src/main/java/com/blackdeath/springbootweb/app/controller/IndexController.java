/**
 * 
 */
package com.blackdeath.springbootweb.app.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Seth Luis
 *
 */
@Controller
public class IndexController {

	@GetMapping({ "", "/", "/index", "/home" })
	public String index(Map<String, String> model) {
		model.put("titulo", "Hola Spring Framework!");
		return "index";
	}

}
