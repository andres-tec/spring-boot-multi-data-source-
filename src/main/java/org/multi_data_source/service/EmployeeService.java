package org.multi_data_source.service;

import org.multi_data_source.primary.IEmployeeRepository;
import org.multi_data_source.primary.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    IEmployeeRepository iEmployeeRepository;

    public List<Employee> getAllEmployees(){
        return iEmployeeRepository.findAll();
    }
}
