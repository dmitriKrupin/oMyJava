package ru.dkrupin.project.contacts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContactsController {
    @GetMapping("/contacts.html")
    public String getAllProjects() {
        return "HTML/contacts";
    }
}
