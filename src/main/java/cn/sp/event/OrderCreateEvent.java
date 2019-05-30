package cn.sp.event;

import cn.sp.bean.Order;
import org.springframework.context.ApplicationEvent;

/**
 * Created by 2YSP on 2019/5/29.
 */
public class OrderCreateEvent extends ApplicationEvent {

    private final Order order;

    public OrderCreateEvent(Object source,Order order) {
        super(source);
        this.order = order;
    }

    public Order getOrder(){
        return order;
    }
}
