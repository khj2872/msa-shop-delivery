package com.msa.shop.delivery.events.handler;

import com.msa.shop.delivery.events.OrderChannel;
import com.msa.shop.delivery.events.model.OrderChangeModel;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@EnableBinding(OrderChannel.class)
@RequiredArgsConstructor
@Log4j2
public class OrderChangeHandler {

    @StreamListener(OrderChannel.INPUT)
    public void subscribeOrderChange(OrderChangeModel orderChangeModel) {
        log.info("orderChangeModel ::: {}", orderChangeModel.toString());
    }

}
