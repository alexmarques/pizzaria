package br.com.pizzaria.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.pizzaria.dao.ClienteDAO;
import br.com.pizzaria.entidades.Cliente;
import br.com.pizzaria.entidades.Endereco;

@Controller
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteDAO dao;
	
	@RequestMapping(path="/cadastro", method=RequestMethod.GET)
	public ModelAndView preencherCadastro(HttpSession session) {
		ModelAndView mav = new ModelAndView("cliente/cadastro");
		Cliente cliente = (Cliente) session.getAttribute("cliente");
		mav.addObject("cliente", cliente);
		mav.addObject("endereco", new Endereco());
		return mav;
	}
	
	@RequestMapping(path="/finalizar", method=RequestMethod.POST)
	public ModelAndView finalizarPedido(Endereco endereco, HttpSession session, @RequestParam(name="nome")String nome) {
		ModelAndView mav = new ModelAndView("cliente/finalizar");
		Cliente cliente = (Cliente) session.getAttribute("cliente");
		cliente.setNome(nome);
		cliente.setEndereco(endereco);
		dao.persistir(cliente);
		mav.addObject("cliente", cliente);
		return mav;
	}
}
