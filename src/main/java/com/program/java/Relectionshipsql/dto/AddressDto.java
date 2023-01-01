package com.program.java.Relectionshipsql.dto;

import com.program.java.Relectionshipsql.entity.Person;
import lombok.*;


@Setter
@Getter
@NoArgsConstructor
@Data
@AllArgsConstructor(staticName = "add")
public class AddressDto {
    private Long id;
    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String country;

    private Person person;
}
