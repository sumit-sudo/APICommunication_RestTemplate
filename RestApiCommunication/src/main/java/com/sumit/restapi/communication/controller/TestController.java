package com.sumit.restapi.communication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.sumit.restapi.communication.entity.Item;
import com.sumit.restapi.communication.integration.IntegrationTest;

@RestController
public class TestController {

	@Autowired
	IntegrationTest integration;
	
	@Autowired
	RestTemplate template;
	
	@GetMapping("/item_list")
	public List<Item> getItems()
	{
		return integration.itemList(); 
	}
	
	@GetMapping("/{id}")
	public Item getItem(@PathVariable("id") int id)
	{
		return integration.getItem(id);
	}

	@PostMapping("/save")
	public Item updateById(@RequestBody Item item )
	{
		return integration.saveItem(item);
	}
	@PutMapping("/update/{id}")
	public void updateById(@PathVariable("id") int id,@RequestBody Item item )
	{
		
		System.out.println("HI");
		integration.updatebyId(id, item);
	}
}
