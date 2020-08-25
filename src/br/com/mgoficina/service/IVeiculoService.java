package br.com.mgoficina.service;

import java.util.List;

import br.com.mgoficina.exception.DataIntegrityException;
import br.com.mgoficina.exception.ObjectNotFoundException;
import br.com.mgoficina.model.Veiculo;

public interface IVeiculoService {

	public boolean create(Veiculo veiculo);
	public Veiculo findVeiculoById(Long codVeiculo) throws ObjectNotFoundException, DataIntegrityException;
	public Veiculo findVeiculoByPlaca(String Placa) throws ObjectNotFoundException;
	public List<Veiculo> findAll();
	public boolean updateVeiculo(Veiculo veiculo);
	public boolean deleteVeiculo(Long codVeiculo);
	
}
