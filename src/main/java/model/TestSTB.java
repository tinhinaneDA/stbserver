package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;



public class TestSTB {
	
	public String loadFileXML() throws IOException {
		
		StringBuilder message = new StringBuilder();
		 Resource resource;
		resource = new DefaultResourceLoader(). 
		getResource("classpath:/smallSTB.xml");
		System.out.println("je suis la");
		InputStream is = resource.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		String string= br.readLine();
		while (string!=null){
	       message.append(string);
	        string=br.readLine();
	    }
		System.out.println(message);
		return message.toString();
		
	}
	
}
