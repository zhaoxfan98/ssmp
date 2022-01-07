package com.zhaoxfan.controller.utils;

import com.zhaoxfan.domain.Book;
import lombok.Data;

import java.util.List;

/**
 * @author zhaoxfan
 * @create 2022-01-06 11:19
 */

@Data
public class R {

    private Boolean flag;
    private Object data;
    private String msg;

    public R() {}

    public R(Boolean flag) {
        this.flag = flag;
    }

    public R(Boolean flag, Object data) {
        this.flag = flag;
        this.data = data;
    }

    public R(String msg) {
        this.flag = false;
        this.msg = msg;
    }
}
