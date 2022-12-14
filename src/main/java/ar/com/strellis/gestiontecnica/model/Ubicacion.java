package ar.com.strellis.gestiontecnica.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Ubicacion {
	@Id
	private int id;
	@ManyToOne
	private Deposito deposito;
}
