package cl.banco.santander.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.banco.santander.apirest.models.entity.Cliente;
import cl.banco.santander.apirest.models.services.IClienteService;

@RestController
@RequestMapping("/api")
public class ClienteRestController {
	@Autowired IClienteService clienteService;
	
	@GetMapping("/clientes")
	public List<Cliente> index() {
		return clienteService.findAll();
	}
}
