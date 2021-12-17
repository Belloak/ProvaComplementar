package com.company.loja;

public class Produto {
	private String modelo;
  private String nomeProduto;
	private String pnc;
	private String numSerie;

	protected Produto(String modelo, String nomeProduto, String pnc, String numSerie) {
		super();
		this.modelo = modelo;
		this.nomeProduto = nomeProduto;
		this.pnc = pnc;
    this.numSerie = numSerie;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getPnc() {
		return pnc;
	}

	public void setPnc(String pnc) {
		this.pnc = pnc;
	}

  public String getNumSerie(){
    return numSerie;
  }

  public void setNumSerie(String numSerie){
    this.numSerie = numSerie;
  }

}