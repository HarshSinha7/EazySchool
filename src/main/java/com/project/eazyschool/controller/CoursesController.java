package com.project.eazyschool.controller;

import com.project.eazyschool.model.Holiday;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class CoursesController {

    @RequestMapping(value="/courses")
    public String coursesController(){
    return "courses";
    }
}
