package ar.com.strellis.gestiontecnica.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Ingeniero {
	@Id
	private int id;
}
