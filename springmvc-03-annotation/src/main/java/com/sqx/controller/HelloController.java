package com.sqx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    // 真实访问地址：http://localhost:8080/hello
    @RequestMapping("/hello")
    public String hello(Model model){

        // 想模型中添加属性msg与值，可以再页面中取出并渲染
        model.addAttribute("msg","Hello,SpringMVCAnnotation");

        // WEB-INF/jsp/hello.jsp
        return "hello";// 会被视图解析器解析
    }

}
