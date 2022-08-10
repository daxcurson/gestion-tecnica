package ar.com.strellis.gestiontecnica.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class ClaseReparacion {
	@Id
	private int id;
	private String codigo;
	private String descripcion;
}
