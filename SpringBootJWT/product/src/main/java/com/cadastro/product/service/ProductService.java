package com.cadastro.product.service;

import java.util.List;

import com.cadastro.product.entity.Product;

public interface ProductService {
    List<Product> listAll();
    Product create(Product product);
    Product update(Product product);
    void delete(Long id);
}
