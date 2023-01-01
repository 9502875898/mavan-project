package com.javateki.tx.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "PAYMENT_INFO")
@Entity
public class PaymentInfo {
@Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2",strategy = "org.hibernate.id.UUIDGenerator")
    private  String paymentId;
private String accountNo;
private  double amount;
private  String cardType;
private  Long passengerId;
}
