package com.Spring_Security_App.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityRestController {
	
	@GetMapping("/login-check")
	public String getLogin() {
		return "Login Sucessfully!";
	}
	
	@GetMapping("/transfer")
	public String transfer() {
		return "100$ got transfered sucessfully!";
	}
	
	@GetMapping("/balance")
	public String checkBalance() {
		return "Your total balance is .............!";
	}
	
	@GetMapping("/contact")
	public String contactUs() {
		return "Thank you for choosing our service!";
	}

}
