package ch.zhaw.iwi.devops.romannumerals;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RomanNumeralsConverterTest {
        
    @Test
    public void romannumeralsConverter1() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("I",romanNumeralsConverter.convertToRoman(1));
    }

    @Test
    public void romannumeralsConverter2() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("II",romanNumeralsConverter.convertToRoman(2));
    }

    @Test
    public void romannumeralsConverter3() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("III",romanNumeralsConverter.convertToRoman(3));
    }
    @Test
    public void romannumeralsConverter4() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("IV",romanNumeralsConverter.convertToRoman(4));
    }
    @Test
    public void romannumeralsConverter5() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("V",romanNumeralsConverter.convertToRoman(5));
    }
    @Test
    public void romannumeralsConverter9() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("IX",romanNumeralsConverter.convertToRoman(9));
    }
    @Test
    public void romannumeralsConverterMultipleNumbers() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("CMXCIX",romanNumeralsConverter.convertToRoman(999));
        assertEquals("MV",romanNumeralsConverter.convertToRoman(1005));
        assertEquals("CCC",romanNumeralsConverter.convertToRoman(300));
    }
    @Test
    public void romannumeralsConverter21() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("XXI",romanNumeralsConverter.convertToRoman(21));
    }
    @Test
    public void romannumeralsConverter50() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("L",romanNumeralsConverter.convertToRoman(50));
    }

}
