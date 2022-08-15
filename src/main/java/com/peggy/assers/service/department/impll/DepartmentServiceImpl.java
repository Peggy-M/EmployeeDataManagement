package com.peggy.assers.service.department.impll;

import com.peggy.assers.mapper.department.DepartmentMapper;
import com.peggy.assers.pojo.Department;
import com.peggy.assers.service.department.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    DepartmentMapper departmentMapper;


    @Override
    public List<Department> getAllDepartment() {
        return departmentMapper.getAllDepartment();
    }

    @Override
    public Department getDepartmentById(Integer id) {
        return departmentMapper.getDepartmentById(id);
    }
}
