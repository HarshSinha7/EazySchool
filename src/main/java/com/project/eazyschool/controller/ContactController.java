package com.project.eazyschool.controller;

import com.project.eazyschool.model.Contact;
import com.project.eazyschool.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContactController {
    @Autowired
    private ContactService contactService;

    @RequestMapping(value = "/contact")
    public String contactController() {
        return "contact";
    }

    @PostMapping("/saveMsg")
    public ModelAndView saveMessage(Contact contact) {
        if (!contactService.saveContact(contact)) {
            System.out.println("Not saved the message");
        }
        return new ModelAndView("redirect:/contact");
    }
}
