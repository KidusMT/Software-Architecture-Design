package open.feign.productservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class ProductController {

//    @Autowired
//    ProductService productService;

//    @GetMapping("/product/{id}")
//    public String getStockProducts(@PathVariable String id) {
//        return String.valueOf(5);/*productService.getProducts(id);*/
//    }

    @Autowired
    RestTemplate restTemplate;

    //    @RequestMapping("/text")
//    public String getText() {

    @GetMapping("/product/{id}")
    public String getStockProducts(@PathVariable String id) {
        String service2Text = restTemplate.getForObject("http://localhost:8900/stock/"+id, String.class);
        return "ProductController " + service2Text;
    }

    @Bean
    RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

//    @FeignClient(name = "StockService")
//    public interface ProductService {
//
//        @GetMapping("/stock/{stockId}")
//        String getProducts(@PathVariable String stockId);
//    }
}
