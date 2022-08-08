package ar.com.strellis.gestiontecnica.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.strellis.gestiontecnica.model.Equipo;

public interface EquipoDao extends JpaRepository<Equipo,Integer>
{
}