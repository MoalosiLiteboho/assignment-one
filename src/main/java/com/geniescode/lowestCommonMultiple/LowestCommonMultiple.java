package com.geniescode.lowestCommonMultiple;

import com.geniescode.share.menu.CreateMenu;

import static com.geniescode.share.Separators.minusSeparator;

public class LowestCommonMultiple extends CreateMenu {
    public LowestCommonMultiple() {
        System.out.println(getMenuSting());
        Integer[] array = getUserInput();
        Integer theLowestCommonMultiple = findTheLowestCommonMultiple(array[0], array[1]);
        System.out.println("\nRESULTS: \nThe LCM of " + array[0] + " and " + array[1] + " is: " + theLowestCommonMultiple);
    }

    private Integer findTheLowestCommonMultiple(Integer numberOne, Integer numberTwo) {
        int lowestCommonMultiple = Math.max(numberOne, numberTwo);
        while (lowestCommonMultiple % numberOne != 0 || lowestCommonMultiple % numberTwo != 0) lowestCommonMultiple++;
        return lowestCommonMultiple;
    }

    private Integer[] getUserInput() {
        Integer[] array = new Integer[2];

        System.out.print("INPUT: \nEnter the first number: ");
        array[0] = userInput.nextInt();
        System.out.print("Enter the second number: ");
        array[1] = userInput.nextInt();

        return array;
    }

    @Override
    protected String getMenuSting() {
        return minusSeparator + "\n\t Function that find the Lowest Common Multiple of Two Numbers(LCM)" + minusSeparator;
    }
}
