package br.com.pizzaria.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.pizzaria.entidades.Pizza;

@Repository
@Transactional
public class PizzaDAO extends GenericDAO<Pizza> {

}
