package com.navneet.midTermExamSST.models;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    int pId;
    int qty;

    public Product(int id, int qty){
        this.pId = id;
        this.qty = qty;
    }
}
