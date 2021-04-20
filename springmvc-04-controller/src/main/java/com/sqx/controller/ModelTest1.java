package com.sqx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class ModelTest1 {

    @RequestMapping("/m1/t1")
    public String test1(HttpServletRequest req, HttpServletResponse resp) {

        HttpSession session = req.getSession();

        System.out.println(session.getId());

        return "test";

    }

    @RequestMapping("/m1/t2")
    public String test2(Model model) {

        model.addAttribute("msg","ModelTest1");

        //  转发，重定向 默认不使用视图解析器
        //  "/"定位到web目录下
        return "forward:/WEB-INF/jsp/test.jsp";
    }

}
