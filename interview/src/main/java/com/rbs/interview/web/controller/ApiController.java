package com.rbs.interview.web.controller;


import com.rbs.interview.web.data.service.EmployeeService;
import com.rbs.interview.web.model.Employee;
import com.rbs.interview.web.utils.SortingUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(path = "/get-employees/{sort}")
    public List<Employee> getAllTasks(@PathVariable("sort") String sort, @RequestParam(required = false, defaultValue = "", value="name") String name){
        if(name == null) {
            name="";
        }
       // List<Employee> taskList = employeeService.findAll(SortingUtils.orderBy(sort));
        List<Employee> taskList = employeeService.fetchEmployeeByName(name, SortingUtils.orderBy(sort));
        return taskList;
    }

    @RequestMapping(path = "/add-employee", method = RequestMethod.PUT)
    public Employee addTask(){
        Employee employee = new Employee();
        employee.setEmployeeName("Test");
        employee.setSalary(34000);
        Employee task1 = employeeService.saveEmployee(employee);
        return task1;
    }

    @RequestMapping(path = "/delete-employee/{taskId}")
    public boolean deleteTask(@PathVariable("taskId") Long taskId){
        employeeService.deleteEmployee(taskId);
        return true;
    }



}
