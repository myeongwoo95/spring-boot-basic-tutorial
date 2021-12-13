package com.cos.controller.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cos.controller.demo.domain.User;

@RestController
public class HttpResponseJsonController {

	@GetMapping("/resp/json")
	public String respJson() {
		return "{\"username\":\"cos\"}"; // 반환 타입은 String, 데이터 형식은 json, 브라우저에선 json으로 출력
	}
	
	@GetMapping("/resp/json/object")
	public User respJsonObject() {
		User user = new User();
		user.setUsername("홍길동"); 
		return user;
		//1. User 객체를 return했는데 브라우저에선 JSON이 출력됨 MessageConverter가 자동으로 변환해주었기 때문이다.
		//2. @RestController 일때만 MessageConverter가 작동한다.
	}
	
}
