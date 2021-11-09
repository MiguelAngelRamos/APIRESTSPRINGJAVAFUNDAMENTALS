package cl.banco.santander.apirest.models.services;

import java.util.List;

import cl.banco.santander.apirest.models.entity.Cliente;

public interface IClienteService {
	
	public List<Cliente> findAll();
}
