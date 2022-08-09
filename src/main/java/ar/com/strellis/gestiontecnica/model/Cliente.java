package ar.com.strellis.gestiontecnica.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Cliente {
	@Id
	private int id;
	private String nombre;
	private String razonSocial;
	private String direccion;
}
