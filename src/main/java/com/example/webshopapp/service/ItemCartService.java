package com.example.webshopapp.service;

import com.example.webshopapp.model.ItemCart;

import java.util.List;

public interface ItemCartService {
    List<ItemCart> getAll();

    ItemCart createNew(ItemCart itemCart);

    ItemCart getOne(long id);

    void delete(long id);

    void update(ItemCart itemCart);

}
