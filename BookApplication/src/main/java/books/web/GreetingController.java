package books.web;

import books.domain.Book;
import books.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping(path = "books")
public class GreetingController {

    @Autowired
    BookService bookService;

    public String sayHello(){
        return "Hello World";
    }

    @PostMapping
    public void addBook(@RequestBody Book book){
        bookService.add(book);
    }

    @PutMapping("{isbn}")
    public void updateBook(@PathVariable String isbn, @RequestBody Book book){
        bookService.update(book);
    }

    @DeleteMapping("{isbn}")
    public void deleteBook(@PathVariable String isbn){
        bookService.delete(isbn);
    }

    @GetMapping("{isbn}")
    public Book getBook(@PathVariable String isbn){
        return bookService.getBook(isbn);
    }

    @GetMapping
    public Collection<Book> getAllBooks(){
        return bookService.findAll();
    }
}
