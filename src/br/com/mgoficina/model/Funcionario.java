package br.com.mgoficina.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Funcionario {
	
	private String nome;
	private String cpf;
	private int idade;
	private char sexo;
	private String cargo;
	private List<Object> servicos = new ArrayList<>();
	private UUID id;
	
	public Funcionario(String nome, String cpf, int idade, char sexo, String cargo,UUID id) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.sexo = sexo;
		this.cargo = cargo;
		this.id = id; //criei um ID pseudoAleatorio usando a classe UUID
	}
	

	public List<Object> getServicos() {
		return servicos;
	}

	public void setServicos(List<Object> servicos) {
		this.servicos = servicos;
	}

	public void addServico(Servico servico)
	{
		servicos.add(servico);
	}
	
	public UUID getId()
	{
		return this.id;
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

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public boolean equals(Object obj)
	{
		if(obj instanceof Funcionario)
		{
			if(this.getId().equals(((Funcionario) obj).getId())) return true;
		}
		return false;
	}
	
}
