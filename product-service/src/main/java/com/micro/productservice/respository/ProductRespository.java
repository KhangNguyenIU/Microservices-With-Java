package com.micro.productservice.respository;

import com.micro.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRespository extends MongoRepository<Product,String> {
}
