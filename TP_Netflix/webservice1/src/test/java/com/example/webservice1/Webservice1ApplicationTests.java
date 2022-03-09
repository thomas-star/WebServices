package com.example.webservice1;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Webservice1ApplicationTests {

	@GetMapping("/")
	public String sayHello(){
		return "Hello !";
	}
}
