package cn.sp.listener;

import cn.sp.event.OrderCreateEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * 基于注解实现监听器
 * Created by 2YSP on 2019/5/29.
 */
@Component
public class OrderCreateEventListenerAnnotation {

    @Async
    @EventListener
    public void createOrderEvent(OrderCreateEvent event){
        System.out.println(this.getClass().getName()+"--订单创建事件，@EventListener注解实现，orderNo:"+event.getOrder().getOrderNo());
    }
}
