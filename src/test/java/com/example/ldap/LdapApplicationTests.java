package com.example.ldap;

import com.example.ldap.entity.Person;
import com.example.ldap.interfaces.PersonRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LdapApplicationTests {
    @Autowired
    private PersonRepository personRepository;

    @Test
    public void contextLoads() {
    }

    @Test
    public void findAll() {
//        Iterable<Person> all = personRepository.findAll();
//        System.out.println("test");
//        while (all.iterator().hasNext()){
//            System.out.println(all.iterator().next().toString());
//        }
                personRepository.findAll().forEach(person -> { System.out.println(person); });
    }

}
