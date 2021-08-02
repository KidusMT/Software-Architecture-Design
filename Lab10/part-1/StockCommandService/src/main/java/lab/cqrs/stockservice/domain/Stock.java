package lab.cqrs.stockservice.domain;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Stock {
    private Long productNumber;
    private Integer quantity;
}
