package com.example.demo.validators;

import com.example.demo.domain.Part;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class InventoryValidator implements ConstraintValidator<InventoryConstraint, Part> {
    @Override
    public void initialize(InventoryConstraint constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Part part, ConstraintValidatorContext constraintValidatorContext) {
        int inv = part.getInv();
        int minInv = part.getMinInv();
        int maxInv = part.getMaxInv();

        if (maxInv < minInv) {
            constraintValidatorContext
                    .buildConstraintViolationWithTemplate("Maximum Inventory cannot be less than Minimum Inventory")
                    .addPropertyNode("maxInv")
                    .addConstraintViolation();
            return false;
        }
        if (inv < minInv || inv > maxInv) {
            constraintValidatorContext
                    .buildConstraintViolationWithTemplate(String.format("Error: Inventory must be between %s and %s", part.getMinInv(), part.getMaxInv()))
                    .addPropertyNode("inv")
                    .addConstraintViolation();
            return false;
        } else return true;
    }
}
