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

    private static Map<Integer, Employee> employeeMap = new LinkedHashMap<>();

    static {
        Employee employee1 = new Employee("zhang", "san", "zhangsan@xx.com");
        Employee employee2 = new Employee("li", "si", "lisi@xx.com");
        employeeMap.put(1, employee1);
        employeeMap.put(2, employee2);
    }

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable Integer id) {
        return employeeMap.get(id);
    }

    @GetMapping
    public Map<Integer, Employee> getEmployees() {
        return employeeMap;
    }

    @PostMapping
    public Employee addEmployee(Employee employee) {
        return employeeMap.put(employeeMap.size() + 1, employee);
    }

    @DeleteMapping
    public Employee deleteEmployee(@RequestParam Integer id) {
        return employeeMap.remove(id);
    }

    @PutMapping
    public Employee updateEmployee(Integer id, Employee employee) {
        return employeeMap.replace(id, employee);
    }
}
