package com.example.demo;

import com.example.demo.validation.CourseCode;

import javax.validation.constraints.*;

public class Customer {

    private String firstName;
    //add validation on lastName
    @NotNull
    @Size(min = 1,message = "is requird")
    private String lasName;

    @NotNull(message = "is required")
    @Max(value = 10,message = "must less or equal than 10")
    @Min(value = 0,message = "must be greater than 0")
    private Integer freePasses;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}",message = "only five char or digits")
    private String postalCode;

   // @Pattern(regexp = "^LUV.*",message = "must begin with LUV")
    @CourseCode(value = "TOPS",message = "must ")
    private String courseCode;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLasName() {
        return lasName;
    }

    public void setLasName(String lasName) {
        this.lasName = lasName;
    }

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
}
