package gr.mastro.ecommerce.productservice.controllers;

import gr.mastro.ecommerce.productservice.entities.Product;
import gr.mastro.ecommerce.productservice.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/addOne")
    public Product addProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @PostMapping("/addList")
    public List<Product> addProductList (@RequestBody List<Product> products) {
        return productRepository.saveAll(products);
    }

    @GetMapping("/getAll")
    public List<Product> getAllProduct () {
        return productRepository.findAll();
    }
}