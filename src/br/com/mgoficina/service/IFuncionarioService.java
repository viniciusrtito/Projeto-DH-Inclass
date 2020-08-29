package br.com.mgoficina.service;

import java.util.List;

import br.com.mgoficina.model.Funcionario;

public interface IFuncionarioService extends IService<Funcionario> {
	
	public Funcionario findByNome(String nome);
	public List<Funcionario> findByCargo(String cargo);

	
}
