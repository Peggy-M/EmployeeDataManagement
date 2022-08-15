package com.peggy.assers;

import com.peggy.assers.pojo.Department;
import com.peggy.assers.pojo.Employee;
import com.peggy.assers.service.department.impll.DepartmentServiceImpl;
import com.peggy.assers.service.employee.impl.EmployeeServiceImpl;
import com.peggy.assers.service.user.ipml.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class AssersApplicationTests {

	@Autowired
	DepartmentServiceImpl departmentService;

	@Autowired
	EmployeeServiceImpl employeeService;
	@Autowired
	UserServiceImpl userService;

	@Test
	void contextLoads() {
/*		List<Department> allDepartment = departmentService.getAllDepartment();
		allDepartment.forEach(System.out::println);*/
		System.out.println("===============================");
		List<Employee> allEmployee = employeeService.getAllEmployee();
		allEmployee.forEach(System.out::println);
	}

	@Test
	void UserSqlTest(){
		userService.queryUser().forEach(System.out::println);
	}

	@Test
	void EmployeeTest(){
		employeeService.delEmployeeById(1006);
	}

	@Test
	void EmployeeTest2(){
		Employee employee = new Employee("特兰克斯","1931135322@qq.com",0,103,"2021-09-8 15:04:39");
		employeeService.addEmployee(employee);
	}
	@Test
	void EmployeeTest3(){
		employeeService.getAllEmployee().forEach(System.out::println);
	}
	@Test
	void EmployeeTest4(){
		System.out.println(employeeService.getEmployeeById(1001));
	}

	@Test
	void EmployeeTest5(){
		Employee employee = new Employee(1001,"比比东", "3204e34@qq.com", 0, 105, "1999-03-06 15:04:37");
		employeeService.updateEmpEmployeeById(employee);
	}

	@Test
	void EmloyeeTest6(){
		System.out.println("=============================================");
		employeeService.getAllEmployee().forEach(System.out::println);
	}

}
