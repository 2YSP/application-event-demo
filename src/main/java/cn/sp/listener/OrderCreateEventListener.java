package cn.sp.listener;

import cn.sp.event.OrderCreateEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by 2YSP on 2019/5/29.
 */
@Component
public class OrderCreateEventListener implements ApplicationListener<OrderCreateEvent> {


    @Override
    public void onApplicationEvent(OrderCreateEvent event) {
        System.out.printf(this.getClass().getName()+ " -- ApplicationListener 接口实现，订单号[%s]：,锁定商品[%s]\n",
                event.getOrder().getOrderNo(), event.getOrder().getGoods());
    }
}
