package br.com.mgoficina.model;

import java.util.UUID;

import br.com.mgoficina.service.impl.VeiculoServiceImpl;

public class Veiculo extends VeiculoServiceImpl{

	private Long codVeiculo;
	private String placa;
	private String modelo;
	private int ano;
	private String cor;
	private String chassis;
	private String tipo;
	private UUID id;
	
	public Veiculo(Long codVeiculo, String placa, String modelo, int ano, String cor, String chassis, String tipo,UUID id) {
		super();
		this.codVeiculo = codVeiculo;
		this.placa = placa;
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
		this.chassis = chassis;
		this.tipo = tipo;
		this.id = id;
	}

	public Long getCodVeiculo() {
		return codVeiculo;
	}

	public void setCodVeiculo(Long codVeiculo) {
		this.codVeiculo = codVeiculo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getChassis() {
		return chassis;
	}

	public void setChassis(String chassis) {
		this.chassis = chassis;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Veiculo other = (Veiculo) obj;
		if (codVeiculo == null) {
			if (other.codVeiculo != null)
				return false;
		} else if (!codVeiculo.equals(other.codVeiculo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Veiculo [codVeiculo=" + codVeiculo + ", placa=" + placa + ", modelo=" + modelo + ", ano=" + ano
				+ ", cor=" + cor + ", chassis=" + chassis + ", tipo=" + tipo + "]";
	}

		
	
}
