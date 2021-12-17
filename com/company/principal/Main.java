package com.company.principal;

import java.util.ArrayList;
import java.util.List;

import com.company.loja.Cliente;
import com.company.loja.Produto;

public class Main {

	public static void main(String[] args) {

		Produto produto = new Produto("LBU15", "PLACA POTENCIA", "9456233442", "455F212BA");

    Cliente cliente = new Cliente("Joao Gabriel", "0758549699", "899555-555");
		List<Cliente> clientes1 = new ArrayList<Cliente>();
		clientes1.add(cliente);

      System.out.println("****************AGENDA SEMANAL*****************");
			System.out.println("Nome: " + cliente.getNomeCliente());
			System.out.println("CPF: " + cliente.getCpf());
			System.out.println("Telefone: " + cliente.getTelefone());
			System.out.println("Produtos:");
      System.out.println("--------------------------------");
			System.out.println("Modelo: " + produto.getModelo());
			System.out.println("Nome: " + produto.getNomeProduto());
			System.out.println("PNC: " + produto.getPnc());
			System.out.println("Numero de Serie: " + produto.getNumSerie());
			System.out.println("--------------------------------");
      System.out.println("***********************************************");
	
	}

}