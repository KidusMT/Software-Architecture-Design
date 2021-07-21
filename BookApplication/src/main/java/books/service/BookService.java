package books.service;

import books.data.BookRepository;
import books.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public void add(Book book){
        bookRepository.save(book);
    }
    public void update(Book book){
        bookRepository.save(book);
    }
    public void delete(String isbn){
        bookRepository.delete(isbn);
    }
    public Book getBook(String isbn){
        return bookRepository.findByIsbn(isbn);
    }
    public Collection<Book> findAll(){
        return bookRepository.findAll();
    }
}
