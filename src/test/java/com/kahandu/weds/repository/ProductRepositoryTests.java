package com.kahandu.weds.repository;

import com.kahandu.weds.TestDataHelper;
import com.kahandu.weds.domain.company.product.Product;
import com.kahandu.weds.domain.user.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.util.Assert;

import java.util.List;

@DataMongoTest
public class ProductRepositoryTests {


    @Autowired
    ProductRepository productRepository;

    @Autowired
    UserRepository userRepository;


    @Test
    public void testProductPersistence()
    {
        User user = TestDataHelper.createUser();
        List<Product> productList = TestDataHelper.createProducts();
        user.setUserProductList(productList);
        userRepository.save(user);

        User userFromRepo = userRepository.findByEmail(user.getEmail());
        Assert.notNull(userFromRepo,"User from db cannot be null");

        Assert.noNullElements(user.getUserProductList(),"User products cannot be null");
    }


    @Test
    public void testProductRepository()
    {
        List<Product> productList = TestDataHelper.createProducts();
        productRepository.saveAll(productList);
        Product productFromRepo = productRepository.findById(productList.get(0).getId()).get();
        Assert.notNull(productFromRepo, "product from db cannot be null");
    }

}
