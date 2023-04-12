package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
		@GetMapping
		public String hello() {
			return "<h3 style=\"color:red;padding:30px;\">Hello Turma 62!</h3>"
					+ "<br/>"
					+ "Sou Amandica";
		}
		@GetMapping("/nome")
		public String meunome() {
			return "<h3>Amandica</h3>";
		}
}
