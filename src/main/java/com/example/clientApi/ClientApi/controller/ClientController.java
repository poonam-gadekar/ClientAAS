package com.example.clientApi.ClientApi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientApi")
public class ClientController {

	@GetMapping
	public String getcall() {
		
		return "Hello..welcome to the pune";
		
	}
	
	
}
