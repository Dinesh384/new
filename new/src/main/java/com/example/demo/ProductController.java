package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @Autowired
    ProductServiceImpl productService;

    @GetMapping("/getResponse")
    public String getResponse(){
        return "hello";
    }

    @PostMapping("/getResponse")
    public Product saveProduct(@RequestBody Product product){
       return productService.saveProduct(product);
    }

    @GetMapping("/getResponse/{id}")
    public Product getProduct(@PathVariable Integer id){
        Product details = productService.getDetails(id);
        return details;
    }
}
