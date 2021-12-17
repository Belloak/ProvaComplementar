package com.company.loja;


public class Cliente extends Produto{
	private String nomeCliente;
	private String cpf;
	private String telefone;

	public Cliente(String nomeCliente, String cpf, String telefone, String modelo, String nomeProduto, String pnc, String numSerie) {
		super(modelo, nomeProduto, pnc, numSerie);
		this.nomeCliente = nomeCliente;
		this.cpf = cpf;
		this.telefone = telefone;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


}