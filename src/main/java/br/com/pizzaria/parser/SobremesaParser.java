package br.com.pizzaria.parser;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import br.com.pizzaria.entidades.Item;
import br.com.pizzaria.entidades.Sobremesa;
import br.com.pizzaria.enums.TipoItemEnum;

public class SobremesaParser {
	
	public static Item fromSobremesa(Sobremesa sobremesa) {
		Item item = new Item();
		BeanUtils.copyProperties(sobremesa, item);
		item.setTipoItem(TipoItemEnum.SOBREMESA);
		return item;
	}
	
	public static List<Item> fromSobremesas(List<Sobremesa> sobremesas) {
		List<Item> itens = new ArrayList<Item>();
		for(Sobremesa sobremesa : sobremesas) {
			itens.add(fromSobremesa(sobremesa));
		}
		return itens;
	}
}
