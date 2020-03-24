package war;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StbserverApplication {

	public static void main(String[] args) {
		System.getProperties().put("server.port", 8100);
		SpringApplication.run(StbserverApplication.class, args);
	}

}
