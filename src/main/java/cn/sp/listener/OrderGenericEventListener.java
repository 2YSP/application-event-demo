package cn.sp.listener;

import cn.sp.bean.Order;
import cn.sp.event.GenericEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * Created by 2YSP on 2019/5/30.
 */
@Component
public class OrderGenericEventListener {

    @EventListener(condition = "#event.success")
    public void orderListener(GenericEvent<Order> event){
        System.out.println(this.getClass().getName()+"--处理泛型条件事件。。。");
    }
}
