package com.peggy.assers.control.data;

import com.peggy.assers.pojo.Employee;
import com.peggy.assers.service.department.impll.DepartmentServiceImpl;
import com.peggy.assers.service.employee.impl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeControl {

    @Autowired
    EmployeeServiceImpl employeeService;

    @Autowired
    DepartmentServiceImpl departmentService;

    //添加员工按钮功能
    @GetMapping("/addemp")
    public String toAddPage(Model model){
        model.addAttribute("departments",departmentService.getAllDepartment());
        model.addAttribute("activeUrl","emps");
        return "emps/add";
    }

    //员工添加功能，使用post接收
    @PostMapping("/emp")
    public String addEmp(String last_name,String email,Integer gender,
                         Integer department,String birth){
        // 回到员工列表页面，可以使用redirect或者forward，就不会被视图解析器解析
        Employee employee = new Employee(last_name, email, gender, department, birth);
        employeeService.addEmployee(employee);
        return "redirect:/emps";
    }


    //删除员工
    @GetMapping("/delEmployeeById/{id}")
    public String delEmployeeById(@PathVariable Integer id){
        employeeService.delEmployeeById(id);
        return "redirect:/emps";
    }

    //修改界面跳转
    @GetMapping("/emp/{id}")
    public String toUpData(@PathVariable("id") Integer id,Model model){
        model.addAttribute("departments",departmentService.getAllDepartment());
        model.addAttribute("emp",employeeService.getEmployeeById(id));
        return "emps/update";
    }

    //修改员工
    @PostMapping("/upDataEmployeeById/{id}")
    public String upDataEmployeeById(@PathVariable Integer id,
        String last_name,String email,Integer gender, Integer department,String birth){
        Employee employee = new Employee(id,last_name, email, gender, department, birth);
        employeeService.updateEmpEmployeeById(employee);
        return "redirect:/emps";
    }

    //获取所有的员工
    @RequestMapping("/emps")
    public String emps(Model model) {
        model.addAttribute("emps",employeeService.getAllEmployee());
        model.addAttribute("activeUrl","emps");
        return "emps/list";
    }
}
