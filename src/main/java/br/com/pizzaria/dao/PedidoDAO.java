package br.com.pizzaria.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.pizzaria.entidades.Pedido;

@Repository
@Transactional
public class PedidoDAO extends GenericDAO<Pedido> {

}
