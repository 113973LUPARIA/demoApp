package org.example.demoapp.repository;

import org.example.demoapp.domain.Employee;

import java.util.List;

public interface EmployeeRepository {

    Integer count();

    List<Employee> findAll();

    Employee findOne(Long id);

    Employee save(Employee smartphone);

    boolean delete(Long id);

    void deleteAll();

}
