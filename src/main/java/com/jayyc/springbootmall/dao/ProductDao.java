package com.jayyc.springbootmall.dao;

import com.jayyc.springbootmall.modal.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
