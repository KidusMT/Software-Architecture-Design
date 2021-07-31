package open.feign.stockservice;

import org.springframework.stereotype.Service;

@Service
public class StockService {

    public String getProducts(String id){
        return String.valueOf(6);
    }
}
