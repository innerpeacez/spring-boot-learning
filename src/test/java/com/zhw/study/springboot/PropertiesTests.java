package com.zhw.study.springboot;

import com.zhw.study.springboot.po.InnerpeacezInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author: innerpeacez
 * @date: 2018/8/29 13:43
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class PropertiesTests {

    private final Logger logger = LoggerFactory.getLogger(PropertiesTests.class);

    @Autowired
    private InnerpeacezInfo innerpeacezInfo;

    @Test
    public void testCustomProperties() {
        logger.info("------------------------------------------------------");
        logger.info(innerpeacezInfo.toString());
        logger.info("------------------------------------------------------");
    }
}
