package br.com.pizzaria.entidades;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import br.com.pizzaria.enums.TipoItemEnum;

@Entity
public class Item {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private Double preco;
	private TipoItemEnum tipoItem;
	private int quantidade;
	@ManyToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	private Pedido pedido;
	
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

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	@Override
	public String toString() {
		return "ID: " + this.getId() + ". Nome: " + this.getNome() + ". Preço: " + this.getPreco() + ".TipoItem: " + this.getTipoItem();
	}
}