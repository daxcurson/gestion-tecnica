package ar.com.strellis.gestiontecnica.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.strellis.gestiontecnica.model.Ubicacion;

public interface UbicacionDao extends JpaRepository<Ubicacion,Integer>
{

}
