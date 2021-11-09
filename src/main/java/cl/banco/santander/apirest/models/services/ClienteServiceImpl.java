package cl.banco.santander.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.banco.santander.apirest.models.dao.IClienteDao;
import cl.banco.santander.apirest.models.entity.Cliente;

@Service
public class ClienteServiceImpl implements IClienteService{
	@Autowired // nos permite inyectar
	private IClienteDao clienteDao;
	
	@Override
	public List<Cliente> findAll() {
		return (List<Cliente>)clienteDao.findAll();
	}

}
