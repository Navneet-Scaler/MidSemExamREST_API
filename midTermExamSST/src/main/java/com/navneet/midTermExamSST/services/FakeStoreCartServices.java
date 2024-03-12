package com.navneet.midTermExamSST.services;

import com.navneet.midTermExamSST.dtos.FakeStoreCartDto;
import com.navneet.midTermExamSST.models.Product;
import com.navneet.midTermExamSST.models.Cart;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;

@Service
public abstract class FakeStoreCartServices implements CartService {
    private RestTemplate restTemplate = new RestTemplate();
    public List<Cart> getAllCart() {
        return null;
    }
    @Override
    public Cart getSingleCart(Long id) {

        FakeStoreCartDto fakeStoreCartDto = restTemplate.getForObject(
                "https://fakestoreapi.com/carts/" + id,
                FakeStoreCartDto.class
        );

        Cart carts = new Cart();
        if (fakeStoreCartDto != null) {
            carts.setId(fakeStoreCartDto.getId());
        }
        if (fakeStoreCartDto != null) {
            carts.setUserId(fakeStoreCartDto.getUserId());
        }
        if (fakeStoreCartDto != null) {
            carts.setDate(fakeStoreCartDto.getDate());
        }

        product.setCategory(new Category());
        product.getCategory().setName(fakeStoreProductDto.getCategory());

        return carts;
    }

//    public Cart get

    @Override
    public Cart createProduct(Cart carts) {
        return null;
    }

}

