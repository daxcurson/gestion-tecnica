package ar.com.strellis.gestiontecnica.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Usuario {
	@Id
	private int id;
	private String nombre;
	private String nombreCompleto;
}
