package com.peggy.assers.control.data;

import com.peggy.assers.service.user.ipml.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class UserControl {

    @Autowired
    UserServiceImpl userService;

    //删除用户
    @RequestMapping("/delUserById/{id}")
    public void delUserById(@PathVariable int id){
        userService.delUser(id);
    }


}
