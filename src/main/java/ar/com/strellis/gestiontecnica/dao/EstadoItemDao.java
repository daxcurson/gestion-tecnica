package ar.com.strellis.gestiontecnica.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.strellis.gestiontecnica.model.EstadoItem;

public interface EstadoItemDao extends JpaRepository<EstadoItem,Integer>
{

}
