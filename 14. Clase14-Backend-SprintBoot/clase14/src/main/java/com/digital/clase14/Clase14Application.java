package com.digital.clase14;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Clase14Application {

	public static void main(String[] args) {
		SpringApplication.run(Clase14Application.class, args);
	}
@GetMapping
	public String helloWorld(){
		return "Hello world";
}

/*
GET = TRAE UN RECURSO -- es idempotente
POST = CREA UN RECURSO --- no es idempotente
PUT = MODIFICA UN RECURSO
DELETE = ELIMINA UN RECURSO -- no es idempotente
*/

}
