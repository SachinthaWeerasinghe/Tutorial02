package com.example.Tutorial2;



import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductRepository {
    private final List<Product> products = new ArrayList<>();
    private long productId = 1;

    public List<Product> findAll(){
        return products;
    }

    public Optional<Product> findById(Long id){
        return products.stream().filter(p -> p.getId().equals(id)).findFirst();
    }

    public void save(Product product){
        product.setId(productId++);
        products.add(product);
    }

    public void update(Product product){
        int index = products.indexOf(product);
        if(index != -1){
            products.set(index, product);
        }
    }
    public void delete(Long id){
        products.removeIf(p -> p.getId().equals(id));
    }

}

