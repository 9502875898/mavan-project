package com.javatechin.exampleprograms.dto;

import com.sun.istack.NotNull;
import lombok.*;
import org.hibernate.annotations.Check;

import javax.persistence.*;
@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor(staticName = "build")

public class UserRequest {

    private  Long id;
    @NotNull
    private  String name;

    private String email;
    private  String mobile;

    private  String gender;

    private  Integer age;
    private  String nationality;

}
