package com.zhw.study.springbootmockmvc;

import com.zhw.study.springbootmockmvc.controller.EmployeeController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


/**
 * @author innerpeacez
 * @since 2019/1/9
 */
@RunWith(SpringRunner.class)
@WebMvcTest(EmployeeController.class)
public class EmployeeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testPost() throws Exception {
        MvcResult mvcResult = mockMvc.perform(post("/employee")
                .accept(MediaType.APPLICATION_JSON)
                .param("firstName", "wang")
                .param("lastName", "wu")
                .param("email", "wangwu@xx.com")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andDo(print())
                .andReturn();
        System.out.println(mvcResult.getResponse().getContentAsString());

        testGetAll();
    }

    @Test
    public void testGetOne() throws Exception {
        MvcResult mvcResult = mockMvc.perform(get("/employee/1")
                .accept(MediaType.APPLICATION_JSON)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andDo(print()) //
                .andReturn(); // 获取返回值
        System.out.println(mvcResult.getResponse().getContentAsString());
    }

    @Test
    public void testGetAll() throws Exception {
        MvcResult mvcResult = mockMvc.perform(get("/employee")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andDo(print()).andReturn();
        System.out.println(mvcResult.getResponse().getContentAsString());
    }

    @Test
    public void testPut() throws Exception {
        MvcResult mvcResult = mockMvc.perform(put("/employee")
                .accept(MediaType.APPLICATION_JSON)
                .param("id", "1")
                .param("firstName", "张")
                .param("lastName", "三")
                .param("email", "zhangsan@xx.com")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andDo(print())
                .andReturn();

        System.out.println("修改之前的值：" + mvcResult.getResponse().getContentAsString());
        testGetOne();
    }


    @Test
    public void testDelete() throws Exception {
        MvcResult mvcResult = mockMvc.perform(delete("/employee/1")
                .accept(MediaType.APPLICATION_JSON)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andDo(print())
                .andReturn();

        System.out.println("删除之前的值：" + mvcResult.getResponse().getContentAsString());
        testGetOne();
    }
}
