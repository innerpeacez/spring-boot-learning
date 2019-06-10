package com.zhw.study.springbootannotation;

import java.util.Arrays;
import java.util.List;

@StringRepository
public class NameRepository {
    public List<String> findAll() {
        return Arrays.asList("张三", "innerpeacez");
    }
}
