package it.daniele.EsercizioWebSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import it.daniele.EsercizioWebSpring_1.Configurazione;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Configurazione.class);
		
		Crea crea = context.getBean(Crea.class);
		
	/*	System.out.println(crea);*/
	}

}