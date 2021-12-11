package com.example.demo;

import java.util.LinkedHashMap;

public class Student {
    private String first;
    private String lastName;
    private String country;
    private String favLang;
    private LinkedHashMap<String,String> countryOption;
    private String[] operatingSystem;

    public Student() {
        countryOption=new LinkedHashMap<>();
            countryOption.put("DR","BRAZIL");
            countryOption.put("GA","GERMAN");
            countryOption.put("US","UNITED SATES");
    }

    public String getFirstName() {
        return first;
    }

    public void setFirstName(String firstName) {
        this.first = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCoun() {
        return country;
    }

    public void setCoun(String country) {
        this.country = country;
    }

    public LinkedHashMap<String, String> getCountryOption() {
        return countryOption;
    }

    public String getFavLang() {
        return favLang;
    }

    public void setFavLang(String favLang) {
        this.favLang = favLang;
    }

    public String[] getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String[] operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
}
