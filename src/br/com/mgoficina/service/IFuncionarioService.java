package br.com.mgoficina.service;



import br.com.mgoficina.model.Funcionario;

public interface IFuncionarioService extends IService<Funcionario> {
	
	public Funcionario findByNome(String nome);

	
}
