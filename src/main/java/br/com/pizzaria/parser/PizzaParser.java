package br.com.pizzaria.parser;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import br.com.pizzaria.entidades.Item;
import br.com.pizzaria.entidades.Pizza;
import br.com.pizzaria.enums.TipoItemEnum;

public class PizzaParser {
	
	public static Item fromPizza(Pizza pizza) {
		Item item = new Item();
		BeanUtils.copyProperties(pizza, item);
		item.setTipoItem(TipoItemEnum.PIZZA);
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