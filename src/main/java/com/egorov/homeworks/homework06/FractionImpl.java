package com.egorov.homeworks.homework06;

import java.util.Objects;

public class FractionImpl implements Fraction {
    private int numerator;
    private int denominator;

    @Override
    public int getNumerator() {
        return numerator;
    }

    @Override
    public int getDenominator() {
        return denominator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FractionImpl fraction = (FractionImpl) o;
        return numerator == fraction.numerator && denominator == fraction.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    public FractionImpl(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator can't be '0'");
        }
        for (int i = 2; i <= denominator; i++) {
            if (numerator % i == 0 && denominator % i == 0) {
                numerator = numerator / i;
                denominator = denominator / i;
                i = 2;
            }
        }

        this.numerator = numerator;
        this.denominator = denominator;
    }


    @Override
    public Fraction plus(Fraction other) {
        int numerator = this.numerator * other.getDenominator() + this.denominator * other.getNumerator();
        int denominator = other.getDenominator() * this.denominator;

        return new FractionImpl(numerator, denominator);

    }

    @Override
    public Fraction minus(Fraction other) {
        int numerator = other.getDenominator() * this.numerator - other.getNumerator() * this.denominator;
        int denominator = other.getDenominator() * this.denominator;

        return new FractionImpl(numerator, denominator);
    }

    @Override
    public Fraction multiply(Fraction other) {
        int numerator = other.getNumerator() * this.numerator;
        int denominator = other.getDenominator() * this.denominator;

        return new FractionImpl(numerator, denominator);

    }

    @Override
    public Fraction divide(Fraction other) {
        int numerator = other.getDenominator() * this.numerator;
        int denominator = other.getNumerator() * this.denominator;

        return new FractionImpl(numerator, denominator);
    }
}
