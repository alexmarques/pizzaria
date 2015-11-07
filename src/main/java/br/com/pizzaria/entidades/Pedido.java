package br.com.pizzaria.entidades;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.pizzaria.enums.FormaDePagamento;

@Entity
public class Pedido {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private FormaDePagamento formaDePagamento;
	private List<Pizza> pizzas;
	private List<Bebida> bebidas;
	private List<Sobremesa> sobremesas;
	
	public Pedido() {
		this.pizzas = new ArrayList<Pizza>();
		this.bebidas = new ArrayList<Bebida>();
		this.sobremesas = new ArrayList<Sobremesa>();
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public List<Pizza> getPizzas() {
		return pizzas;
	}	public List<Bebida> getBebidas() {
		return bebidas;
	}
	public List<Sobremesa> getSobremesas() {
		return sobremesas;
	}
	public void adicionarPizza(Pizza pizza) {
		this.getPizzas().add(pizza);
	}
	public void adicionarBebida(Bebida bebida) {
		this.getBebidas().add(bebida);
	}
	public void adicionarSobremesa(Sobremesa sobremesa) {
		this.getSobremesas().add(sobremesa);
	}
	public void setFormaDePagamento(FormaDePagamento formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}
	public FormaDePagamento getFormaDePagamento() {
		return formaDePagamento;
	}
}