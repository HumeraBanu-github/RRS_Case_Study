package com.RrsCaseStudy.Resource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.RrsCaseStudy.model.TrainAvailability;

@RestController
@RequestMapping("/train")
public class TrainAvailabilityResource {
	@RequestMapping("/{trainNo}")
	public String dispTrain(@PathVariable("trainNo") int trainNo)
	{
	
	return "Hello World from Train Avaialabilty Service";
        		
	}

}
