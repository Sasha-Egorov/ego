package com.egorov.homeworks.homework06;

public class FractionNumber implements Fraction{
    private int numerator;
    private int denominator;

    public FractionNumber(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    @Override
    public String toString() {
        return " " +
                +numerator +
                "/" +
                +denominator;
    }

    public FractionNumber plus(FractionNumber numb) {

        numb.numerator = this.numerator * numb.denominator + this.denominator * numb.numerator;
        numb.denominator = numb.denominator * this.denominator;

        for (int i = 2; i < numb.denominator; i++) {
            if (numb.numerator % i == 0 && numb.denominator % i == 0) {
                numb.numerator = numb.numerator / i;
                numb.denominator = numb.denominator / i;
                i = 1;
            }
        }
        FractionNumber result = new FractionNumber(numb.numerator, numb.denominator);
        return result;

    }

    public FractionNumber minus(FractionNumber numb) {

        numb.numerator = numb.numerator * this.denominator - numb.denominator * this.numerator;
        numb.denominator = numb.denominator * this.denominator;

        for (int i = 2; i < numb.denominator; i++) {
            if (numb.numerator % i == 0 && numb.denominator % i == 0) {
                numb.numerator = numb.numerator / i;
                numb.denominator = numb.denominator / i;
                i = 1;
            }
        }
        FractionNumber result = new FractionNumber(numb.numerator, numb.denominator);
        return result;

    }

    public FractionNumber multiply(FractionNumber numb) {

        numb.numerator = numb.numerator * this.numerator;
        numb.denominator = numb.denominator * this.denominator;

        for (int i = 2; i < numb.denominator; i++) {
            if (numb.numerator % i == 0 && numb.denominator % i == 0) {
                numb.numerator = numb.numerator / i;
                numb.denominator = numb.denominator / i;
                i = 1;
            }
        }
        FractionNumber result = new FractionNumber(numb.numerator, numb.denominator);
        return result;

    }

    public FractionNumber divide(FractionNumber numb) {
        int b=numb.denominator * this.numerator;
        numb.denominator = numb.numerator * this.denominator;
        numb.numerator = b;


        for (int i = 2; i < numb.denominator; i++) {
            if (numb.numerator % i == 0 && numb.denominator % i == 0) {
                numb.numerator = numb.numerator / i;
                numb.denominator = numb.denominator / i;
                i = 1;
            }
        }
        FractionNumber result = new FractionNumber(numb.numerator, numb.denominator);
        return result;

    }
}
