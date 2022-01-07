package com.zhaoxfan.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zhaoxfan.domain.Book;

/**
 * @author zhaoxfan
 * @create 2022-01-06 10:41
 */
public interface IBookService extends IService<Book> {
   IPage<Book> getPage(int currentPage, int pageSize);
   IPage<Book> getPage(int currentPage, int pageSize, Book book);
}
