package com.kodilla.hibernate.manytomany;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
//SQL Query
@NamedNativeQuery(
        //Could be changed to just compare two substrings (would be better), but well, exercise didn't specify that
        name = "Company.retrieveCompaniesWithMatchingNames",
        query = "SELECT * FROM COMPANIES" +
                " WHERE  SUBSTRING(company_name, 1, 3) = :COMPANYNAME",
        resultClass = Company.class
)
@NamedNativeQuery(
        name = "Company.retrieveSimilarNames",
        query = "SELECT * FROM COMPANIES WHERE company_name LIKE CONCAT('%',:COMPANYNAME,'%')",
        resultClass = Company.class
)
@Entity
@Table(name = "COMPANIES")
public class Company {
    private int id;
    private String name;
    private List<Employee> employees = new ArrayList<>();

    public Company() {
    }

    public Company(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "COMPANY_ID", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "COMPANY_NAME")
    public String getName() {
        return name;
    }

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "companies")
    public List<Employee> getEmployees() {
        return employees;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}