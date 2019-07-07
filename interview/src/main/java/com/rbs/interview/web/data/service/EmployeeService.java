package com.rbs.interview.web.data.service;


import com.rbs.interview.web.data.repository.EmployeeRepository;
import com.rbs.interview.web.data.service.dao.EmployeeDao;
import com.rbs.interview.web.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("employeeService")
public class EmployeeService implements EmployeeDao {

    @Qualifier("employeeRepository")
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> findAll(Sort sort) {
        return employeeRepository.findAll(sort);
    }

    @Override
    public List<Employee> fetchEmployeeByName(String name, Sort sort) {
        return employeeRepository.findByEmployeeNameContaining(name, sort);
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(long id) {
        Employee employee = employeeRepository.findByEmployeeId(id);
        employeeRepository.delete(employee);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        employee = employeeRepository.save(employee);
        return employee;
    }

    @Override
    public Employee findById(long id) {
        return employeeRepository.findByEmployeeId(id);
    }

}
