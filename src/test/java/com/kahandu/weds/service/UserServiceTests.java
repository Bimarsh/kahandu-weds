package com.kahandu.weds.service;

import com.kahandu.weds.TestDataHelper;
import com.kahandu.weds.domain.company.product.Product;
import com.kahandu.weds.domain.user.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class UserServiceTests {

    @Autowired
    UserServiceImpl userServiceImpl;


    @Test
    public void testSaveUser()
    {
        User user = TestDataHelper.createUser();
        List<Product> productList = TestDataHelper.createProducts();
        user.setUserProductList(productList);

        User persistedUser = userServiceImpl.saveUser(user);
        Assertions.assertNotNull(persistedUser);
        Assertions.assertNotNull(persistedUser.getId());
        Assertions.assertNotNull(persistedUser.getUserProductList().get(0).getId());
    }
}
