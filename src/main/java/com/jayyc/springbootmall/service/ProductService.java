package com.jayyc.springbootmall.service;

import com.jayyc.springbootmall.dto.ProductRequest;
import com.jayyc.springbootmall.modal.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);
}
