package com.zhaoxfan.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhaoxfan.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author zhaoxfan
 * @create 2022-01-06 9:39
 */

@Mapper
public interface BookDao extends BaseMapper<Book> {
}
