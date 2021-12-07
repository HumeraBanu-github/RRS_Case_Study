package com.RrsCaseStudy.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reservation")
public class ReservationResource {
	@RequestMapping("/train")
	public String dispReservation()
	{
		return "Hello World from Reservation Service";
	}

}
