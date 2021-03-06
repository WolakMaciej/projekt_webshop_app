package com.example.webshopapp.service;

import com.example.webshopapp.model.ShopOrder;

import java.util.List;

public interface ShopOrderService {
    List<ShopOrder> getAll();

    ShopOrder createNew(ShopOrder shopOrder);

    ShopOrder getOne(long id);

    void delete(long id);

    void update(ShopOrder shopOrder);

    List<ShopOrder> findShopOrdersByUserUsername(String username);


}
