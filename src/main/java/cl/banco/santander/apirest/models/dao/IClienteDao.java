package cl.banco.santander.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import cl.banco.santander.apirest.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long> {

}
