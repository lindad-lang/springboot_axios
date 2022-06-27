package com.springboot.Dao;

import com.springboot.Domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class BookDaoTest {

    @Autowired
    private BookDao bookDao;

    @Test
    void test_insert(){
        Book book = new Book();
        book.setName("数据挖掘");
        book.setType("计算机类");
        book.setDescription("算法");
        bookDao.insert(book);
        System.out.println("insert finished...");
    }

    @Test
    void test_delete(){
        bookDao.delete(74);
        System.out.println("delete finished...");
    }

    @Test
    void test_update(){
        Book book = new Book();
        book.setId(75);
        book.setName("数据挖掘高斯");
        book.setType("计算机类");
        book.setDescription("算法");
        bookDao.update(book);
        System.out.println("update finished...");
    }

    @Test
    void test_selectById(){
        Book book = bookDao.selectById(5);
        System.out.println(book.getId() + "  " +book.getName() + "   "+ book.getDescription());
        System.out.println("selectById finished...");
    }

    @Test
    void test_selectAll(){
        List<Book> books = bookDao.selectAll();
        for(Book book: books)
            System.out.println(book.getId() + "  " +book.getName());
        System.out.println("selectAll finished...");
    }

}
