package com.egorov.homeworks.homework06;

public interface Fraction {
    int getDenominator();
     int getNumerator() ;

    Fraction plus(Fraction other);

    Fraction minus(Fraction other);

    Fraction multiply(Fraction other);

    Fraction divide(Fraction other);

}

