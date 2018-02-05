package hu.helixlab.spring.Service;

import hu.helixlab.spring.Domain.Book;
import org.springframework.stereotype.Service;
@Service
public class BookService {

    public Book getTestBook (){

        Book book=new Book();
        book.setId(101);
        book.setName("akarmi");
        book.setIsbn("abd-9856");

        return book;
    }
}
