package br.com.mgoficina.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.mgoficina.model.Veiculo;
import br.com.mgoficina.service.IVeiculoService;

public class VeiculoServiceImpl implements IVeiculoService {

	private List<Veiculo> veiculos;

	public VeiculoServiceImpl() {
		this.veiculos = new ArrayList<Veiculo>();
	}

	public VeiculoServiceImpl(List<Veiculo> veiculos) {
		this.veiculos = new ArrayList<>(veiculos);
	}

	@Override
	public boolean create(Veiculo veiculo) {
		for (Veiculo veic : this.veiculos) {
			if (veic.equals(veiculo))
				return false;
		}

		this.veiculos.add(veiculo);

		return true;
	}

	@Override
	public Veiculo findVeiculoById(Long codVeiculo) {
		for (Veiculo veic : this.veiculos) {
			if (veic.getCodVeiculo().equals(codVeiculo))
				return veic;
		}

		return null;

	}

	@Override
	public Veiculo findVeiculoByPlaca(String Placa) {
		for (Veiculo veic : this.veiculos) {
			if (veic.getPlaca().equals(Placa))
				return veic;
		}

		return null;
	}

	@Override
	public List<Veiculo> findAll() {
		return Collections.unmodifiableList(this.veiculos);
	}

	@Override
	public boolean updateVeiculo(Veiculo veiculo) {
		if (this.veiculos.contains(veiculo)) {

			int indiceDoObjeto = this.veiculos.indexOf(veiculo);
			this.veiculos.remove(veiculo);
			this.veiculos.add(indiceDoObjeto, veiculo);
			return true;

		} else {

			return false;

		}
	}

	@Override
	public boolean deleteVeiculo(Long codVeiculo) {
		for(Veiculo veic: this.veiculos)
		{
			if(veic.getCodVeiculo().equals(codVeiculo))
				{
				veiculos.remove(veic);
				return true;
				}
		}	
		
		
		return false;
	}

}
