package com.springboot.Controller;

import com.springboot.Domain.Book;
import com.springboot.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping
public class BookController {
    @Autowired
    private BookService bookService;

    /**
     * 添加操作
     * @param "传入"
     * @return 返回固定格式的数据
     */
    @PostMapping("/insert")
    public Result insert(@RequestBody Book book, Model model){
        boolean flag = bookService.insert(book);
        System.out.println(book.getName());
        return new Result(flag ? Code.SAVE_OK:Code.SAVE_ERR, book,flag ? "insert  success...":"eror");
    }

    @DeleteMapping("/delete/{id}")
    public Result delete(@PathVariable Integer id){
        boolean flag = bookService.delete(id);
        return new Result(flag ? Code.DELETE_OK: Code.DELETE_ERR, flag ? "delete  success...":"eror");
    }

    @PutMapping("/update")
    public Result update(@RequestBody Book book){
        boolean flag = bookService.update(book);
        return new Result(flag ? Code.UPDATE_OK: Code.UPDATE_ERR, flag ? "get  success...":"eror");
    }
//
    @GetMapping("/selectById/{id}")
    public Result selectById(@PathVariable Integer id){
        Book book = bookService.selectById(id);
        Integer code = book != null ? Code.GET_OK: Code.GET_ERR;
        String  msg = book != null ? "get  success...":"eror";
        return new Result(code , book ,msg);
    }

    @GetMapping("/selectAll")
    public Result selectAll(HttpServletRequest request){
        List<Book> books = bookService.selectAll();
        System.out.println(request.getParameter("username"));
        Integer code = books != null ? Code.GET_OK: Code.GET_ERR;
        String  msg = books != null ? "get  success...":"eror";
        return new Result(code , books ,msg);
    }

}
