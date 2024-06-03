package com.cadastro.product.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.cadastro.product.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
