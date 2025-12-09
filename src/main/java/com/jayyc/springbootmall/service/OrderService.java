package com.jayyc.springbootmall.service;

import com.jayyc.springbootmall.dto.CreateOrderRequest;
import com.jayyc.springbootmall.modal.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
