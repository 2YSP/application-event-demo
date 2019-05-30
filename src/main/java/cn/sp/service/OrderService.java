package cn.sp.service;

import cn.sp.bean.Order;
import cn.sp.event.GenericEvent;
import cn.sp.event.OrderCreateEvent;
import cn.sp.event.OrderGenericEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * Created by 2YSP on 2019/5/29.
 */
@Service
public class OrderService implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher applicationEventPublisher;

    /**
     * 订单保存
     */
    public void save(){
        String orderNo = getOrderNo();
        Order order = new Order();
        order.setOrderNo(orderNo);
        order.setOrderStatus("待付款");
        order.setCreateTime(new Date());
        order.setGoods("手机");
        System.out.println("订单保存成功：" + order.toString());

        //发布事件
//        applicationEventPublisher.publishEvent(new OrderCreateEvent(this,order));
        applicationEventPublisher.publishEvent(order);
        applicationEventPublisher.publishEvent(new OrderGenericEvent(order,true));
        System.out.println("================");

    }

    private String getOrderNo() {
        String millis = String.valueOf(System.currentTimeMillis());
        String str = millis.substring(millis.length() - 7, millis.length() - 1);
        return LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd")) + str;
    }


    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }
}
