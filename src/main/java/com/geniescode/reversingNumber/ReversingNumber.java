package com.geniescode.reversingNumber;

import com.geniescode.share.menu.CreateMenu;

import static com.geniescode.share.Separators.minusSeparator;

public class ReversingNumber extends CreateMenu {
    private static final int TEN = 10;

    public ReversingNumber() {
        System.out.println(getMenuSting());
        int number = getUserInput();
        Integer reversedNumber = getReversedNumber(number, String.valueOf(number).length());
        System.out.println("\nRESULTS: \nThis number  " + number + " in reversed form: " + reversedNumber);
    }

    private Integer getReversedNumber(Integer number, Integer numberLength) {
        int reminder, reversedNumber = 0;
        while (numberLength != 0) {
            reminder = number % TEN;
            reversedNumber = (reversedNumber * TEN) + reminder;
            number /= 10;
            numberLength--;
        }
        return reversedNumber;
    }

    private Integer getUserInput() {
        System.out.print("INPUT: \nEnter the number you want to reverse: ");
        return userInput.nextInt();
    }

    @Override
    protected String getMenuSting() {
        return minusSeparator
                + "\n\t\t\t\t\t\tFunction that reverse the Number"
                + minusSeparator;
    }
}
