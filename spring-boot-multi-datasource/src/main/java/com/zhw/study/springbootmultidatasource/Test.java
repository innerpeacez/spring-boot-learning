package com.zhw.study.springbootmultidatasource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
public class Test {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private DataSource secondaryDataSource;


}
