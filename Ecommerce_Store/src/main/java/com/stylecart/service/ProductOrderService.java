package com.stylecart.service;

import com.stylecart.entity.ProductOrder;
import com.stylecart.entity.ProductOrderRequest;

public interface ProductOrderService {
	
	public ProductOrder saveProductOrder(Long id, ProductOrderRequest productOrderRequest);
}
