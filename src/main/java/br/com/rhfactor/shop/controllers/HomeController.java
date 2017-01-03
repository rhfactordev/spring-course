package br.com.rhfactor.shop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String index(){
		System.out.println("Acessando o controller");
		return "home";
	}

}
