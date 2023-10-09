package com.kahandu.weds.repository;

import com.kahandu.weds.domain.company.product.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.math.BigInteger;
import java.util.List;

public interface ProductRepository extends MongoRepository<Product, BigInteger> {

    List<Product> findByPackageName(String packageName);
}
