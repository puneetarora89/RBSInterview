package com.rbs.interview.web.data.repository;

import com.rbs.interview.web.model.Employee;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("employeeRepository")
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Employee findByEmployeeId(Long id);
    List<Employee> findByEmployeeNameContaining(String name, Sort sort);

}
