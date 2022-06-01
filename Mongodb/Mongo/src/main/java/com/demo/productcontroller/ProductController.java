package com.demo.productcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.bean.Product;
import com.demo.productservice.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService  productService;

	@PostMapping(value="/add")
	Product addProduct(@RequestBody Product prod)
	{
		Product p=productService.addProduct(prod);
		return p;
	
	}
}
