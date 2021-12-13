package com.cos.controller.demo.web;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller // File을 응답하는 컨트롤로
@RestController // Data를 응답하는 컨트롤러
public class HttpController {
	
	@GetMapping("/get")
    public String get() {
    	return "<h1>get요청됨</h1>";
    }
    
	@PostMapping("/post")
    public String post() {
		return "post요청됨";
    }
    
	@PutMapping("/put")
    public String put() {
		return "put요청됨";
    }
    
	@DeleteMapping("/delete")
    public String delete() {
		return "delete요청됨";
    }
	
}
