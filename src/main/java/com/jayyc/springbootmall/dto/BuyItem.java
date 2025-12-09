package com.jayyc.springbootmall.dto;

import jakarta.validation.constraints.NotNull;
import org.springframework.web.client.RestTemplate;

public class BuyItem {

    @NotNull
    private Integer productId;

    @NotNull
    private Integer quantity;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
