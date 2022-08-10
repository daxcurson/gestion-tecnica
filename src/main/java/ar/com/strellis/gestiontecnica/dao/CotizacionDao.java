package ar.com.strellis.gestiontecnica.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.strellis.gestiontecnica.model.Cotizacion;

public interface CotizacionDao extends JpaRepository<Cotizacion,Integer>
{

}
