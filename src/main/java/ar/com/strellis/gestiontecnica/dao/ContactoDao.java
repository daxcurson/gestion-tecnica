package ar.com.strellis.gestiontecnica.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.strellis.gestiontecnica.model.Contacto;

public interface ContactoDao extends JpaRepository<Contacto,Integer>
{

}
