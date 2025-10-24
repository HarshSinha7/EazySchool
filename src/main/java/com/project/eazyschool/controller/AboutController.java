package com.project.eazyschool.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class AboutController {

    @RequestMapping(value="/about")
    public String aboutController(){
        return "about";
    }
}
