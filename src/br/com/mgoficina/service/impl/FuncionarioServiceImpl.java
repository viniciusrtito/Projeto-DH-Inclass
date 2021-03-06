package br.com.mgoficina.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import br.com.mgoficina.exception.ObjectNotFoundException;
import br.com.mgoficina.model.Funcionario;
import br.com.mgoficina.service.IFuncionarioService;

public class FuncionarioServiceImpl implements IFuncionarioService {
	
	
	private List<Funcionario> funcionarios;

	
	public FuncionarioServiceImpl()
	{
		this.funcionarios = new ArrayList<Funcionario>();
	}
	
	public List<Funcionario> findByCargo(String cargo)
	{
		  List<Funcionario> funcionariosMesmoCargo = funcionarios
				  .stream()
				  .filter(c -> c.getCargo().equals(cargo))
				  .collect(Collectors.toList());
		  
		  return funcionariosMesmoCargo;
	}
	
	
	
	public FuncionarioServiceImpl(List<Funcionario> funcionarios)
	{
		this.funcionarios = new ArrayList<>(funcionarios);
	}

	@Override
	public Funcionario create(Funcionario funcionario) {
		
		for(Funcionario func: this.funcionarios)
		{
			if(func.equals(funcionario)) return null;
		}
		
		this.funcionarios.add(funcionario);
		
		return funcionario;
	}

	@Override
	public Funcionario findById(UUID id) {
		
		for(Funcionario func: this.funcionarios)
		{
			if(func.getId().equals(id)) return func;
		}
		
		throw new ObjectNotFoundException();
	}

	@Override
	public Funcionario findByNome(String nome) {
		
		for(Funcionario func: this.funcionarios)
		{
			if(func.getNome().equals(nome)) return func;
		}
		
		throw new ObjectNotFoundException();
	}

	@Override
	public List<Funcionario> findAll() {
		return Collections.unmodifiableList(this.funcionarios);
	}

	@Override
	public boolean update(Funcionario funcionario) {
		
	if(this.funcionarios.contains(funcionario)) {
			
			int indiceDoObjeto = this.funcionarios.indexOf(funcionario);
			this.funcionarios.remove(funcionario);
			this.funcionarios.add(indiceDoObjeto, funcionario);
			return true;
			
		}else {		
			
			throw new ObjectNotFoundException();
			
		}
		
	}

	@Override
	public boolean delete(UUID  id) {
		
		for(Funcionario func: this.funcionarios)
		{
			if(func.getId().equals(id))
				{
				funcionarios.remove(func);
				return true;
				}
		}	
		
		
		return false;
	}
	
	
	
	

}
