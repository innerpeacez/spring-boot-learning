package com.zhw.study.springbootmockmvc.controller;

import com.zhw.study.springbootmockmvc.pojo.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author innerpeacez
 * @since 2019/1/8
 */
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private Map<String, Employee> employeeMap = new LinkedHashMap<>();

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable String id) {
        return employeeMap.get(id);
    }

    @GetMapping()
    public Employee getEmployees(@PathVariable String id) {
        return employeeMap.get(id);
    }
}
