package ar.com.strellis.gestiontecnica.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.strellis.gestiontecnica.model.Contrato;

public interface ContratoDao extends JpaRepository<Contrato,Integer>
{
}
