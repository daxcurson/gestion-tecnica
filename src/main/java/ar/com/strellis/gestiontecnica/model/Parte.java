package ar.com.strellis.gestiontecnica.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Parte {
	@Id
	private int id;
}
