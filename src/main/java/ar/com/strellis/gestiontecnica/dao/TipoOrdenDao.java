package ar.com.strellis.gestiontecnica.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.strellis.gestiontecnica.model.TipoOrden;

public interface TipoOrdenDao extends JpaRepository<TipoOrden,Integer>
{

}
