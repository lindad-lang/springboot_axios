package com.springboot.Dao;
import com.springboot.Domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface BookDao {

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
