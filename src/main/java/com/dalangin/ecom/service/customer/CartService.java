package com.dalangin.ecom.service.customer;

import com.dalangin.ecom.dto.AddProductInCartDto;
import com.dalangin.ecom.dto.OrderDto;
import org.springframework.http.ResponseEntity;

public interface CartService {

    ResponseEntity<?> addProductToCart(AddProductInCartDto addProductInCartDto);

    OrderDto getCartByUserId(Long userId);
}
