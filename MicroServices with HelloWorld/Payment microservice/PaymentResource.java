package com.RrsCaseStudy.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentResource {
	@RequestMapping("/payment")
	public String dispReservation()
	{
		return "Hello World from Payment Service";
	}

}
