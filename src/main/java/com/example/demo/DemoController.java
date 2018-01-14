package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@Autowired
	TicketJpa jpa;

	@GetMapping("/ticket")
	public Ticket ticket(@RequestParam String id){
		return jpa.findOne(id);
	}

	@PostMapping("/ticket")
	public Ticket addTicket(@RequestParam String id, @RequestParam String name){
		return jpa.save(new Ticket(id, name));
	}
}
