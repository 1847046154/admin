package cn.tom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TeachController {
    @RequestMapping("/course/index")
    public String course_index() {
        return "course/index";
    }
    @RequestMapping("/chapter/index")
    public String chapter_index() {
        return "chapter/index";
    }
    @RequestMapping("/work/index")
    public String work_index() {
        return "work/index";
    }
    @RequestMapping("/money/index")
    public String money_index() {
        return "money/index";
    }

}
