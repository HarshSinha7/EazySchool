package com.project.eazyschool.controller;

import com.project.eazyschool.model.Holiday;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//import static com.sun.beans.introspect.PropertyInfo.Name.required;

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
    @RequestMapping(value="/holidays/{display}")
    public String holidayController(Model model, @PathVariable String display){

        List<Holiday> federalList=new ArrayList<>();
        List<Holiday> festivalList=new ArrayList<>();
        for(Holiday holiday:holidays){
            if(holiday.getType()==Holiday.Type.FEDERAL){
                federalList.add(holiday);
            }
            else{
                festivalList.add(holiday);
            }
        }
        if(display!=null && display.equals("all")){
            model.addAttribute("federal",true);
            model.addAttribute("festival",true);
        }
        else if(display!=null && display.equals("federal")){
            model.addAttribute("federal",true);
            model.addAttribute("festival",false);
        }
        else if(display!=null && display.equals("festival")){
            model.addAttribute("federal",false);
            model.addAttribute("festival",true);
        }
        else{
            model.addAttribute("federal",false);
            model.addAttribute("festival",false);
        }
        model.addAttribute("FEDERAL", federalList);
        model.addAttribute("FESTIVAL", festivalList);
        return "holidays";
    }
}
