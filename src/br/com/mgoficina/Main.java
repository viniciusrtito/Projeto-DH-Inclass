package br.com.mgoficina;

import br.com.mgoficina.model.Veiculo;
import br.com.mgoficina.service.impl.VeiculoServiceImpl;

public class Main {
	
	public static void main(String[] args) {
		
		//Criar lista de Veiculos vazia
		VeiculoServiceImpl veiculos = new VeiculoServiceImpl();
		
		//Criar veículos
		Veiculo veic1 = new Veiculo((long) 1, "BOM2531", "FUSCA", 1970, "LARANJA", "9BWZZZ377VT004251" , "FASTBACK");
		Veiculo veic2 = new Veiculo((long) 2, "DEF200", "TIPO", 1995, "PRETO", "1JWZZZ377RR004255" , "HATCH");
		Veiculo veic3 = new Veiculo((long) 3, "JEF1314", "PALIO WEEKEND", 2006, "CINZA", "85WZZZ377UY004282" , "PERUA");
		Veiculo veic4 = new Veiculo((long) 4, "ENF9356", "CITY", 2010, "CINZA", "1BWZZZ377VT004252" , "SEDAN");
		Veiculo veic5 = new Veiculo((long) 5, "DOC9977", "CIVIC", 2010, "CINZA", "9BGGZZ377KE004233" , "SEDAN");
		
		
		//Adicionar veículos á lista e exibir a lista
		veiculos.create(veic1);
//		System.out.println(veiculos.findAll().toString());
		veiculos.create(veic2);
//		System.out.println(veiculos.findAll().toString());
		veiculos.create(veic3);
//		System.out.println(veiculos.findAll().toString());
		veiculos.create(veic4);
//		System.out.println(veiculos.findAll().toString());
		veiculos.create(veic5);
//		System.out.println(veiculos.findAll().toString());
//		System.out.println("------------------------------------------------------------------------");
		
		//Buscar veículo por placa
		System.out.println(veiculos.findVeiculoByPlaca("BOM2531"));
		System.out.println(veiculos.findVeiculoByPlaca("JEF1314"));
		System.out.println(veiculos.findVeiculoByPlaca("DOC9977"));
		System.out.println("------------------------------------------------------------------------");
		
		//Busca Veículo por id
		System.out.println(veiculos.findVeiculoById((long)2));
		System.out.println(veiculos.findVeiculoById((long)4));
		System.out.println("------------------------------------------------------------------------");
		
		//Deletar Veículo
		System.out.println(veiculos.findVeiculoById((long)4));
		veiculos.deleteVeiculo((long)4);
//		System.out.println(veiculos.findVeiculoById((long)4));
		
		
	}
}
