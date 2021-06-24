package com.example.webshopapp.service;

import com.example.webshopapp.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();

    Product createNew(Product product);

    Product getOne(long id);

    void delete(long id);

    void update(Product product);

    Long sunQuantities();

    Double total();

}
