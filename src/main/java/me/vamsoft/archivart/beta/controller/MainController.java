/**
 * 
 * Author: Sergio García Alonso
 * Date: 5 de oct. de 2015 - 17:49:07
 * Email: sga.vmp@gmail.com
 *
 */
package me.vamsoft.archivart.beta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/")
	public String main(){
		return "index";
	}
	
}
