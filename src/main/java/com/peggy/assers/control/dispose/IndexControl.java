package com.peggy.assers.control.dispose;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexControl {
    @RequestMapping({"/","/login","/index"})
    public String index(){
        return "index";
    }
}
