package com.kahandu.weds.controller;


import com.kahandu.weds.domain.company.Company;
import com.kahandu.weds.domain.company.product.Product;
import com.kahandu.weds.domain.user.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserEntityController {



    @PostMapping("/user")
    public void createUser(@RequestBody User userEntity)
    {

    }


    @PostMapping("/user/{id}/company")
    public void createCompany(@RequestBody List<Company> companies, @RequestParam("id")Integer id)
    {    //TODO: Validate user role is business type
        //TODO:Associate user with company
        //TODO: Assign keywords to this company, so that it is more search able
    }

    @PostMapping("/user/{id}/product")
    public void createProduct(@RequestBody List<Product> companies, @RequestParam("id")Integer id)
    {
        //
        //TODO:Assoicate user with company
        //TODO: Assign keywords to this product, so that it is more search able
    }
}
