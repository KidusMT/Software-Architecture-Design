package books;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@SpringBootApplication
public class RestClientApplication implements CommandLineRunner {
    @Autowired
    private RestOperations restTemplate;

    public static void main(String[] args) {
        SpringApplication.run(RestClientApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        String serverUrl = "http://localhost:8080/books";

        // add "The Gang of Four"
        restTemplate.postForLocation(serverUrl, new Book("0639332163", "Richard", "The Gang of Four", 25.0));
        // add "The Alchemist"
        restTemplate.postForLocation(serverUrl, new Book("6739127563", "Doe", "The Alchemist", 20.0));

//        ResponseEntity<Book[]> response = restTemplate.getForEntity(serverUrl,Book[].class);
//        Book[] books = response.getBody();

        // get frank
        Book book = restTemplate.getForObject(serverUrl + "/{isbn}", Book.class, "0639332163");
        System.out.println("----------- get 'The Gang of Four'-----------------------");
        System.out.println(book.getIsbn() + " : " + book.getTitle());
        // get all
        Book[] books = restTemplate.getForObject(serverUrl, Book[].class);
        System.out.println("----------- get all Books-----------------------");
        System.out.println(Arrays.toString(books));

        // delete John
        restTemplate.delete(serverUrl + "/{isbn}", "0639332163");

        // update frank
//		Book.setEmail("franky@gmail.com");
//		restTemplate.put(serverUrl+"/{isbn}", Book, Book.getFirstName());

        // get all
        books = restTemplate.getForObject(serverUrl, Book[].class);
        System.out.println("----------- get all Books-----------------------");
        System.out.println(Arrays.toString(books));
    }


    @Bean
    RestOperations restTemplate() {
        return new RestTemplate();
    }
}
