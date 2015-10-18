package com.magilex.directoriobot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoController {

	@RequestMapping("/")
	public String handleRequest( ) {
		return "hola mundo";
	}
}
