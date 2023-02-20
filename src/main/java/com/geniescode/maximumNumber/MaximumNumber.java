package com.geniescode.maximumNumber;

import com.geniescode.share.menu.CreateMenu;

import java.util.ArrayList;
import java.util.List;

import static com.geniescode.share.Separators.minusSeparator;

public class MaximumNumber extends CreateMenu {
    public MaximumNumber() {
        System.out.println(getMenuSting());
        List<Integer> list = getUserInput();

        int maximumNumber = list.stream()
                .mapToInt(value -> value)
                .max()
                .orElse(-1);

        System.out.println("\nRESULT: \nThe maximum number if the bellow list is: " + maximumNumber +
                "\nList: " + list);
    }

    List<Integer> getUserInput() {
        List<Integer> list = new ArrayList<>();

        System.out.print("Enter the number of values you want to enter to find the maximum value: ");
        int number = userInput.nextInt();

        System.out.println("\nINPUT VALUES:");

        for (int index = 0; index < number; index++) {
            System.out.print("Enter the value: ");
            int value = userInput.nextInt();
            list.add(value);
        }
        return list;
    }

    @Override
    protected String getMenuSting() {
        return "\n" + minusSeparator + "\n\t\t\t\t\t\tFunction that find Maximum Number" + minusSeparator;
    }
}
