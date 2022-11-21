package Modelo;

public class Produto {

	private String Nomeproduto;
	private String Corproduto;
	private Integer quantidade;
	private Float precos;
	
	public Produto(String Nomeproduto,String Corproduto, Integer quantidade, Float precos) {
		this.Nomeproduto = Nomeproduto;
		this.Corproduto = Corproduto;
		this.quantidade = quantidade;
		this.precos = precos;
	}

	public String getNomeproduto() {
		return Nomeproduto;
	}

	public void setNomeproduto(String nomeproduto) {
		Nomeproduto = nomeproduto;
	}

	public String getCorproduto() {
		return Corproduto;
	}

	public void setCorproduto(String corproduto) {
		Corproduto = corproduto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Float getPrecos() {
		return precos;
	}

	public void setPrecos(Float precos) {
		this.precos = precos;
	}
	
}