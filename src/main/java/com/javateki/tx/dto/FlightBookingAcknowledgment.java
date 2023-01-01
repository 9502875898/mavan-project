package com.javateki.tx.dto;

import com.javateki.tx.entity.PassengerInfo;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlightBookingAcknowledgment {
    private  String status;
    private  double totalFare;
    private  String pnrNo;
     private PassengerInfo passengerInfo;



}
