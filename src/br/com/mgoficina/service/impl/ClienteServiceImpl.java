package br.com.mgoficina.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

import br.com.mgoficina.exception.ObjectNotFoundException;
import br.com.mgoficina.model.Cliente;
import br.com.mgoficina.service.IClienteService;

public class ClienteServiceImpl implements IClienteService{

	private List<Cliente> clientes;
	
	
	
	public ClienteServiceImpl() {
		clientes = new ArrayList<Cliente>();
	}
	public ClienteServiceImpl(List<Cliente> clientes) {
		this.clientes = new ArrayList<>(clientes);
	} 
	
		
	
	@Override
	public Cliente create(Cliente cliente) {
		this.clientes.add(cliente);
		return cliente;
	}

	@Override
	public Cliente findById(UUID id) {
		for (Cliente cliente: this.clientes) {
			if (cliente.getId().equals(id)) {
				return cliente;
			}
		}
		throw new ObjectNotFoundException();
	}

	@Override
	public Cliente findClienteByNome(String nome) {
		
		for(Cliente cliente: this.clientes) {
			if(cliente.getNome().equals(nome)) {
				return cliente;
			}
		}
		
		throw new ObjectNotFoundException();
	}

	@Override
	public List<Cliente> findAll() {
		return Collections.unmodifiableList(this.clientes);
	}

	@Override
	public boolean update(Cliente cliente) {
		
		if(this.clientes.contains(cliente)) {
			
			int indiceDoObjeto = this.clientes.indexOf(cliente);
			this.clientes.remove(cliente);
			this.clientes.add(indiceDoObjeto, cliente);
			return true;
			
		}else {		
			
			throw new ObjectNotFoundException();
			
		}
		
	}

	@Override
	public boolean delete(UUID id) {
		Cliente cliente = findById(id);
		if (cliente != null) {
			this.clientes.remove(cliente);
			return true;
		}
		throw new ObjectNotFoundException();
	}

	
	
}
