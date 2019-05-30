package cn.sp;

import cn.sp.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationEventDemoApplicationTests {

	@Autowired
	OrderService orderService;

	@Test
	public void contextLoads() {
		orderService.save();
	}

}
