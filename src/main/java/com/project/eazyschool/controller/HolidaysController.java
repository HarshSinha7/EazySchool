package com.project.eazyschool.controller;

import com.project.eazyschool.model.Holiday;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class HolidaysController {
    List<Holiday> holidays = Arrays.asList(
            new Holiday("May 13", "Harsh Birth Day", Holiday.Type.FEDERAL),
            new Holiday("Jan 1", "New Year's Day", Holiday.Type.FESTIVAL),
            new Holiday("Oct 31", "Halloween", Holiday.Type.FESTIVAL),
            new Holiday("Nov 24", "Thanksgiving Day", Holiday.Type.FESTIVAL),
            new Holiday("Dec 25", "Christmas", Holiday.Type.FESTIVAL),
            new Holiday("Jan 17", "Martin Luther King Jr. Day", Holiday.Type.FEDERAL),
            new Holiday("July 4", "Independence Day", Holiday.Type.FEDERAL),
            new Holiday("Sep 5", "Labor Day", Holiday.Type.FEDERAL),
            new Holiday("Nov 11", "Veterans Day", Holiday.Type.FEDERAL)
    );
    @RequestMapping(value="/holidays")
    public void holidayController(Model model){
        List<Holiday> federal=new ArrayList<>();
        List<Holiday> festival=new ArrayList<>();
        for(Holiday holiday:holidays){
            if(holiday.getType()==Holiday.Type.FEDERAL){
                federal.add(holiday);
            }
            else{
                festival.add(holiday);
            }
        }
        model.addAttribute("FEDERAL", federal);
        model.addAttribute("FESTIVAL", festival);
    }
}
