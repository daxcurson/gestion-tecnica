package ar.com.strellis.gestiontecnica.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.strellis.gestiontecnica.model.Sistema;

public interface SistemaDao extends JpaRepository<Sistema,Integer>
{

}
