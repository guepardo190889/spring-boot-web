/**
 * 
 */
package com.blackdeath.springbootweb.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Seth Luis
 *
 */
@Controller
public class IndexController {

	@GetMapping(value = "/index")
	public String index() {
		return "index";
	}

}
