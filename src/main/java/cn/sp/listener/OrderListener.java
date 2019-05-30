package cn.sp.listener;

import cn.sp.bean.Order;
import cn.sp.event.OrderCreateEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * Created by 2YSP on 2019/5/30.
 */
@Component
public class OrderListener {

    @EventListener
    public void orderListener(Order order){
        System.out.println(this.getClass().getName() + " -- 监听一个订单");
    }

    @EventListener
    public OrderCreateEvent orderReturnEvent(Order order){
        System.out.println(this.getClass().getName() + " -- 监听一个订单,返回一个新的事件 OrderCreateEvent");
        return new OrderCreateEvent(this,order);
    }
}
