package com.msa.shop.delivery.events.model;

import com.msa.shop.delivery.events.Action;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class OrderChangeModel {
    private String type;
    private Action action;
    private String orderId;
}
