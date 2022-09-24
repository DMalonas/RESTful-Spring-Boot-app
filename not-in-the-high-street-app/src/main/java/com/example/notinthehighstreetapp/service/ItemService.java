package com.example.notinthehighstreetapp.service;

import com.example.notinthehighstreetapp.controller.model.Item;

public interface ItemService {

    Item createItem(String name, double price);
}
