package br.com.mgoficina;

import java.util.UUID;

import br.com.mgoficina.model.Veiculo;
import br.com.mgoficina.service.impl.VeiculoServiceImpl;

public class Main {
	
	public static void main(String[] args) {
		
		//Criar lista de Veiculos vazia
		VeiculoServiceImpl veiculos = new VeiculoServiceImpl();
		
		UUID idVeic1 = UUID.randomUUID();
		UUID idVeic2 = UUID.randomUUID();
		UUID idVeic3 = UUID.randomUUID();
		UUID idVeic4 = UUID.randomUUID();
		UUID idVeic5 = UUID.randomUUID();
			
		//Criar veículos
		Veiculo veic1 = new Veiculo((long) 1, "BOM2531", "FUSCA", 1970, "LARANJA", "9BWZZZ377VT004251" , "FASTBACK",idVeic1);
		Veiculo veic2 = new Veiculo((long) 2, "DEF200", "TIPO", 1995, "PRETO", "1JWZZZ377RR004255" , "HATCH",idVeic2);
		Veiculo veic3 = new Veiculo((long) 3, "JEF1314", "PALIO WEEKEND", 2006, "CINZA", "85WZZZ377UY004282" , "PERUA",idVeic3);
		Veiculo veic4 = new Veiculo((long) 4, "ENF9356", "CITY", 2010, "CINZA", "1BWZZZ377VT004252" , "SEDAN",idVeic4);
		Veiculo veic5 = new Veiculo((long) 5, "DOC9977", "CIVIC", 2010, "CINZA", "9BGGZZ377KE004233" , "SEDAN",idVeic5);
		
		
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
		System.out.println(veiculos.findById(idVeic4));
		System.out.println(veiculos.findById(idVeic2));
		System.out.println("------------------------------------------------------------------------");
		
		//Deletar Veículo
		System.out.println(veiculos.findById(idVeic4));
		veiculos.delete(idVeic4);
//		System.out.println(veiculos.findVeiculoById((long)4));
		
		
	}
}
