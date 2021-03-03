package com.egorov.homeworks.homework16;

import org.junit.jupiter.api.Assertions;


class FractionTest {
    private static Fraction fraction1 = new Fraction(1, 3);
    private static Fraction fraction2 = new Fraction(2, 3);
    private static Fraction fraction3 = new Fraction(3, 4);

    @MyTest
    public static void badFractionCreation() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Fraction(1, 0));
    }

    @MyTest
    public static void testEquals() {
        Assertions.assertEquals(new Fraction(1, 3), fraction1);
        Assertions.assertNotEquals(fraction2, fraction1);
        Assertions.assertEquals(new Fraction(3, 9), fraction1);
        Assertions.assertEquals(new Fraction(3, 1), new Fraction(9, 3));
    }

    @MyTest
    public static void testPlusWithTheSameDenominator() {
        Fraction result = fraction1.plus(fraction2);
        Assertions.assertEquals(new Fraction(3, 3), result);
        Assertions.assertEquals(new Fraction(1, 1), result);
    }

    @MyTest
    public static void testPlusWithNotTheSameDenominator() {
        Fraction result = fraction1.plus(fraction3);
        Assertions.assertEquals(new Fraction(13, 12), result);
    }

    @MyTest
    public static void minus() {
        Fraction result = fraction2.minus(fraction1);
        Assertions.assertEquals(new Fraction(1, 3), result);

    }

    @MyTest
    public static void multiply() {
        Fraction result = fraction1.multiply(fraction3);
        Assertions.assertEquals(new Fraction(1, 123144), result);

    }

    @MyTest
    public static void divide() {
        Fraction result = fraction1.divide(fraction2);
        Assertions.assertEquals(new Fraction(3, 6), result);

    }
}

