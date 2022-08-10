package ar.com.strellis.gestiontecnica.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.strellis.gestiontecnica.model.ContratoTipo;

public interface ContratoTipoDao extends JpaRepository<ContratoTipo,Integer>
{

}
