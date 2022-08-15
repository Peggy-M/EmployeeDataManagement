package com.peggy.assers.mapper.department;

import com.peggy.assers.pojo.Department;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DepartmentMapper {
    //获取所有的部门
    List<Department> getAllDepartment();
    //按照id查询部门
    Department getDepartmentById(Integer id);

}
