package br.com.pizzaria.parser;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import br.com.pizzaria.entidades.Bebida;
import br.com.pizzaria.entidades.Item;
import br.com.pizzaria.enums.TipoItemEnum;

public class BebidasParser {
	
	public static Item fromBebida(Bebida bebida) {
		Item item = new Item();
		BeanUtils.copyProperties(bebida, item);
		item.setTipoItem(TipoItemEnum.BEBIDA);
		return item;
	}
	
	public static List<Item> fromBebidas(List<Bebida> bebidas) {
		List<Item> itens = new ArrayList<Item>();
		for(Bebida bebida : bebidas) {
			itens.add(fromBebida(bebida));
		}
		return itens;
	}

}
