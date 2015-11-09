package br.com.pizzaria.entidades;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Entity
@Component
@Scope("session")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nome;
	@OneToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL, orphanRemoval=true)
	private Endereco endereco;
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	private List<Pedido> pedidos;
	
	public Cliente() {
		this.pedidos = new ArrayList<Pedido>();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	
	public void adicionarPedido(Pedido pedido) {
		this.pedidos.add(pedido);
	}
}