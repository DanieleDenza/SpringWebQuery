package it.daniele.EsercizioWebSpring_1;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import it.daniele.EsercizioWebSpring.Connessione;
import it.daniele.EsercizioWebSpring.Crea;

@Configuration
@ComponentScan(basePackageClasses = Crea.class)

public class Configurazione {

	@Bean
	public  Connessione getConnessione() throws ClassNotFoundException, SQLException  {
		return new Connessione("com.mysql.jdbc.Driver","jdbc:mysql://localhost/persona_connessione","Daniele","Denza", "SELECT user,password FROM persona","INSERT INTO persona (user,password) VALUES ('daniele','ciao123')");
	}
}