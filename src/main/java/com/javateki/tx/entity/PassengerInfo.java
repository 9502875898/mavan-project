package com.javateki.tx.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "PASSENGER_INFO")
@Entity
@Data
public class PassengerInfo {
@Id
    @GeneratedValue
    private Long pid;
private  String name;
private String email;
private  String source;
private String destination;
@JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-mm-yyyy")
private Date travelDate;
private String pickupTime;
private  String arrivalTime;
private  double fare;
}
