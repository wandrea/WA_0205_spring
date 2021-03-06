package hu.helixlab.spring.Controller;


import hu.helixlab.spring.Domain.Book;
import hu.helixlab.spring.Repository.BookRepository;
import hu.helixlab.spring.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookRestController {

    @Autowired
    private BookService bookService;

    //ide a method után lehet még pl productes vagy cons...pl hogy előállítson egy json filet...
    @RequestMapping( value = "/books", method = RequestMethod.GET)
    public Book getTestBook(){

      return bookService.getTestBook() ;
    }

    @RequestMapping(value = "/books/{id}", method =RequestMethod.GET )
    public Book findById(@PathVariable ("id") int id){
       /* Book book = new Book();
        book.setId(id);
        book.setName("book"+id);
        book.setIsbn("dfad-5646");
        return book;*/
       return  bookService.findById(id);
    }

    @RequestMapping (value="/books", method = RequestMethod.POST)
    public Book createBook(@RequestBody Book book) {
       /* book.setId(1256);
        book.setName("new book");
        book.setIsbn("dfa545");
        return book; */

       return bookService.save(book);
    }
    @RequestMapping(value = "/books/{id}", method = RequestMethod.DELETE)
    public void deleteBookById (@PathVariable ("id") int id){
        bookService.deleteBookById(id);
    }
    @RequestMapping (value = "/books/{id)", method= RequestMethod.PUT)
    public Book updateBookById(@PathVariable ("id") int id, @RequestBody Book book){return bookService.updateBookById(id, book);

    }





}
