package com.kahandu.weds.service;


import com.kahandu.weds.domain.company.Company;
import com.kahandu.weds.domain.company.product.Product;
import com.kahandu.weds.domain.user.User;
import com.kahandu.weds.repository.ProductRepository;
import com.kahandu.weds.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    ProductRepository productRepository;

    @Override
    public User saveUser(User user) {

        if (!user.getUserProductList().isEmpty()) {
            List<Product> products = productRepository.saveAll(user.getUserProductList());
            user.setUserProductList(products);
        }

        return userRepository.save(user);
    }

    @Override
    public List<Product> getProductsOfUser(String userId) {
        return userRepository.findById(userId).get().getUserProductList();
    }

    @Override
    public List<Company> getCompanyOfUser(String userId) {
        return userRepository.findById(userId).get().getCompanies();
    }
}
