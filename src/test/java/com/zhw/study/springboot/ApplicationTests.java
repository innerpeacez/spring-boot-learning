//package com.zhw.study.springboot;
//
//import com.zhw.study.springboot.properties.SpringbootProperties;
//import com.zhw.study.springboot.properties.LombokTest;
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest
//public class ApplicationTests {
//
//	@Test
//	public void contextLoads() {
//	}
//
//	@Autowired
//	private SpringbootProperties properties;
//
//	@Autowired
//	private LombokTest ymlProperties;
//
//	@Test
//	public void getHello() throws Exception {
//		Assert.assertEquals(properties.getName(), "innerpeacez");
//		Assert.assertEquals(properties.getTitle(), "spring boot study");
//	}
//
//	@Test
//	public void getYmlProp() {
//		Assert.assertEquals(ymlProperties.getName(), "innerpeacez");
//	}
//
//
//}
