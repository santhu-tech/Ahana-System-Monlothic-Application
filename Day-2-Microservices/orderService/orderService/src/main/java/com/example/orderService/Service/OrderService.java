package com.example.orderService.Service;

import com.example.orderService.Model.OrderRequest;

public interface OrderService {
    public long placeOrder(OrderRequest orderRequest);
}
