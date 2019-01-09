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
@WebMvcTest(EmployeeController.class) // 需要测试的 Controller
public class EmployeeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testPost() throws Exception {
        MvcResult mvcResult = mockMvc.perform(post("/employee") //设置请求方式为 post 及 url
                .accept(MediaType.APPLICATION_JSON) // 设置请求参数以json的方式接收
                .param("firstName", "wang") // 添加参数
                .param("lastName", "wu")
                .param("email", "wangwu@xx.com")
                .contentType(MediaType.APPLICATION_JSON)) // 设置返回值以json的方式
                .andExpect(status().isOk()) // 设置请求的状态码为 200，可以添加一些期望的响应的结果判断
                .andDo(print()) // print 方法打印出请求体，响应体
                .andReturn(); // 获取返回值MvcResult
        System.out.println(mvcResult.getResponse().getContentAsString());

        testGetAll();
    }

    @Test
    public void testGetOne() throws Exception {
        mockMvc.perform(get("/employee/1")
                .accept(MediaType.APPLICATION_JSON)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andDo(print()) //
                .andReturn(); // 获取返回值
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
