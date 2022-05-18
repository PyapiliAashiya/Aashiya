package ecommerapp.com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestMessege {
	@GetMapping(value="/showmessege")
	String Messege() {
		return "hi How are you";
	}
}
