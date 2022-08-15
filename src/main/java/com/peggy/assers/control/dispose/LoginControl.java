package com.peggy.assers.control.dispose;

import com.peggy.assers.mapper.user.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LoginControl {

    @Autowired
    UserMapper userMapper;

    //用户登录控制
    @RequestMapping("/logincontrol")
    public String index(String username, String password, Model model, HttpSession session){
        System.out.println("接收：username:"+username+"  password:"+password);
        String datapassword=userMapper.queryUserAdmin(username);
        if (datapassword!=null){
            if(password.equals(datapassword)){
                session.setAttribute("user",username);
                return "redirect:/dashboard";
            }else{
                model.addAttribute("msg","抱歉用户【"+username+"】您的密码错误");
                System.out.println("获取的添加到浏览器中的数据:"+model.getAttribute("msg"));
                return "index";
            }
        }else{
            model.addAttribute("msg","用户名不存在,请注册用户,请重新登录");
            return "index";
        }
    }


    //用户注销
    @GetMapping("/user/loginOut")
    public String loginOut(HttpSession session,Model model){
        session.invalidate();
        return "redirect:/index.html";
    }
}
