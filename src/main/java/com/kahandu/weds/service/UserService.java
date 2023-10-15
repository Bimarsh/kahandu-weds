package com.kahandu.weds.service;

import com.kahandu.weds.domain.company.Company;
import com.kahandu.weds.domain.company.product.Product;
import com.kahandu.weds.domain.user.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    User saveUser(User user);

    List<Product> getProductsOfUser(String userId);

    List<Company> getCompanyOfUser(String userId);
}
