package com.program.java.Relectionshipsql.controller;

import com.program.java.Relectionshipsql.dto.PersonDto;
import com.program.java.Relectionshipsql.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PersonController {
    @Autowired
    PersonService personService;
    @PostMapping("/save")
    public Object save(@RequestBody PersonDto personDto){
        return  personService.save(personDto);
    }
}
