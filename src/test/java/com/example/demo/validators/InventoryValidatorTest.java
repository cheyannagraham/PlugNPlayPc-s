package com.example.demo.validators;

import com.example.demo.domain.InhousePart;
import org.hibernate.validator.internal.engine.constraintvalidation.ConstraintValidatorContextImpl;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import javax.validation.ConstraintValidatorContext;

import static org.junit.jupiter.api.Assertions.*;

class InventoryValidatorTest {
    InventoryValidator IV = new InventoryValidator();
    InhousePart part = new InhousePart();
    ConstraintValidatorContext ctx = Mockito.mock(ConstraintValidatorContextImpl.class, Mockito.RETURNS_DEEP_STUBS);

    @Test
    void testInventoryInvalidAboveMax() {
        part.setMaxInv(4);
        part.setInv(6);
        assertFalse(IV.isValid(part, ctx));
    }

    @Test
    void testInventoryInvalidBelowMin() {
        part.setMinInv(4);
        part.setInv(2);
        assertFalse(IV.isValid(part, ctx));
    }

    @Test
    void testInventoryBetweenMinimumAndMaximum() {
        part.setMaxInv(4);
        part.setMinInv(2);
        part.setInv(3);
        assertTrue(IV.isValid(part, ctx));

        part.setInv(2);
        assertTrue(IV.isValid(part, ctx));

        part.setInv(4);
        assertTrue(IV.isValid(part, ctx));
    }
}

