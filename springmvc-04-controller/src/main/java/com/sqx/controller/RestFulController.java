package com.sqx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RestFulController {

    //原来的：  http://localhost:8080/add?a=1&b=2
    //RestFul:  http://localhost:8080/add/1/2  相对安全，简洁

    @RequestMapping("/add1/{a}/{b}")
    public String test1(@PathVariable int a, @PathVariable int b, Model model) {
        int res = a + b;
        model.addAttribute("msg", "结果1为" + res);

        return "test";
    }

    //@RequestMapping(value = "/add2/{a}/{b}",method = RequestMethod.GET)
    @GetMapping("/add2/{a}/{b}")  // 等价于上一行
    public String test2(@PathVariable int a, @PathVariable int b, Model model) {
        int res = a + b;
        model.addAttribute("msg", "结果2为" + res);

        return "test";
    }

}
