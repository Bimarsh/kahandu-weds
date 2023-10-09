package com.kahandu.weds.domain.user;

import com.kahandu.weds.domain.company.Company;
import com.kahandu.weds.domain.company.product.Product;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Document
public class User {

    @Id
    private String id;
    private String firstName;
    private String lastName;

    private String anonymusName;

    private List<String> hobbies;

    private String keywords;

    private String profession;

    private Integer rating;

    @Field("email")
    @Indexed(unique = true)
    private String email;

    private List<Product> userProductList;

    private List<Company> companies;

    private List<Roles> roles;


    List<String> subscriptions = new ArrayList<>();


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAnonymusName() {
        return anonymusName;
    }

    public void setAnonymusName(String anonymusName) {
        this.anonymusName = anonymusName;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Company> getCompanies() {
        return companies;
    }

    public void setCompanies(List<Company> companies) {
        this.companies = companies;
    }


    public List<Roles> getRoles() {
        return roles;
    }

    public void setRoles(List<Roles> roles) {
        this.roles = roles;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }


    public List<String> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<String> subscriptions) {
        this.subscriptions = subscriptions;
    }

    public List<Product> getUserProductList() {
        return userProductList;
    }

    public void setUserProductList(List<Product> userProductList) {
        this.userProductList = userProductList;
    }
}
