package esb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public class NextDayShippingActivator {
	@Autowired
	RestTemplate restTemplate;

	public void ship(Order order) {
		System.out.println("next day shipping: "+ order.toString());
		restTemplate.postForLocation("http://localhost:8081/orders", order);
	}
}
