package com.portfolio.mme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
//@ComponentScan({"com.portfolio.mme.Repository.IPersonaRepository, com.portfolio.mme.Controller.PersonaController, com.portfolio.mme.Entity.Persona, com.portfolio.mme.Interface.IPersonaService, com.portfolio.mme.Service.ImpPersonaService"})

public class MmeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MmeApplication.class, args);
	}
        

}
