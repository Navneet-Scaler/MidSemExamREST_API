package com.navneet.midTermExamSST.Controllers;

import com.navneet.midTermExamSST.models.Cart;
import com.navneet.midTermExamSST.services.CartService;
import org.springframework.web.bind.annotation.*;
import com.navneet.midTermExamSST.services.FakeStoreCartServices;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
public class CartController {

    private CartService cartService;

    // Make a  CartController Constructor
    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    // Adding Functionality


    // 1. Get all Carts
    @GetMapping("/carts")
    public List<Cart> getAllCart(){
        return new ArrayList<>();
    }

    // 2. Get a single cart
    @GetMapping("/carts/{id}")
    public Cart getSingleCart(@PathVariable("id") Long id ) {
        return new Cart();
    }

    // 3. Get Cart by Date Range



    // 4. Get cart by userId


    // 5. Add a new Cart
    @PostMapping("/carts")
    public Cart createCart(@RequestBody Cart cart) {
        return new Cart();
    }

    // 6. Update a Cart



    // 7. Delete a Cart
    /*
    @DeleteMapping("/carts/{id}")
    public void deleteCart(@RequestBody Cart cart) {
        Cart carts = null;
        Iterator<Cart> iterator = carts.iterator();
        while (iterator.hasNext()) {
            carts = iterator.next();
            Long id = Cart.id;
            if (Cart.getId() == id) {
                iterator.remove();
                return carts; //returns the deleted resource back
            }
        }
        return null;
    }
    */



}
