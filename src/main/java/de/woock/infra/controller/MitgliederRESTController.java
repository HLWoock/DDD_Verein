package de.woock.infra.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class MitgliederRESTController {

	@GetMapping("/mitglied/id/{id}/name")
	public String nameDesMitgliedes(@PathVariable String id) {
		return id.equals("hs") ? "Kristina Woock" : 
			                     "";
	}
}
