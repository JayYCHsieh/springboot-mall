package com.jayyc.springbootmall.service;

import com.jayyc.springbootmall.dto.CreateOrderRequest;
import com.jayyc.springbootmall.dto.OrderQueryParams;
import com.jayyc.springbootmall.modal.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
