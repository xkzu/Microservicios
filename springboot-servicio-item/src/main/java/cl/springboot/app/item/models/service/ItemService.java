package cl.springboot.app.item.models.service;

import java.util.List;

import cl.springboot.app.item.models.Item;

public interface ItemService {
	
	public List<Item> findAll();
	
	public Item findById(Long id, Integer cantidad);

}
