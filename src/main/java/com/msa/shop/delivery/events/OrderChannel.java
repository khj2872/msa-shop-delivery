package com.msa.shop.delivery.events;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface OrderChannel {
    String INPUT = "inputOrderChange";

    @Input(OrderChannel.INPUT)
    SubscribableChannel input();
}