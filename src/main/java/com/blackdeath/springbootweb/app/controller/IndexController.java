/**
 * 
 */
package com.blackdeath.springbootweb.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Seth Luis
 *
 */
@Controller
public class IndexController {

	@GetMapping({ "", "/", "/index", "/home" })
	public ModelAndView index(ModelAndView model) {
		model.addObject("titulo", "Hola Spring Framework!");
		model.setViewName("index");

		return model;
	}

}
