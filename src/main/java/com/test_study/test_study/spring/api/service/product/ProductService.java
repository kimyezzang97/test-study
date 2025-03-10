package com.test_study.test_study.spring.api.service.product;

import com.test_study.test_study.spring.api.service.product.response.ProductResponse;
import com.test_study.test_study.spring.domain.product.Product;
import com.test_study.test_study.spring.domain.product.ProductRepository;
import com.test_study.test_study.spring.domain.product.ProductSellingStatus;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class ProductService {

    private final ProductRepository productRepository;

    public List<ProductResponse> getSellingProducts(){
        List<Product> products = productRepository.findAllBySellingStatusIn(ProductSellingStatus.forDisplay());

        return products.stream()
                .map(ProductResponse::of)
                .collect(Collectors.toList());
    }
}
