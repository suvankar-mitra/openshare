package mitra.suvankar.openshare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("mitra.suvankar.openshare.controllers")
@SpringBootApplication
public class  OpenShareApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenShareApplication.class, args);
	}

}
