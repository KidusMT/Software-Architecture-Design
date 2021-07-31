package service;



import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ServiceOneController {
	private static final Logger logger = LoggerFactory.getLogger(ServiceOneController.class.getName());

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/text")
    public String getText() {
        String service2Text = restTemplate.getForObject("http://localhost:9091/text",
                String.class);
        return "Hello "+ service2Text;
    }

    @Bean
    RestTemplate getRestTemplate() {
        return new RestTemplate();
    }


    @RequestMapping("/a")
    public String one() {
        logger.info("Calling a"); 
        return "Calling a";
    }
	
	@RequestMapping("/b")
    public String two() {
        logger.info("Calling b"); 
        return "Calling b";
    }
}
