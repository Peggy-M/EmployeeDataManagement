package com.peggy.assers.service.department;

import com.peggy.assers.pojo.Department;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DepartmentService {
    //获取所有的部门
    List<Department> getAllDepartment();
    //按照id查询部门
    Department getDepartmentById(Integer id);

}
