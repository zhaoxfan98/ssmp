package com.zhaoxfan.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.zhaoxfan.domain.Book;

import java.util.List;

/**
 * @author zhaoxfan
 * @create 2022-01-06 10:27
 */
public interface BookService {
    Boolean save(Book book);
    Boolean update(Book book);
    Boolean delete(Integer id);

    Book getById(Integer id);
    List<Book> getAll();

    IPage<Book> getPage(int currentPage, int pageSize);
}
