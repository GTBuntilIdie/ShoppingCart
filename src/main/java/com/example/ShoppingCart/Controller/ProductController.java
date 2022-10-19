package com.example.ShoppingCart.Controller;

import com.example.ShoppingCart.Service.ProductService;
import com.example.ShoppingCart.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.PublicKey;
import java.util.Set;

@Controller
@RequestMapping("/store/order")
public class ProductController {
    private final ProductService service;
    public ProductController(ProductService service) {
        this.service = service;
    }
    @GetMapping("/add")
    public Product addProduct(@RequestParam int ID) {
        return service.add(ID);
    }
    @GetMapping("/get")
    public Set<Product> getProduct() {
        return service.get();
    }

}
