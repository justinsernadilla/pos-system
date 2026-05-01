package com.github.justinsernadilla.pos.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductController {

//    private final ProductService productService;
//
//    @Autowired
//    public ProductController(ProductRepository productRepository, ProductService productService) {
//        this.productService = productService;
//    }
//
//    @GetMapping("/")
//    public ResponseEntity<ProductResponse> getAll() {
//        //TODO
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<ProductResponse> getById(Long id) {
//        //TODO
//    }
}
