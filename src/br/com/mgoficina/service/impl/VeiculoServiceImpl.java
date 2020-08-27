package br.com.mgoficina.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

import br.com.mgoficina.exception.DataIntegrityException;
import br.com.mgoficina.exception.ObjectNotFoundException;
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
	public Veiculo create(Veiculo veiculo) {
		for (Veiculo veic : this.veiculos) {
			if (veic.equals(veiculo))
				return null;
		}

		this.veiculos.add(veiculo);

		return veiculo;
	}

	@Override
	public Veiculo findById(UUID id) throws ObjectNotFoundException{
		for (Veiculo veic : this.veiculos) {
			if (veic.getCodVeiculo().equals(id))
				return veic;
		}

		throw new ObjectNotFoundException();

	}

	@Override
	public Veiculo findVeiculoByPlaca(String Placa)  throws ObjectNotFoundException , DataIntegrityException {
		
		if((Placa.length() > 7) || (!Placa.toUpperCase().substring(0, 3).matches("[A-Z]*")) || (!Placa.substring(3).matches("[0-9]*"))) {
			throw new DataIntegrityException("Placa");
		}
		
		
		for (Veiculo veic : this.veiculos) {
			if (veic.getPlaca().equals(Placa))
				return veic;
		}

		throw new ObjectNotFoundException();
	}

	@Override
	public List<Veiculo> findAll() {
		return Collections.unmodifiableList(this.veiculos);
	}

	@Override
	public boolean update(Veiculo veiculo) {
		
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
	public boolean delete(UUID id) {
		for(Veiculo veic: this.veiculos)
		{
			if(veic.getCodVeiculo().equals(id))
				{
				veiculos.remove(veic);
				return true;
				}
		}	
		
		
		return false;
	}

}
