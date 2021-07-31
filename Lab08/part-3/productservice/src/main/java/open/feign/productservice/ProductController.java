package open.feign.productservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/product/{id}")
    public String getStockProducts(@PathVariable String id) {
        return productService.getProducts(id);
    }

    @FeignClient(name = "StockService")
    public interface ProductService {

        @GetMapping("/stock/{stockId}")
        String getProducts(@PathVariable String stockId);
    }
}
