package com.example.Tutorial2;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final ProductService productService = new ProductService();

    @GetMapping
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Optional<Product> getProductById(@PathVariable Long id){
        return productService.getProductById(id);
    }

    @PostMapping
    public void addProduct(@RequestBody Product product){
        productService.addProduct(product);
    }

    @PutMapping("/{id}")
    public void updateProduct (@PathVariable Long id, @RequestBody Product product){
        product.setId(id);
        productService.updateProduct(product);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct (@PathVariable Long id){
        productService.deleteProduct(id);
    }
}
