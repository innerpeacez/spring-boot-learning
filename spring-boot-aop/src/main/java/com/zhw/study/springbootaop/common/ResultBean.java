package com.zhw.study.springbootaop.common;

import lombok.Data;

/**
 * @author innerpeacez
 * @since 2019/1/7
 * 统一返回值
 */
@Data
public class ResultBean<T> {
    private static final String SUCCESS = "200";
    private static final String FAIL = "500";

    private String message = "SUCCESS";
    private String code = SUCCESS;
    private T data;

    public ResultBean() {
    }

    public ResultBean(T data) {
        this.data = data;
    }

    public ResultBean(Throwable e) {
        this.message = e.toString();
        this.code = FAIL;
    }
}
