/**
 * 
 */
package com.blackdeath.springbootweb.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Seth Luis
 *
 */
@Controller
public class IndexController {

	@RequestMapping(value="/index")
	public String index() {
		return "index";
	}

}
