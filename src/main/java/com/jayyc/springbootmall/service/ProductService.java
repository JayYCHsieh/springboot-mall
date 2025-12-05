package com.jayyc.springbootmall.service;

import com.jayyc.springbootmall.constant.ProductCategory;
import com.jayyc.springbootmall.dto.ProductRequest;
import com.jayyc.springbootmall.modal.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductCategory category, String search);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
