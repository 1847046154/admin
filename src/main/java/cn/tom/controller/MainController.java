package cn.tom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello ....";
    }
    @RequestMapping({"/", "/index"})
    public String index() {
        return "main";
    }
}
