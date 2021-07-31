package open.feign.productservice;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ProductController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/product/{id}")
    @HystrixCommand(fallbackMethod = "getTextFallback")
    public String getStockProducts(@PathVariable String id) {
        String service2Text = restTemplate.getForObject("http://localhost:8900/stock/" + id, String.class);
        return "ProductController " + service2Text;
    }

    public String getTextFallback(String msg){
        return "From Hystrix Response";
    }

    @Bean
    RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
