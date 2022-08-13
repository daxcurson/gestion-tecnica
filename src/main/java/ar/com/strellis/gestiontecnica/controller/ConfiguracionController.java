package ar.com.strellis.gestiontecnica.controller;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ar.com.strellis.gestiontecnica.model.Cliente;
import ar.com.strellis.gestiontecnica.service.ClientesService;

@RestController
public class ConfiguracionController {
	@Autowired
	private ClientesService clientesService;
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public void agregarCliente(@RequestBody Cliente cliente)
	{
	}
	@RequestMapping(value="/edit/{id}",method=RequestMethod.PUT)
	public void editarCliente(@PathVariable("id") int clienteId)
	{
	}
	@RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
	public void borrarCliente(@PathVariable("id") int clienteId)
	{
	}
	@RequestMapping(value="/find/{id}",method=RequestMethod.GET)
	public ResponseEntity<Cliente> buscarCliente(@PathVariable("id") int clienteId)
	{
		try
		{
			return ResponseEntity.ok().body(clientesService.buscarCliente(clienteId));
		}
		catch(NoSuchElementException e)
		{
			return ResponseEntity.notFound().build();
		}
	}
}
