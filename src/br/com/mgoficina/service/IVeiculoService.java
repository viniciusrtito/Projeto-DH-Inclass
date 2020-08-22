package br.com.mgoficina.service;

import java.util.List;

import br.com.mgoficina.model.Veiculo;

public interface IVeiculoService {

	public Veiculo create(Veiculo veiculo);
	public Veiculo findVeiculoById(int codVeiculo);
	public Veiculo findVeiculoByPlaca(String Placa);
	public List<Veiculo> findAll();
	public boolean updateVeiculo(Veiculo veiculo);
	public boolean deleteVeiculo(int codVeiculo);
	
}
