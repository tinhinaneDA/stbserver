package fr.univ.rouen.stbserver.controllers;




import java.io.IOException;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import model.TestSTB;

@RestController
public class PostController {
	@RequestMapping(value = "/testpost", method = RequestMethod.POST,
			consumes = "application/xml")
			public String postTest(@RequestBody String stb) {
			return ("<result><response>Message reçu : </response>" 
			+ stb + "</response>");
			}
	@PostMapping(value = "/poststb", produces = org.springframework.http.MediaType.APPLICATION_XML_VALUE)
	@ResponseBody
	public String postSTB() throws IOException {
	TestSTB stb = new TestSTB();
	
	return stb.loadFileXML();
	}
			
}
