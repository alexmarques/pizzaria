package br.com.pizzaria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.pizzaria.dao.BebidaDAO;
import br.com.pizzaria.dto.Item;
import br.com.pizzaria.entidades.Bebida;
import br.com.pizzaria.parser.BebidasParser;

@RestController
@RequestMapping("/bebidas")
public class BebidaController {
	
	@Autowired
	private BebidaDAO dao;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Item> carregarTodas() {
		return BebidasParser.fromBebidas(dao.carregarTodos(Bebida.class));
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Bebida bebidaPorId(@PathVariable long id) {
		return dao.obter(Bebida.class, id);
	}
}