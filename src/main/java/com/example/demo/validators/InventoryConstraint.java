package com.example.demo.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Target( {ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = InventoryValidator.class)
public @interface InventoryConstraint{
    String message() default "Inventory is out of bounds";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
