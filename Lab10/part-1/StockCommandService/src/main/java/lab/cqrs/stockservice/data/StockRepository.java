package lab.cqrs.stockservice.data;

import lab.cqrs.stockservice.domain.Stock;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StockRepository extends MongoRepository<Stock, Long> {
    @Override
    Optional<Stock> findById(Long integer);
}
