package com.javateki.tx.service;

import com.javateki.tx.dto.FlightBookingAcknowledgment;
import com.javateki.tx.dto.FlightBookingRequest;
import com.javateki.tx.entity.PassengerInfo;
import com.javateki.tx.entity.PaymentInfo;
import com.javateki.tx.repository.PassengerInfoRepository;
import com.javateki.tx.repository.PaymentInfoRepository;
import com.javateki.tx.util.PaymentUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.UUID;

@Service
public class FlightBookingService {
@Autowired
    private PassengerInfoRepository passengerInfoRepository;
    @Autowired
    private PaymentInfoRepository paymentInfoRepository;
    @Transactional
  public FlightBookingAcknowledgment bookFlightTicket(FlightBookingRequest request){
        PassengerInfo passengerInfo=request.getPassengerInfo();
       passengerInfo= passengerInfoRepository.save(passengerInfo);

        PaymentInfo paymentInfo=request.getPaymentInfo();

        PaymentUtils.validateCreditLimit(paymentInfo.getAccountNo(),passengerInfo.getFare());
        paymentInfo.setPassengerId(passengerInfo.getPid());
        paymentInfo.setAmount(passengerInfo.getFare());
        paymentInfoRepository.save(paymentInfo);
        return  new FlightBookingAcknowledgment("SUCCESS",passengerInfo.getFare(), UUID.randomUUID().toString().split("-")[0],passengerInfo);



}
}
