package ar.com.strellis.gestiontecnica.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.strellis.gestiontecnica.model.Orden;

public interface OrdenDao extends JpaRepository<Orden,Integer>
{

}
