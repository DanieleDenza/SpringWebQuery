
package it.daniele.EsercizioWebSpring;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.ToString;

@Component
@Data
@ToString
public class Crea {

	Connessione connessione = new Connessione();
}