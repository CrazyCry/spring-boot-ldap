package com.example.ldap.interfaces;

import com.example.ldap.entity.Person;
import org.springframework.data.repository.CrudRepository;

import javax.naming.Name;

public interface PersonRepository  extends CrudRepository<Person, Name> {
}
