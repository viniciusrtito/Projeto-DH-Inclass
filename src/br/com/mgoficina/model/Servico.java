package br.com.mgoficina.model;

public class Servico {
	
	private String servicoNome;
	private String servicoDataI;
	private String servicoDataF;
	private float valor;
	private String pagamentoMet;
	private String nomeCliente;
	
	public Servico(String servicoNome, String servicoDataI, String servicoDataF, float valor, String pagamentoMet,
			String nomeCliente) {
		this.servicoNome = servicoNome;
		this.servicoDataI = servicoDataI;
		this.servicoDataF = servicoDataF;
		this.valor = valor;
		this.pagamentoMet = pagamentoMet;
		this.nomeCliente = nomeCliente;
	}

	public void setServicoNome(String servicoNome) {
		this.servicoNome = servicoNome;
	}
	
	public String getServicoNome() {
		return this.servicoNome;
	}

	public void setServicoDataI(String servicoDataI) {
		this.servicoDataI = servicoDataI;
	}
	public String getServicoDataI() {
		return this.servicoDataI;
	}

	public void setServicoDataF(String servicoDataF) {
		this.servicoDataF = servicoDataF;
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

	public void setPagamentoMet(String pagamentoMet) {
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
	
	//Serviços:
	public void pintura(String cor, String servicoDataI, String servicoDataF) {
		valor += 100;
		System.out.println("A nova cor do seu carro é: " + cor + "Totalizando: " + valor + "R$");
		System.out.println("Data iníco: " + servicoDataI + "; Data final: " + servicoDataF);
	}

	public void trocaOleo(String servicoDataI, String servicoDataF) {
		valor += 50;
		System.out.println("O Óleo do seu carro oi trocado por: " + valor + "R$");
		System.out.println("Data iníco: " + servicoDataI + "; Data final: " + servicoDataF);
	}

}
