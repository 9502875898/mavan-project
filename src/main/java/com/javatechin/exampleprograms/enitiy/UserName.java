package com.javatechin.exampleprograms.enitiy;

import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@Table(name = "user_name")
@Entity
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
@Data
public class UserName {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private  Long id;

    private  String name;
    private String email;
    private  String mobile;
    private  String gender;
    private  Integer age;
    private  String nationality;
}
