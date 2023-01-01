package com.javateki.tx.dto;

import com.javateki.tx.entity.PassengerInfo;
import com.javateki.tx.entity.PaymentInfo;
import lombok.*;

@Data

@NoArgsConstructor
@AllArgsConstructor
public class FlightBookingRequest {
   private PassengerInfo passengerInfo;
   private PaymentInfo paymentInfo;
}
