package com.peggy.assers.mapper.employee;

import com.peggy.assers.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface EmployeeMapper {
    //添加员工
    void addEmployee(Employee employee);
    //根据id删除用户
    void delEmployeeById(Integer id);
    //修改更新员工
    void updateEmpEmployeeById(Employee employee);
    //获取所有的员工信息
    List<Employee> getAllEmployee();
    //按照id查询员工
    Employee getEmployeeById(Integer id);
}
