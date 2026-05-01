package com.github.justinsernadilla.pos.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//TODO: add validation
@Service
public class ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    @Autowired
    public ProductService(ProductRepository productRepository, ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }

    public List<ProductResponse> getAll() {
        List<Product> products = productRepository.findAll();

        return products.stream()
                .map(productMapper)
                .toList();
    }

    public ProductResponse getById(Long id) {
        Product product = productRepository.findById(id).orElseThrow(); //TODO Handle

        return productMapper.apply(product);
    }
}
