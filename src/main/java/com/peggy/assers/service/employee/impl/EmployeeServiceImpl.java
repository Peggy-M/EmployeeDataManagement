package com.peggy.assers.service.employee.impl;

import com.peggy.assers.mapper.employee.EmployeeMapper;
import com.peggy.assers.pojo.Employee;
import com.peggy.assers.service.employee.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;


    @Override
    public List<Employee> getAllEmployee() {
        return employeeMapper.getAllEmployee();
    }

    @Override
    public Employee getEmployeeById(Integer id) {
        return employeeMapper.getEmployeeById(id);
    }

    @Override
    public void delEmployeeById(Integer id) {
        employeeMapper.delEmployeeById(id);
    }

    @Override
    public void updateEmpEmployeeById(Employee employee) {
        employeeMapper.updateEmpEmployeeById(employee);
    }

    @Override
    public void addEmployee(Employee employee) {
        employeeMapper.addEmployee(employee);
    }
}
