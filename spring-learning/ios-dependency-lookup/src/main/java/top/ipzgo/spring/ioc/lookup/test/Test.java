package top.ipzgo.spring.ioc.lookup.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.ipzgo.spring.ioc.lookup.annotation.Super;
import top.ipzgo.spring.ioc.lookup.domain.User;

import java.util.Map;

public class Test {

    public static void main(String[] args) {
        // spring bean 查找的三种方式
        // 1. 名称查找
        lookupByName();

        // 2. 类型查找
        lookupByType();

        // 3. 注解查找
        lookupByAnnotation();
    }

    public static void lookupByName() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("META-INF/lookup.xml");

        User user = (User) beanFactory.getBean("user");
        System.out.println("名称查找:" + user);
    }

    public static void lookupByType() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("META-INF/lookup.xml");
        ListableBeanFactory listableBeanFactory = (ListableBeanFactory) beanFactory;
        Map<String, User> users = listableBeanFactory.getBeansOfType(User.class);
        System.out.println("类型查找:" + users);
    }

    public static void lookupByAnnotation() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("META-INF/lookup.xml");
        ListableBeanFactory listableBeanFactory = (ListableBeanFactory) beanFactory;
        Map<String, Object> users = listableBeanFactory.getBeansWithAnnotation(Super.class);
        System.out.println("注解查找:" + users);
    }
}
