package com.config;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	// inject via application.properties
	@Value("${welcome.message:test}")
	private String message = "Hello World";
	
	@Value("${welcome.test:abc}")
	private String test = "This is a test";

	@RequestMapping("/atest")
	public String welcome(Map<String, Object> model) {
		model.put("message", this.test);
		return "index";
	}
	
	@RequestMapping("/testendpoint")
	public String test(Map<String, Object> model) {
		model.put("message", this.test);
		return "index";
	}

}