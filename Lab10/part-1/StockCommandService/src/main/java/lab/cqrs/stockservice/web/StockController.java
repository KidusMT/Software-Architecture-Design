package lab.cqrs.stockservice.web;

import lab.cqrs.stockservice.domain.Stock;
import lab.cqrs.stockservice.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "stock")
public class StockController {

    @Autowired
    StockService stockService;

    @PostMapping
    public void addProduct(@RequestBody Stock stock) {
        stockService.add(stock);
    }

    @PutMapping("{productNumber}")
    public void updateProduct(@PathVariable String productNumber, @RequestBody Stock stock) {
        stockService.update(stock);
    }

    @DeleteMapping("{productNumber}")
    public void deleteProduct(@PathVariable Long productNumber) {
        stockService.delete(productNumber);
    }
}
