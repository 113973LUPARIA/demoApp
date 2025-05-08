package org.example.demoapp.service;

import org.example.demoapp.domain.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    Integer count();

    List<Employee> findAll();

    Employee findOne(Long id);

    Optional<Employee> findOneOptional(Long id);

    Employee save(Employee employee);

    boolean delete(Long id);

    void deleteAll();
}
