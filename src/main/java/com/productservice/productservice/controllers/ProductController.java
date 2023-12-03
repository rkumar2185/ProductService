package com.productservice.productservice.controllers;

import com.productservice.productservice.services.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductService productservice;

    ProductController(
            @Qualifier("fakestore") ProductService productservice){
        this.productservice = productservice;
    }
    @GetMapping("/{id}")
    public String getProductById(@PathVariable("id") Long id){

        return productservice.getProductById(id);
      //  return "product is fetched " +id ;
    }

    @GetMapping
    public void getAllProducts(){

    }

    @DeleteMapping("id")
    public void deleteProductById(){

    }

    public void createProduct(){

    }

    public void updateProductById(){

    }
}
