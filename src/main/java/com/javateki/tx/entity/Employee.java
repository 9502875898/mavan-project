package com.javateki.tx.entity;

import com.javateki.tx.enums.Gender;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@Table
@Entity
@Data
public class Employee {
@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
private  String name;
@Column(unique = true)
private String email;
@Column(length = 60)

private  int age;
@Column(nullable = false,columnDefinition = "text")
private  String designation;
@Column(name = "phone_nuber",unique = true)
private  String  phoneNumber;
@Enumerated
private Gender gender;
}
