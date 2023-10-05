package com.kahandu.weds;

import com.kahandu.weds.domain.company.Company;
import com.kahandu.weds.domain.company.product.Product;
import com.kahandu.weds.domain.user.User;
import com.kahandu.weds.repository.UserRepository;
import net.bytebuddy.utility.RandomString;
import org.instancio.FieldSelectorBuilder;
import org.instancio.Instancio;
import org.instancio.Model;
import org.instancio.Select;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Random;

@DataMongoTest
//@SpringBootTest
class KahanduWedsApplicationTests {

    private static Random random = new Random();


    @Autowired
    UserRepository userRepository;

    @Test
    void contextLoads() {
    }

    @Test
    public void addUser() {
        User user = createUser();
        userRepository.save(user);
    }


    @Test()
    public void addUniqueEmailUser() {
        User user = createUser();
        userRepository.save(user);

        try {
            userRepository.save(user);
        } catch (Exception e) {
            user.setEmail(generateRandomUser() + "@test.com");
        }
    }


    @Test
    public void addUserProducts(){
        User user = createUser();
        user.setUserProductList(createProducts());
        userRepository.save(user);
    }


    private User createUser() {
        String generatedString = generateRandomUser();

        User user = new User();
        user.setEmail(generatedString + "@test.com");
        user.setFirstName(generatedString);
        user.setLastName(generatedString);
        return user;
    }


    private String generateRandomUser() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 4;

        return random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }


    private List<Product> createProducts()
    {
        Model<Product> productsModel = Instancio.of(Product.class).ignore(Select.field("id")).toModel();
        List<Product> products = Instancio.ofList(productsModel).size(2).create();
        return products;
    }

}
