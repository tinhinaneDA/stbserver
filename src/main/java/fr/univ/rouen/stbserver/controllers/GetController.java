package fr.univ.rouen.stbserver.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class GetController {
	@GetMapping("/resume")
	public String getListSTBinXML() {
	return "Envoi de la liste des STB";
	}
	@GetMapping("/id")
	public String getSTBinXML() {
	return "Détail de la STB demandée";
	}
}
