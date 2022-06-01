package com.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.demo.bean.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, Long>{

}
