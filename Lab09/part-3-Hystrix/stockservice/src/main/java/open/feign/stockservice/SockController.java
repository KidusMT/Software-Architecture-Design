package open.feign.stockservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SockController {

    @Autowired
    StockService stockService;

    @GetMapping("/stock/{stockId}")
    public String getProducts(@PathVariable String stockId){
        return stockService.getProducts(stockId);
    }
}
