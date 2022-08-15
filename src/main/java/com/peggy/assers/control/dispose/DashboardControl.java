package com.peggy.assers.control.dispose;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class DashboardControl {
    @RequestMapping("/dashboard")
    public String dashboard(Model model, HttpServletRequest request) {
        if (request.getSession().getAttribute("user") != null) {
            model.addAttribute("activeUrl","main.html");
            return "dashboard";
        } else {
            model.addAttribute("msg", "非法访问，请重新登录");
            return "index";
        }
    }
}
