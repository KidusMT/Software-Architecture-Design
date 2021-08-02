package lab.cqrs.stockservice.service;

import lab.cqrs.stockservice.data.StockRepository;
import lab.cqrs.stockservice.domain.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class StockService {

    @Autowired
    StockRepository stockRepository;

    public void add(Stock product) {
        stockRepository.save(product);
    }

    public void delete(Long productNumber) {
        Optional<Stock> optionalProduct = stockRepository.findById(productNumber);
        optionalProduct.ifPresent(product -> {
            stockRepository.delete(product);
            System.out.println(product);
        });
    }

    public void update(Stock book) {
        stockRepository.save(book);
    }

    public Stock getProduct(Long productNumber) {
        return stockRepository.findById(productNumber).orElseGet(() -> null);
    }

    public Collection<Stock> findAll() {
        return stockRepository.findAll();
    }
}
