package com.kahandu.weds.repository;

import com.kahandu.weds.domain.company.product.Product;
import com.kahandu.weds.domain.user.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.math.BigInteger;
import java.util.List;

public interface ProductRepository extends MongoRepository<Product, String> {

    List<Product> findByPackageName(String packageName);

}
