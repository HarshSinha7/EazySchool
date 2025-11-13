package com.project.eazyschool.controller;

import com.project.eazyschool.model.Contact;
import com.project.eazyschool.service.ContactService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Controller
public class ContactController {
    @Autowired
    private ContactService contactService;

    @RequestMapping(value = "/contact")
    public String contactController(Model model) {
        model.addAttribute("contact", new Contact());
        return "contact.html";
    }

    @PostMapping("/saveMsg")
    public String saveMessage(@Valid @ModelAttribute("contact")Contact contact, Errors errors) {
        if (errors.hasErrors()) {
            log.warn(errors.toString());
            return "contact";
        }
        return "redirect:/contact";
    }
}
