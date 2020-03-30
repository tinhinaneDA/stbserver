package fr.univ.rouen.stbserver.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import model.STB;
@RestController
public class GetController {
	@GetMapping("/resume")
	public String getListSTBinXML() {
	return "Envoi de la liste des STB";
	}
	@GetMapping("/id")
	public String getSTBinXML(
	@RequestParam(value = "name") String texte) {
	return ("Détail de la STB demandée : " + texte);
	}
	
	@GetMapping("/test")
	public String getTesteVersion2(
	@RequestParam(value = "nb") String id, 
	@RequestParam(value = "texte") String titre){
	return ("Test : " + "\n"+ "id =" + id + "\n"+ "titre =" + titre);
	}
	@RequestMapping(value = "/xml")
	public @ResponseBody STB getXML() {
	STB stb = new STB("Test STB", 1, "2020/03/23", "Test JAXB");
	return stb;
	}
}
