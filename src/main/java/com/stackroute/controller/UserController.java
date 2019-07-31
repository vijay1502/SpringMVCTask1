package com.stackroute.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Scanner;

@Controller
@RequestMapping("/")
public class UserController {
@RequestMapping(method = RequestMethod.GET)

    public String name(ModelMap modelMap){

            modelMap.addAttribute("user","Vijay");
    return "index";
}
}
