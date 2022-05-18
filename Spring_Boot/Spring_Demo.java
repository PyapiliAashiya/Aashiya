package market.com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Spring_Demo {
   @GetMapping(value="/messege")
  int messege() {
	return 9; 
	}

}
