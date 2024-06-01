package com.kzcse.springboot.purchase.domain.request_model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class OrderedItem {
    private String productId;
    private int quantity;
}