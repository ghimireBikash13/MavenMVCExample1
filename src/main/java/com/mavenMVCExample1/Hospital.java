package com.mavenMVCExample1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Hospital {

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String showHospital() {
		System.out.println("New patient info");
		return "patient-info";
	}

}
