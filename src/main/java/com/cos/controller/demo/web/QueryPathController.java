package com.cos.controller.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QueryPathController {
	
	@GetMapping("/chicken")
	public String chicken(String type) {
		return type+" 배달 갑니다.(queryString)";
	}
	
	@GetMapping("/chicken/{type}")
	public String chickenPath(@PathVariable String type) {
		return type+" 배달갑니다.(path variable)";
	}
	
}
