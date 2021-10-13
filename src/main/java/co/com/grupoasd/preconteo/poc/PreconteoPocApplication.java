package co.com.grupoasd.preconteo.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class PreconteoPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(PreconteoPocApplication.class, args);
	}

}
