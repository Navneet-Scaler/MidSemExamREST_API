package com.navneet.midTermExamSST.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Iterator;
import java.util.List;

@Getter
@Setter
public class Cart {
    private Long id;
    private Long userId;
    // Come back here to check for diff type DataType to store Date
    private int date;
    private List<Product> products;

    public void setProducts(Cart cart) {

    }
}