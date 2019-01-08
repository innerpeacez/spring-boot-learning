package com.zhw.study.springbootmockmvc;

import com.zhw.study.springbootmockmvc.controller.HelloController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class) // 使用JUnit4进行测试
@WebMvcTest(HelloController.class) // 寻找 Controller
public class SpringBootMockmvcApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testHelloController() throws Exception {
        MvcResult mvcResult = mockMvc.perform(get("/hello").param("name", "innerpeacez")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).andExpect(content().string(equalTo("Hello innerpeacez")))
                .andDo(print()/* 打印抓包信息 */).andReturn()/*获取返回值*/;
        System.out.println(mvcResult.getResponse().getContentAsString());
    }

    @Test
    public void contextLoads() {
    }

}

