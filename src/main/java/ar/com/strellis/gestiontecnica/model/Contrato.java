package ar.com.strellis.gestiontecnica.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Contrato {
	@Id
	private int id;
	@OneToMany
	private List<Equipo> equipos;
	private Date fechaComienzo;
	private Date fechaFin;
}
