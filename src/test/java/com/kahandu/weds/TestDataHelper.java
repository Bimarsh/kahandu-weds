package com.kahandu.weds;

import com.kahandu.weds.domain.company.product.Product;
import com.kahandu.weds.domain.user.User;
import org.instancio.Instancio;
import org.instancio.Model;
import org.instancio.Select;

import java.util.List;
import java.util.Random;

public class TestDataHelper {

    private static Random random = new Random();
    public static User createUser() {
        String generatedString = generateRandomUser();

        User user = new User();
        user.setEmail(generatedString + "@test.com");
        user.setFirstName(generatedString);
        user.setLastName(generatedString);
        return user;
    }


    public static String generateRandomUser() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 4;

        return random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }


    public static List<Product> createProducts()
    {
        Model<Product> productsModel = Instancio.of(Product.class).ignore(Select.field("id")).toModel();
        List<Product> products = Instancio.ofList(productsModel).size(2).create();
        return products;
    }
}
