package br.com.mgoficina.service;

import java.util.List;

import br.com.mgoficina.model.Cliente;

public interface IClienteService {

	public Cliente create(Cliente cliente);
	public Cliente findClienteById(int indice);
	public Cliente findClienteByNome(String nome);
	public List<Cliente> findAll();
	public boolean updateCliente(Cliente cliente);
	public boolean deleteCliente(int indice);
	
	//Atributos:
	private String servicoNome;
	private String servicoDataI;
	private String servicoDataF;
	private float valor;
	private String pagamentoMet;
	private String nomeCliente;

	//Serviços:
	public void pintura(String cor; String servicoDataI; String servicoDataF) {
		valor += 100;
		System.out.println("A nova cor do seu carro é: " + cor + "Totalizando: " + valor + "R$");
		System.out.println("Data iníco: " + servicoDataI + "; Data final: " + servicoDataF);
	}

	public void trocaOleo(Strind servicoDataI, String servicoDataF) {
		valor += 50;
		System.out.println("O óleo do seu carro oi trocado por: " + valor + "R$");
		System.out.println("Data iníco: " + servicoDataI + "; Data final: " + servicoDataF);
	}

	public void IClienteService() {

	}

	public void setServicoNome(String servicoNome) {s
		this.sevicoNome = servicoNome;
	}
	public String getServicoNome() {
		return this.servicoNome;
	}

	public void setServicoDataI(String servicoDataI) {
		this.sevicoDataI = servicoDataI;
	}
	public String getServicoDataI() {
		return this.servicoDataI;
	}

	public void setServicoDataF(String servicoDataF) {
		this.sevicoDataF = servicoDataF;
	}
	public String getServicoDataF() {
		return this.servicoDataF;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	public float getValor() {
		return this.valor;
	}

	public void setPagamentoMet(String oagamentoMet) {
		this.pagamentoMet = pagamentoMet;
	}
	public String getPagamentoMet() {
		return this.pagamentoMet;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getNomeCliente() {
		return this.nomeCliente;
	}
}