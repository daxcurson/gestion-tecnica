package ar.com.strellis.gestiontecnica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import ar.com.strellis.gestiontecnica.service.ClientesService;

@Controller
public class ClientesController {
	@Autowired
	private ClientesService clientesService;
}
