package com.project.eazyschool.service;

import com.project.eazyschool.model.Contact;
import org.springframework.stereotype.Service;

@Service
public class ContactService {
    public boolean saveContact(Contact contact){
        System.out.println(contact.getMessage());
        System.out.println(contact.getEmail());
        return true;
    }
}
