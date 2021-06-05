package com.HW_25_TTD;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralsTest {
    RomanNumerals number = new RomanNumerals();
    @Test
    public void testIntToRoman_I()
    {
        assertEquals("I", number.solution(1));
    }

    @Test
    public void testIntToRoman_V()
    {
        assertEquals("V", number.solution(5));
    }

    @Test
    public void testIntToRoman_VI()
    {
        assertEquals("VI", number.solution(6));
    }

    @Test
    public void testIntToRoman_VII()
    {
        assertEquals("VII", number.solution(7));
    }

    @Test
    public void testIntToRoman_VIII()
    {
        assertEquals("VIII", number.solution(8));
    }

    @Test
    public void testIntToRoman_XXIII()
    {
        assertEquals("XXIII", number.solution(23));
    }

    @Test
    public void testIntToRoman_CXC()
    {
        assertEquals("CXCII",  number.solution(192));
    }

    @Test
    public void testIntToRoman_DLIV()
    {
        assertEquals("DLIV",  number.solution(554));
    }

    @Test
    public void testIntToRoman_CMXLIX()
    {
        assertEquals("CMXLIX",  number.solution(949));
    }

    @Test
    public void testIntToRoman_MCDXCII()
    {
        assertEquals("MCDXCII", number.solution(1492));
    }
}