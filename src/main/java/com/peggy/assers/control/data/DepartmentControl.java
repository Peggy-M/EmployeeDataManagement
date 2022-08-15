package com.peggy.assers.control.data;

import com.peggy.assers.mapper.department.DepartmentMapper;
import com.peggy.assers.pojo.Department;
import com.peggy.assers.service.department.impll.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class DepartmentControl implements DepartmentMapper {

    @Autowired
    DepartmentServiceImpl departmentService;

    @Override
    public List<Department> getAllDepartment() {
        return departmentService.getAllDepartment();
    }

    @Override
    public Department getDepartmentById(Integer id) {
        return departmentService.getDepartmentById(id);
    }
}
