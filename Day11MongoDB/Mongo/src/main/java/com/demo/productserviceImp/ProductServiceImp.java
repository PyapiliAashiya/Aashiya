package com.demo.productserviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.bean.Product;
import com.demo.productservice.ProductService;
import com.demo.repository.ProductRepository;

@Service
public class ProductServiceImp implements ProductService{

	@Autowired
	ProductRepository productRepository;
	
	@Override
	public Product addProduct(Product prod) {
		Product p=productRepository.save(prod);
		return prod;
	
}
}
