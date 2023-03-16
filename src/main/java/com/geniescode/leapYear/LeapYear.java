package com.geniescode.leapYear;

import com.geniescode.share.menu.CreateMenu;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static com.geniescode.share.Separators.minusSeparator;

public class LeapYear extends CreateMenu {
    public LeapYear() {
        System.out.println(getMenuSting());
        Integer[] array = getUserInput();
        int minimumYear = Math.min(array[0], array[1]);
        int maximumYear = Math.max(array[0], array[1]);

        List<Integer> leapYearList = getList(minimumYear, maximumYear);
        System.out.println("\nRESULT: \nList of leap years between " + minimumYear + " and " + maximumYear + ": " + leapYearList);
    }

    private List<Integer> getList(Integer minimum, Integer maximum) {
        List<Integer> list = new ArrayList<>();

        while (!Objects.equals(minimum, maximum)) {
            if (minimum % 4 == 0)
                list.add(minimum);
            minimum++;
        }
        return list;
    }

    protected Integer[] getUserInput() {
        Integer[] array = new Integer[2];

        System.out.print("\nINPUT: \nEnter the first year: ");
        array[0] = userInput.nextInt();
        System.out.print("Enter the second year: ");
        array[1] = userInput.nextInt();

        return array;
    }

    @Override
    protected String getMenuSting() {
        return minusSeparator
                + "\n\t\t\t\tFunction that find leap years between two years"
                + minusSeparator;
    }
}
