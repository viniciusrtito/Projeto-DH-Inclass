package br.com.mgoficina.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.mgoficina.model.Funcionario;
import br.com.mgoficina.service.IFuncionarioService;

public class FuncionarioServiceImpl implements IFuncionarioService {
	
	
	private List<Funcionario> funcionarios;

	
	public FuncionarioServiceImpl()
	{
		this.funcionarios = new ArrayList<Funcionario>();
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
		
		return null;
	}

	@Override
	public Funcionario findClienteById(String id) {
		
		for(Funcionario func: this.funcionarios)
		{
			if(func.getId().equals(id)) return func;
		}
		
		return null;
	}

	@Override
	public Funcionario findClienteByNome(String nome) {
		
		for(Funcionario func: this.funcionarios)
		{
			if(func.getNome().equals(nome)) return func;
		}
		
		return null;
	}

	@Override
	public List<Funcionario> findAll() {
		return Collections.unmodifiableList(this.funcionarios);
	}

	@Override
	public boolean updateFuncionario(Funcionario funcionario) {
		
	if(this.funcionarios.contains(funcionario)) {
			
			int indiceDoObjeto = this.funcionarios.indexOf(funcionario);
			this.funcionarios.remove(funcionario);
			this.funcionarios.add(indiceDoObjeto, funcionario);
			return true;
			
		}else {		
			
			return false;
			
		}
		
	}

	@Override
	public boolean deleteFuncionario(String  id) {
		
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
