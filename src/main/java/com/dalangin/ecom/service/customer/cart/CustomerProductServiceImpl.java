package com.dalangin.ecom.service.customer.cart;

import com.dalangin.ecom.dto.ProductDto;
import com.dalangin.ecom.entity.Product;
import com.dalangin.ecom.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CustomerProductServiceImpl implements CustomerProductService {

    private final ProductRepository productRepository;

    public List<ProductDto> getAllProducts() {
        List<Product> products = productRepository.findAll();

        return products.stream().map(Product::getDto).collect(Collectors.toList());
    }

    public List<ProductDto> searchProductByTitle(String name) {
        List<Product> products = productRepository.findAllByNameContaining(name);

        return products.stream().map(Product::getDto).collect(Collectors.toList());
    }

//    @PostConstruct
//    public void createSampleProduct() {
//        Optional<Product> product = productRepository.findById(0L);
//
//        if (null == product) {
//            Product product1 = new Product();
//            product1.setName("test");
//            productRepository.save(product1);
//        }
//    }
}
