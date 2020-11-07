package org.example.site.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @RequestMapping("/test.do")
    public String home(Model model) {
        model.addAttribute("test", "hello world!");

        return "test";
    }

    @RequestMapping("/toast.do")
    public String home1() {
        return "toastGrid/home";
    }
}
