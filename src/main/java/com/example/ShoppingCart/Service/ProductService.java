package com.example.ShoppingCart.Service;

import com.example.ShoppingCart.model.Product;

import java.util.Set;

public interface ProductService {
    Product add(int ID);
    Set<Product> get();

}
