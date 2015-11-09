package br.com.pizzaria.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.pizzaria.dao.ClienteDAO;
import br.com.pizzaria.entidades.Cliente;
import br.com.pizzaria.entidades.Item;
import br.com.pizzaria.entidades.Pedido;

@RestController
public class PedidoController {
	
	@Autowired
	private ClienteDAO dao;
	
	@RequestMapping(method=RequestMethod.PUT, path = "/finalizarPedido")
	public void finalizarPedido(@RequestBody List<Item> itens, HttpSession session) {
		Cliente cliente = new Cliente();
		Pedido pedido = new Pedido();
		pedido.setItens(itens);
		cliente.adicionarPedido(pedido);
		dao.persistir(cliente);
		session.setAttribute("cliente", cliente);
	}
}