package com.example.ldap.controller;

import com.example.ldap.entity.Person;
import com.example.ldap.interfaces.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private PersonRepository personRepository;

    @GetMapping("/")
    public String getall(){
        personRepository.findAll().forEach(person -> System.out.println( person.toString()));
        return "1";
    }

    @GetMapping("/save")
    public String save(){
        Person person=new Person();
        person.setCommonName("ldapuser3");
        person.setUid("ldapuser3");
//        person.setId("uid=ldapuser3,ou=People");
        person.setSuerName("ldapuser3");
        person.setUserPassword("1234");
        personRepository.save(person);
        return "2";
    }
}
