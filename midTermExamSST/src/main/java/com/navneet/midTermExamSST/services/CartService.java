package com.navneet.midTermExamSST.services;

import com.navneet.midTermExamSST.models.Cart;

import java.util.List;

public interface CartService {
    List<Cart> getAllCart();

    Cart getSingleCart(Long id);

    Cart createCart(Cart cart);

    Cart createProduct(Cart carts);
}
