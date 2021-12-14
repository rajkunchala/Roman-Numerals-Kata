package com.techreturners.kata.test;
import com.techreturners.kata.RomanNumerals;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralsTest {

    private RomanNumerals roman;
    @Before
    public void setUpTests(){

        roman = new RomanNumerals();
    }


    @Test
    public void checkRomanLiteralForNumberBelowTen(){
        //Arrange

        //Act
        String result = roman.getRomanLiteral(5);
        //Assert
        assertEquals("V", result);
    }

    @Test
    public void checkRomanLiteralForNumberBelowHundred(){

        String result = roman.getRomanLiteral(55);
        assertEquals("LV", result);
    }

    @Test
    public void checkRomanLiteralForNumberBelowThousand(){

        String result = roman.getRomanLiteral(550);
        assertEquals("DL", result);
    }

    @Test
    public void checkRomanLiteralForNumberInThousands(){

        String result = roman.getRomanLiteral(2650);
        assertEquals("MMDCL", result);
    }

    @Test
    public void checkRomanLiteralForNumberGreaterThan3000(){

        String expected = "input number should not be greater than 3000";
        assertEquals(expected, roman.getRomanLiteral(4000));
    }

    @Test
    public void checkRomanLiteralForNumberEqualTo3000(){

        String expected = "MMM";
        assertEquals(expected, roman.getRomanLiteral(3000));
    }

    @Test
    public void checkRomanLiteralForNumberEqualTo3001(){

        String expected = "input number should not be greater than 3000";
        assertEquals(expected, roman.getRomanLiteral(3001));
    }
}
