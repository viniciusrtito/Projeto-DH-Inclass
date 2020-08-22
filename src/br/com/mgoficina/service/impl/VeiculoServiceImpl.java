package br.com.mgoficina.service.impl;

import java.util.ArrayList;
import java.util.List;

import br.com.mgoficina.model.Veiculo;
import br.com.mgoficina.service.IVeiculoService;

public class VeiculoServiceImpl implements IVeiculoService{

	private List<Veiculo> veiculos;
	
	public VeiculoServiceImpl() {
		veiculos = new ArrayList<Veiculos>();
	}	
	
	public VeiculoServiceImpl(List<Veiculo> veiculos) {
		this.veiculos = new ArrayList<> (veiculos);
	}

	@Override
	public Veiculo create(Veiculo veiculo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Veiculo findVeiculoById(int codVeiculo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Veiculo findVeiculoByPlaca(String Placa) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Veiculo> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateVeiculo(Veiculo veiculo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteVeiculo(int codVeiculo) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
