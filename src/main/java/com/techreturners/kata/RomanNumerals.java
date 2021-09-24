package com.techreturners.kata;

public class RomanNumerals {

    public String getRomanLiteral(int number) {

        //Validate the input for under 3000 and throw an exception
        if (number > 3000){
            try {
                throw new Exception("input number should not be greater than 3000");

            } catch (Exception e){
                    return e.getMessage();
            }
        }

        String[] onesArray = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String[] tensArray = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String[] hundredsArray = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String[] thousandsArray = {"","M","MM","MMM"};
        // roman literals stored in arrays
        //we can retrieve them with index

        //we can divide the input number and do a modulus to get the times
        //3251
        // divide by 1000 and we can get 3...we need MMM in roman
        // divide by 100 and % 10 to get 2 times C
        // divide by 10 and % 10 to 5 times X, L
        // modulus by 10 to get ones i.e. I etc

        String result = "";

        result +=thousandsArray[(number/1000)%10];
        result +=hundredsArray[(number/100)%10];
        result +=tensArray[(number/10)%10];
        result += onesArray[number%10];


        return result;
    }
}
