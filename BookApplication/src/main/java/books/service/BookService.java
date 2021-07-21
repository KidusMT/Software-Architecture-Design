package books.service;

import books.data.BookRepository;
import books.domain.Book;
import books.integration.JmsSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;
    @Autowired
    JmsSender jmsSender;

    public void add(Book book){
        bookRepository.save(book);
        jmsSender.sendMessage(book);
    }
    public void update(Book book){
        bookRepository.save(book);
        jmsSender.sendMessage(book);
    }
    public void delete(String isbn){
        Book book = bookRepository.delete(isbn);
        jmsSender.sendMessage(book);
    }
    public Book getBook(String isbn){
        return bookRepository.findByIsbn(isbn);
    }
    public Collection<Book> findAll(){
        return bookRepository.findAll();
    }
}
