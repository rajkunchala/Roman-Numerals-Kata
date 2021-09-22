package com.techreturners.kata.test;
import com.techreturners.kata.RomanNumerals;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralsTest {

    @Test
    public void checkRomanNumeralForNumberUnderTen(){
        //Arrange
        RomanNumerals roman = new RomanNumerals();

        //Act
        String romanLiteral = roman.getRomanLiteralForNumber(10);

        //Assert
        assertEquals("Failure - the strings are not equal","X",romanLiteral);


    }
}
