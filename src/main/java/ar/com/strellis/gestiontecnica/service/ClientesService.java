package ar.com.strellis.gestiontecnica.service;

import ar.com.strellis.gestiontecnica.model.Cliente;

public interface ClientesService {
	public void agregarCliente(Cliente cliente);
	public void editarCliente(Cliente cliente);
	public void borrarCliente(int clienteId);
	public Cliente buscarCliente(int clienteId);
}
