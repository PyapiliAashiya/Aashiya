package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.bean.Order;
import com.demo.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	OrderService orderService;

	@GetMapping(value="/order/id")
	pubilc Order getOrder(@PathVariable("id")long id) {
		return orderService.getOrderById(id);
		
	}
}

