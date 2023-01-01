package com.program.java.Relectionshipsql.entity;

import lombok.*;


import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor(staticName = "people")
@Entity
@Table(name = "persons")
@NoArgsConstructor
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;
}
