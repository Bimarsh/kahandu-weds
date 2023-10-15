package com.kahandu.weds.domain.company.product;

import com.kahandu.weds.domain.user.User;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.math.BigInteger;
import java.util.List;


@Document
public class Product {

    @Id
    private String id;
    private String packageName;

    private String productType;
    private String packageDetails;

    private  String packageKeywords;

    private Double packageUnitCost;

    private Double packageCostPerHour;

    private Integer numberOfPeople;

    List<String> productKeywords;

    /**
     * external links explaining the package
     */
    private List<String> packageReferences;


    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getPackageDetails() {
        return packageDetails;
    }

    public void setPackageDetails(String packageDetails) {
        this.packageDetails = packageDetails;
    }

    public String getPackageKeywords() {
        return packageKeywords;
    }

    public void setPackageKeywords(String packageKeywords) {
        this.packageKeywords = packageKeywords;
    }

    public Double getPackageUnitCost() {
        return packageUnitCost;
    }

    public void setPackageUnitCost(Double packageUnitCost) {
        this.packageUnitCost = packageUnitCost;
    }

    public Double getPackageCostPerHour() {
        return packageCostPerHour;
    }

    public void setPackageCostPerHour(Double packageCostPerHour) {
        this.packageCostPerHour = packageCostPerHour;
    }

    public Integer getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(Integer numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public List<String> getPackageReferences() {
        return packageReferences;
    }

    public void setPackageReferences(List<String> packageReferences) {
        this.packageReferences = packageReferences;
    }


    public List<String> getProductKeywords() {
        return productKeywords;
    }

    public void setProductKeywords(List<String> productKeywords) {
        this.productKeywords = productKeywords;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }
}
