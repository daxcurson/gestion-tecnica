package ar.com.strellis.gestiontecnica.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.strellis.gestiontecnica.model.Ingeniero;

public interface IngenieroDao extends JpaRepository<Ingeniero,Integer>
{

}
