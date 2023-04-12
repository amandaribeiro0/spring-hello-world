package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
		@GetMapping
		public String hello() {
			return "<h1 style=\"color:purple;text-align:center;\">Hello World!</h1>";
		}
		@GetMapping("/bsm")
		public String bsm() {
			return "<b style=\"color:purple;font-size:35px;\">BSM’s</b>"
					+ "<br/>"
					+ "Mentalidade de crescimento"
					+ "<br/>"
					+ "Persistência"
					+ "<br/>"
					+ "Responsabilidade pessoal"
					+ "<br/>"
					+ "Orientação ao futuro"
					+ "<br/>"
					+ "Comunicação"
					+ "<br/>"
					+ "Orientação ao detalhe"
					+ "<br/>"
					+ "Proatividade"
					+ "<br/>"
					+ "Trabalho em equipe";
		}
		@GetMapping ("/objetivo")
		public String objetivo() {
			return "<b style=\"color:purple;font-size:35px;\">Objetivos de aprendizagem desta semana.</b>"
					+ "<br/>"
					+ "Meu objetivo de aprendizagem essa semana é aprender os conceitos basicos de Spring e me aprofundar mais no assunto para desenvolver meu blog pessoal";
		}
}
