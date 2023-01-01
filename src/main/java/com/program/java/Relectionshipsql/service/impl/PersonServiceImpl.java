package com.program.java.Relectionshipsql.service.impl;

import com.program.java.Relectionshipsql.dto.AddressDto;
import com.program.java.Relectionshipsql.dto.PersonDto;
import com.program.java.Relectionshipsql.entity.Address;
import com.program.java.Relectionshipsql.entity.Person;
import com.program.java.Relectionshipsql.repository.PersonRepository;
import com.program.java.Relectionshipsql.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {
@Autowired
    PersonRepository personRepository;

    @Override
    public Object save(PersonDto personDto) {
        Address addres=Address.add(personDto.getAddressDto().getId(),personDto.getAddressDto().getStreet(),personDto.getAddressDto().getCity(),
                personDto.getAddressDto().getState(),personDto.getAddressDto().getZipCode(),personDto.getAddressDto().getCountry()
                ,personDto.getAddressDto().getPerson());
        Person person=Person.people(personDto.getId(),personDto.getName(),personDto.getEmail(),personDto.getPassword(),
                addres);

        personRepository.save(person);
        return person;
    }
}
