package com.program.java.Relectionshipsql.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor(staticName = "add")
@Entity
@Table(name = "addresses")
@NoArgsConstructor
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String country;
   @OneToOne(cascade = CascadeType.ALL)

    /*@JoinColumn(name = "person_id")*/
    private Person person;
}
