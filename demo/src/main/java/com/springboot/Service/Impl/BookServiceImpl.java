package com.springboot.Service.Impl;

import com.springboot.Dao.BookDao;
import com.springboot.Domain.Book;
import com.springboot.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    @Override
    public boolean insert(Book book) {
        return bookDao.insert(book);
    }

    @Override
    public boolean delete(Integer id) {
        return bookDao.delete(id);
    }

    @Override
    public boolean update(Book book) {
        return bookDao.update(book);
    }

    @Override
    public Book selectById(Integer id) {
        return bookDao.selectById(id);
    }

    @Override
    public List<Book> selectAll() {
        return bookDao.selectAll();
    }
}
