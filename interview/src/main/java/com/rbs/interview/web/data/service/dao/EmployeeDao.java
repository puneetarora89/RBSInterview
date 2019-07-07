package com.rbs.interview.web.data.service.dao;


import com.rbs.interview.web.model.Employee;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface EmployeeDao {


    public List<Employee> findAll(Sort sort);

    public Employee saveEmployee(Employee task);

    public void deleteEmployee(long id);

    public Employee updateEmployee(Employee task);

    public Employee findById(long id);

    public List<Employee> fetchEmployeeByName(String name, Sort sort);
}
