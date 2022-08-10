package ar.com.strellis.gestiontecnica.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Item {
	@Id
	private int id;
	@ManyToOne
	private Orden orden;
	@ManyToOne
	private ClaseReparacion claseReparacion;
	@ManyToOne
	private Ingeniero ingeniero;
}
