package com.cos.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//스프링이  com.cos.blog 패키지 이하를 스캔해서 모든 파일을 메모리에 new 하는것이 아니라
//특정 어노태이션이 붙여있는 클래스파일을 new()해서 스프링 컨테이너에 관리해줍니다.
@RestController
public class BlogControllerTest {
	//http://localhost:8080/test/hello
	@GetMapping("/test/hello")
	public String hollo() {
		return "<h1>hello spring boot </h1>";
	}
}
