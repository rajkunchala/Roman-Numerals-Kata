package com.techreturners.kata.test;
import com.techreturners.kata.RomanNumerals;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralsTest {

    @Test

    public void checkRomanLiteralForNumberBelowTen(){
        //Arrange
        RomanNumerals roman = new RomanNumerals();
        //Act
        String result = roman.getRomanLiteral(5);
        //Assert
        assertEquals("V", result);
    }

    @Test

    public void checkRomanLiteralForNumberBelowHundred(){

        RomanNumerals roman = new RomanNumerals();
        String result = roman.getRomanLiteral(55);
        assertEquals("LV", result);
    }
    public void checkRomanLiteralForNumberBelowThousand(){

        RomanNumerals roman = new RomanNumerals();
        String result = roman.getRomanLiteral(550);
        assertEquals("DL", result);
    }

    @Test
    public void checkRomanLiteralForNumberInThousands(){

        RomanNumerals roman = new RomanNumerals();
        String result = roman.getRomanLiteral(2650);
        assertEquals("MMDCL", result);
    }

}
