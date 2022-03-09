package com.sumit.restapi.communication.integration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.sumit.restapi.communication.entity.Item;

@Component
public class IntegrationTest {

	
	private final String url="http://localhost:8080/api/";
	@Autowired
	RestTemplate obj;
	
	public List itemList()
	{
		
		
		List<Item> items=obj.getForObject(url+"get_items", List.class);
		
		
		return items;
		
	}
	public Item getItem(int id)
	{
		Item item=obj.getForObject(url+id, Item.class);
		
		return item;
	}
	public Item saveItem(Item item)
	{
		
		return obj.postForObject(url+"save", item, Item.class);
	}
	public void updatebyId(int id,Item item)
	{
		Map < String, Integer > params = new HashMap < String, Integer > ();
		params.put("id",id);
		System.out.println("id"+id);
		System.out.println(item);
		System.out.println(url+"updateItemById/"+id);
		obj.put(url+"updateItemById/"+id, item, params);	
		// Similarly we can use obj.delete() to delete from other micro services
	}
}
