package ar.com.strellis.gestiontecnica.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.strellis.gestiontecnica.model.Usuario;

public interface UsuarioDao extends JpaRepository<Usuario,Integer>
{
}
