package com.halloworld.hallo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/habilidade")
public class HelloController {

	@GetMapping
	public String getHabilidades () {
		return "Habilidades e mentalidades que utilizei durante a atividade: Proatividade e orientação ao futuro! ";
	}
	
	@GetMapping("/habilidade2")
	public String getHabalidades2 () {
		return "Mentalidades e habilidades de aprendizagem para essa semana são: resposabilidade Pessoal"
				+ " persistência, comunicação, Trabalho em equipe, Atenção aos detalhes";
	}

}
