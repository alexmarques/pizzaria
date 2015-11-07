package br.com.pizzaria.entidades;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	private String nome;
	private Endereco endereco;
	private List<Pedido> pedidos;
	
	public Cliente() {
		this.pedidos = new ArrayList<Pedido>();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public List<Pedido> getPedidos() {
		return pedidos;
	}
	public void adicionarPedido(Pedido pedido) {
		this.getPedidos().add(pedido);
	}
}