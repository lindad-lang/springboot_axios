package com.springboot.Service;

import com.springboot.Domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class BookServiceTest {

    @Autowired
    private BookService bookService;

    @Test
    void test_selectById(){
        Book book = bookService.selectById(5);
        System.out.println(book.getId() + "  " +book.getName() + "   "+ book.getDescription());
        System.out.println("BookService selectById finished...");
    }

    @Test
    void test_selectAll(){
        List<Book> books = bookService.selectAll();
        for(Book book: books)
            System.out.println(book.getId() + "  " +book.getName());
        System.out.println("BookService selectAll finished...");
    }
}
