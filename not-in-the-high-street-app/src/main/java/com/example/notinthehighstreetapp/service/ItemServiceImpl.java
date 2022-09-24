package com.example.notinthehighstreetapp.service;

import com.example.notinthehighstreetapp.controller.model.Item;
import com.example.notinthehighstreetapp.controller.model.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    ItemRepository itemRepository;

    public Item createItem(String name, double price) {
        Item item = new Item();
        item.setName(name);
        item.setPrice(price);
        Item saveItem = itemRepository.save(item);
        return saveItem;
    }
}
