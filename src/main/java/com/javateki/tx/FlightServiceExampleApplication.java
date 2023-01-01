package com.javateki.tx;

import com.javateki.tx.dto.FlightBookingAcknowledgment;
import com.javateki.tx.dto.FlightBookingRequest;
import com.javateki.tx.service.FlightBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableTransactionManagement
public class FlightServiceExampleApplication {
	@Autowired
	private FlightBookingService flightBookingService;
	@PostMapping("/bookFlight")
	public FlightBookingAcknowledgment bBookingTicket( @RequestBody FlightBookingRequest request){
	return  flightBookingService.bookFlightTicket(request);
	}

	public static void main(String[] args) {
		SpringApplication.run(FlightServiceExampleApplication.class, args);
	}

}
