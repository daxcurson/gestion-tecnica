package ar.com.strellis.gestiontecnica.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.strellis.gestiontecnica.model.EstadoOrden;

public interface EstadoOrdenDao extends JpaRepository<EstadoOrden,Integer>
{

}
