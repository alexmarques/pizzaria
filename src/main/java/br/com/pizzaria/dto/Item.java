package br.com.pizzaria.dto;

import br.com.pizzaria.enums.TipoItemEnum;

public class Item {
	
	private long id;
	private String nome;
	private Double preco;
	private TipoItemEnum tipoItem;
	private int quantidade = 0;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public TipoItemEnum getTipoItem() {
		return tipoItem;
	}
	public void setTipoItem(TipoItemEnum tipoItem) {
		this.tipoItem = tipoItem;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}