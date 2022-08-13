package ar.com.strellis.gestiontecnica.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.strellis.gestiontecnica.dao.ClienteDao;
import ar.com.strellis.gestiontecnica.model.Cliente;
import ar.com.strellis.gestiontecnica.service.ClientesService;

@Service
public class ClientesServiceImpl implements ClientesService
{
	@Autowired
	private ClienteDao clienteDao;
	@Override
	public void agregarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrarCliente(int clienteId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cliente buscarCliente(int clienteId) {
		return clienteDao.findById(clienteId)
				.get();
	}

}
