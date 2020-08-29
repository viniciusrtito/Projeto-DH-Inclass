package br.com.mgoficina.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Cliente {
	
	private String nome;
	private String cpf;
	private int idade;
	private char sexo;
	private UUID id;
	private List<Veiculo> veiculos = new ArrayList <>();
	
	public Cliente(String nome, String cpf, int idade, char sexo, UUID id, List<Veiculo> veiculos ) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.sexo = sexo;
		this.id = id;
		this.setVeiculos(veiculos);
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public UUID getId() {
		return id;
	}


	public List<Veiculo> getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(List<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
}
