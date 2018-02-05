package hu.helixlab.spring.Controller;


import hu.helixlab.spring.Domain.Book;
import hu.helixlab.spring.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/books")
public class BookRestController {

    @Autowired
    private BookService bookService;

    //ide a method után lehet még pl productes vagy cons...pl hogy előállítson egy json filet...
    @RequestMapping( method = RequestMethod.GET)
    public Book getTestBook(){

      return bookService.getTestBook() ;
    }
    @RequestMapping (value="/books", method = RequestMethod.POST)
    public void createBook() {

    }
}
