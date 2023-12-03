package com.productservice.productservice.services;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface ProductService {
//By default, all methods are public and abstract until we do not declare it
    String getProductById( Long id);
    void getAllProducts();
    void deleteProductById();
    void createProduct();
    void updateProductById();

}
