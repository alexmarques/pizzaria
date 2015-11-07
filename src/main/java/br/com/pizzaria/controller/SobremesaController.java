package br.com.pizzaria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.pizzaria.dao.SobremesaDAO;
import br.com.pizzaria.dto.Item;
import br.com.pizzaria.entidades.Sobremesa;
import br.com.pizzaria.parser.SobremesaParser;

@RestController
@RequestMapping("/sobremesas")
public class SobremesaController {
	
	@Autowired
	private SobremesaDAO dao;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Item> carregarTodas() {
		return SobremesaParser.fromSobremesas(dao.carregarTodos(Sobremesa.class));
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Sobremesa bebidaPorId(@PathVariable long id) {
		return dao.obter(Sobremesa.class, id);
	}
}