package com.psl.springtrg.springrest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// localhost:8090/api/hello?user=Preeti


/*@Controller
@ResponseBody
@Configuration
@ComponentSacn
*
*
*/

@RestController 
@RequestMapping("/api")
public class HelloController {
	
	
	
	@GetMapping("/hello")
	public String getHelloMessage(
			@RequestHeader(name = "encrpt", required = false) String encrpt, 
			@RequestParam(name = "user", required =false) String userName) {
		System.out.println(" invoking getMessage");
		if(userName !=null)
			return " Welcome"+userName+" to the Spring Rest!";
		return " Welcome to the Spring Rest!\n Encript header "+encrpt;
	}

	@GetMapping("/msg/{type}")
	public String getMessage(@PathVariable(name = "type", required = true) String type) {
		switch (type.toLowerCase()) {
		case "noon":
			return "Good Afternoon!";
			
		case "morning":	
			return "Good Morning!";

		default:
			return "Good Day!"; 
		}
	}
	
}
