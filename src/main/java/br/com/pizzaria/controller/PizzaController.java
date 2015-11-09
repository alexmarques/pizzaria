package br.com.pizzaria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.pizzaria.dao.PizzaDAO;
import br.com.pizzaria.entidades.Item;
import br.com.pizzaria.entidades.Pizza;
import br.com.pizzaria.parser.PizzaParser;

@RestController
@RequestMapping("/pizzas")
public class PizzaController {
	
	@Autowired
	private PizzaDAO dao;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Item> carregarTodas() {
		return PizzaParser.fromPizzas(dao.carregarTodos(Pizza.class));
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Pizza obterPizza(@PathVariable long id) {
		Pizza pizza = dao.obter(Pizza.class, id);
		return pizza;
	}
}