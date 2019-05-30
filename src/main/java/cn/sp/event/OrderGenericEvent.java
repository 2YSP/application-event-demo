package cn.sp.event;

import cn.sp.bean.Order;

/**
 * Created by 2YSP on 2019/5/30.
 */
public class OrderGenericEvent extends GenericEvent<Order> {

    public OrderGenericEvent(Order data, boolean success) {
        super(data, success);
    }
}
