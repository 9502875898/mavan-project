package com.program.java.Relectionshipsql.dto;

import com.program.java.Relectionshipsql.entity.Address;
import com.program.java.Relectionshipsql.entity.Person;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor(staticName = "people")

public class PersonDto {
    private Long id;
    private String name;
    private String email;
    private String password;
    private AddressDto addressDto;



}
