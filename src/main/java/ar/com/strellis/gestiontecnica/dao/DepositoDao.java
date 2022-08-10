package ar.com.strellis.gestiontecnica.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.strellis.gestiontecnica.model.Deposito;

public interface DepositoDao extends JpaRepository<Deposito,Integer>
{

}
