package com.cos.controller.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // 파일을 리턴
public class HttpRespController {
	
	@GetMapping("/txt")
	public String txt() {
		return "a.txt"; //일반 정적 파일들은 resources/static 폴더 내부가 디폴트 경로이다.
	}
	
	@GetMapping("/musResources")
	public String mustachInResources() {
		return "b.mustache";
		// b.mustache 파일이 resources/static 폴더에 존재하면 b.mustache 파일이 톰캣에 넘겨져서 html로 변환되는 것이 아니라,
		// 브라우저로 다이렉트로 response된다. 브라우저는 mustache 파일을 해석할 줄 모르기때문에 화면에 출력되는 것이 아니라, 다운로드로 이어진다.
	}
	
	@GetMapping("/musTemplates")
	public String mustachInTemplates() {
		return "b"; // 확장자는 없이 파일명만 적는다.(타임리프, 머스태치 파일들은 /main/resources가 기본경로로 스프링부트에서는 viewResolver 설정이 다 되어있다.)
		// b.mustache 파일이 resources/templates 폴더에 존재하면 b.mustache 파일은 톰캣에 넘겨져서 html로 변환후 브라우저로 response
		// 왜그런가요? 라고 묻는다면 스프링부트는 프레임워크(틀이 존재하는)이기 때문이다.
	}
	
	@GetMapping("/jsp")
	public String jsp() {
		return "c";
		/*
		 * 참고로 jasper 라이브러리를 다운받고 viewResolver 세팅을 바꿔주면 위의 /txt, /mus*는 사용할 수 없다(기본경로가 바뀌어버렸기때문)
		 * 여기서도 확장자없이 파일명만 적는데 스프링부트에서는 jsp를 버렸기 때문 폴더들을 만들고 viewResolver 설정을 해주어야한다. 
		 *  jsp 엔진 사용시 src/main/webapp 폴더가 디폴트 경로여서 application.yml에서 다음과 같이 viewResolver를 설정해주어야 한다.
		 *  prefix: /WEB-INF/views/ , suffx: .jsp (자동으로 viewResolver 클래스가 사용되어 최종적으로 src/main/webapp/WEB-INF/views/c.jsp 가 완성된다.)
		 */
				  
	}
	
}
