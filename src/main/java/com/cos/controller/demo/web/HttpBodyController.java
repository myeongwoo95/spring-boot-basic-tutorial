package com.cos.controller.demo.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cos.controller.demo.domain.User;

@RestController
public class HttpBodyController {
	private static final Logger log = LoggerFactory.getLogger(HttpBodyController.class);

	@PostMapping("/body1")
	public String xwwwform(String username) {
		log.info(username); //username은 key값임
		return "key=value 전송옴";
	}
	
	@PostMapping("/body2")
	public String plaintext(@RequestBody String data) {
		log.info(data); 
		return "text/plain 전송옴";
	}
	
	@PostMapping("/body3")
	public String applicationjson(@RequestBody String data) {
		log.info(data); // 요청데이터는 { "username" : "cos입니다" }로 출력결과도 동일하다. 이런경우 데이터를 핸들링할 수 없다.
		return "json 전송옴";
	}
	
	@PostMapping("/body4")
	public String applicationjsonToObject(@RequestBody User user) {
		log.info(user.getUsername()); //요청데이터는 { "username" : "cos입니다" }로 출력결과는 cos입니다. JSON을 객체에 바인딩하여 데이터를 핸들링할 수 있다.
		return "json 전송옴";
	}
}
