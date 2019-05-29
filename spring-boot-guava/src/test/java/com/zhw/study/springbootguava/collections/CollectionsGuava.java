package com.zhw.study.springbootguava.collections;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

public class CollectionsGuava {

    @Test
    public void testArray() {
        ArrayList<String> list = Lists.newArrayList();
    }

    @Test
    public void testMap() {
        HashMap<String, String> hashMap = Maps.newHashMap();
    }
}
