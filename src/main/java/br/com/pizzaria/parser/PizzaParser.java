package br.com.pizzaria.parser;

import java.util.ArrayList;
import java.util.List;

import br.com.pizzaria.dto.Item;
import br.com.pizzaria.entidades.Pizza;
import br.com.pizzaria.enums.TipoItemEnum;

public class PizzaParser {
	
	public static Item fromPizza(Pizza pizza) {
		Item item = new Item();
		item.setTipoItem(TipoItemEnum.PIZZA);
		item.setId(pizza.getId());
		item.setNome(pizza.getNome());
		item.setPreco(pizza.getPreco());
		return item;
	}
	
	public static List<Item> fromPizzas(List<Pizza> pizzas) {
		List<Item> itens = new ArrayList<Item>();
		for(Pizza pizza : pizzas) {
			itens.add(fromPizza(pizza));
		}
		return itens;
	}
}
