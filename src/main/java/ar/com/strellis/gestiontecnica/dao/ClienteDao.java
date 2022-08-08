package ar.com.strellis.gestiontecnica.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.strellis.gestiontecnica.model.Cliente;

public interface ClienteDao extends JpaRepository<Cliente,Integer>
{
}