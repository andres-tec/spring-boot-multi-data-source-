package org.multi_data_source.contoller;

import org.multi_data_source.primary.entity.Employee;
import org.multi_data_source.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/employees/test")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping(value = "/getAll")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

}
