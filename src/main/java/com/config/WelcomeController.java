package com.config;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {

	// inject via application.properties
	/*
	@Value("${welcome.message:test}")
	private String message = "Hello World";
	*/

	// Without response body tag, the controller attempts to return a view.
	@ResponseBody
	@RequestMapping(value="/response/submit", method=RequestMethod.POST)
	public String welcome(@RequestBody SurveyResponse surveyResponse) {
		// do something with the response.....
		
		
		System.out.print(surveyResponse.toString());
		return surveyResponse.toString();
	}

}