package com.productservice.productservice.services;


import org.springframework.stereotype.Service;

@Service("fakestore")
public class FakeStoreProductService implements ProductService {

    @Override
    public String getProductById(Long id) {
        return "Scaler 456 || product is fetched " +id ;
    }

    @Override
    public void getAllProducts() {

    }

    @Override
    public void deleteProductById() {

    }

    @Override
    public void createProduct() {

    }

    @Override
    public void updateProductById() {

    }
}
