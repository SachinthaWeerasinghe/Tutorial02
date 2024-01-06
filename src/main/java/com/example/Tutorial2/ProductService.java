package com.example.Tutorial2;

import java.util.List;
import java.util.Optional;

public class ProductService {
    private final ProductRepository productRepository = new ProductRepository();

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }
    public Optional<Product> getProductById (Long id){
        return productRepository.findById(id);
    }
    public void addProduct (Product product){
        productRepository.save(product);
    }
    public void updateProduct(Product product){
        productRepository.update(product);
    }

    public void deleteProduct(Long id){
        productRepository.delete(id);
    }
}
