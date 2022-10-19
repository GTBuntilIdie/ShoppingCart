package com.example.ShoppingCart.Service;

import com.example.ShoppingCart.model.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


@Service
@SessionScope
public class ProductServiceImpl implements ProductService {
    private final Set<Product> products;

    public ProductServiceImpl(Set<Product> products) {
        this.products = products;
    }

    @Override
    public Product add(int ID) {
        Product product = new Product(ID);
        products.add(product);
        return product;

    }

    @Override
    public Set<Product> get() {
        return (Set<Product>) Collections.unmodifiableCollection(products);
    }
}
