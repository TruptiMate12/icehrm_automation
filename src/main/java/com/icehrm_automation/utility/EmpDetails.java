package com.icehrm_automation.utility;

public class EmpDetails {
    private double id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String profile;
    private double salary;
    private String company;
    private String city;
    public void setId(double id) {
        this.id = id;
    }
    public double getId() {
        return this.id;
    }
    public void setFirstName(String firstName){
        this.firstName= firstName;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public String getMiddleName() {
        return this.middleName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public void setProfile(String profile) {
        this.profile = profile;
    }
    public String getProfile() {
        return this.profile;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return this.salary;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public String getCompany() {
        return this.company;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getCity() {
        return this.city;
    }
}