package com.egorov.homeworks.homework17;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BraceValidatorTest {
    private BraceValidator checker = new BraceValidator();

    @Test
    public void testValid() {
        assertEquals(true, checker.isValid("()"));
        assertEquals(true, checker.isValid("[]"));
        assertEquals(true, checker.isValid("{}"));
        assertEquals(true, checker.isValid("(){}[]"));
        assertEquals(true, checker.isValid("([{}])"));
        assertEquals(true, checker.isValid("({})[({})]"));
        assertEquals(true, checker.isValid("(({{[[]]}}))"));
        assertEquals(true, checker.isValid("{}({})[]"));
    }

    @Test
    public void testInvalid() throws Exception {
        assertEquals(false, checker.isValid("[(])"));
        assertEquals(false, checker.isValid("(}"));
        assertEquals(false, checker.isValid("(})"));
        assertEquals(false, checker.isValid(")(}{]["));
        assertEquals(false, checker.isValid("())({}}{()][]["));
        assertEquals(false, checker.isValid("(((({{"));
        assertEquals(false, checker.isValid("}}]]))}])"));
    }

}