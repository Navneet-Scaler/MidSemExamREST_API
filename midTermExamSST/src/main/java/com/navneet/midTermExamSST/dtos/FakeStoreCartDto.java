package com.navneet.midTermExamSST.dtos;

import lombok.Getter;
import lombok.Setter;
import com.navneet.midTermExamSST.models.Product;

import java.util.List;

@Getter
@Setter
public class FakeStoreCartDto {
    private Long id;
    private Long userId;
    private int date;
    private List<Product> products;


}
