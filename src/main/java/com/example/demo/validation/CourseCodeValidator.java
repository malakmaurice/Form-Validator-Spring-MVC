package com.example.demo.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeValidator implements ConstraintValidator<CourseCode,String> {
    private String prefix;

    @Override
    public void initialize(CourseCode theCourseCode) {
        prefix=theCourseCode.value();
    }

    @Override
    public boolean isValid(String inputFromForm, ConstraintValidatorContext constraintValidatorContext) {
        boolean result;
        if(inputFromForm!=null)
              result=inputFromForm.startsWith(prefix);
        else
            result=true;
        return result;
    }
}
