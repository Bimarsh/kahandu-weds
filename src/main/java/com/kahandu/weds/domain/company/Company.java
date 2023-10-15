package com.kahandu.weds.domain.company;

import com.kahandu.weds.domain.company.product.Product;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigInteger;
import java.util.List;


@Document
public class Company {

    @Id
    private String id;
    @Field("name")
    @Indexed(unique = true,sparse = true)
    private String name;

    private String address;

    /**
     * //TODO: Make this enum
     */
    private String serviceType;


    private List<Product> companyPackages;

    private List<String> companyKeywords;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }


    public List<Product> getCompanyPackages() {
        return companyPackages;
    }

    public void setCompanyPackages(List<Product> companyPackages) {
        this.companyPackages = companyPackages;
    }


    public List<String> getCompanyKeywords() {
        return companyKeywords;
    }

    public void setCompanyKeywords(List<String> companyKeywords) {
        this.companyKeywords = companyKeywords;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
