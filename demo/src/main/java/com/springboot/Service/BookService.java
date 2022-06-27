package com.springboot.Service;

import com.springboot.Domain.Book;

import java.util.List;

public interface BookService {

    //增
    boolean insert(Book book);

    //删
    boolean delete(Integer id);

    //改
    boolean update(Book book);

    //查1
    Book selectById(Integer id);

    //查多
    List<Book> selectAll();
}
