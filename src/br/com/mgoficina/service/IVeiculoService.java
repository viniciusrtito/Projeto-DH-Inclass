package br.com.mgoficina.service;

import java.util.List;

import br.com.mgoficina.exception.DataIntegrityException;
import br.com.mgoficina.exception.ObjectNotFoundException;
import br.com.mgoficina.model.Veiculo;

public interface IVeiculoService extends IService<Veiculo> {

	public Veiculo findVeiculoByPlaca(String Placa) throws ObjectNotFoundException;
	
}
