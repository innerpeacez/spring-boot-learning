package com.zhw.study.springbootmockmvc.controller;

import com.zhw.study.springbootmockmvc.pojo.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author innerpeacez
 * @since 2019/1/8
 */
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    /**
     * 保存雇员信息的容器
     */
    private static Map<Integer, Employee> employeeMap = new LinkedHashMap<>();

    /**
     * 静态方法初始化一些雇员信息，方便测试
     */
    static {
        Employee employee1 = new Employee("zhang", "san", "zhangsan@xx.com");
        Employee employee2 = new Employee("li", "si", "lisi@xx.com");
        employeeMap.put(1, employee1);
        employeeMap.put(2, employee2);
    }

    /**
     * 获取一个雇员
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable Integer id) {
        return employeeMap.get(id);
    }

    /**
     * 获取所有雇员
     * @return
     */
    @GetMapping
    public Map<Integer, Employee> getEmployees() {
        return employeeMap;
    }

    /**
     * 增加一个雇员
     * @param employee
     * @return 增加的雇员信息
     */
    @PostMapping
    public Employee addEmployee(Employee employee) {
        return employeeMap.put(employeeMap.size() + 1, employee);
    }

    /**
     * 删除一个雇员
     * @param id
     * @return 删除的雇员信息
     */
    @DeleteMapping
    public Employee deleteEmployee(@RequestParam Integer id) {
        return employeeMap.remove(id);
    }

    /**
     * 修改一个雇员的信息
     * @param id
     * @param employee
     * @return 修改操作之前的雇员信息
     */
    @PutMapping
    public Employee updateEmployee(Integer id, Employee employee) {
        return employeeMap.replace(id, employee);
    }
}
