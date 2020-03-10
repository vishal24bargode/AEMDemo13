package myproject;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Example {

	@RequestMapping("/")
	String home() {
		return "Spring Application! 123";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(Example.class, args);
	}

}
