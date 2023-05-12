package com.geniescode.share.menu;

import com.geniescode.leapYear.LeapYear;
import com.geniescode.lowestCommonMultiple.LowestCommonMultiple;
import com.geniescode.maximumNumber.MaximumNumber;
import com.geniescode.reversingNumber.ReversingNumber;

import static com.geniescode.share.Separators.endSeparator;
import static com.geniescode.share.Separators.equalSeparator;

public class Menu extends CreateMenu {
    public Menu() {
        showMenu();
    }

    private void showMenu() {
        while (true){
            System.out.print(getMenuSting());
            int choice = userInput.nextInt();

            if (choice == 0) break;
            else if (choice == 1) new MaximumNumber();
            else if (choice == 2) new LowestCommonMultiple();
            else if (choice == 3) new LeapYear();
            else if (choice == 4) new ReversingNumber();
            else System.out.println("Entered choice is INVALID \nPlease try again!");
        }
        System.out.println(equalSeparator + endSeparator + equalSeparator);
    }

    @Override
    protected String getMenuSting() {
        return equalSeparator
                + "\n\t\t\t\t\t\t\t\t\tMENU"
                + equalSeparator
                + "\n0.Exit \n1.Find Maximum Number \n2.Find Lowest Common Multiple \n3.Find Leap Year \n4.Reversing Integer \nChoice -> ";
    }
}
